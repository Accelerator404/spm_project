package com.buptsse.spm.action;

import java.io.PrintWriter;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.buptsse.spm.domain.Count;
import com.buptsse.spm.domain.User;
import com.buptsse.spm.service.ICountService;
import com.buptsse.spm.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新增功能，统计模块访问次数
 * @author ljh
 *
 */
public class CountAction extends ActionSupport{
	private static Logger LOG = LoggerFactory.getLogger(CountAction.class);  //获取日志
	
	
	
	@Resource
	private ICountService countService;
	
	@Resource
	private IUserService iUserService;
	
	/**
	 * 通过count对象获取各模块执行次数
	 *
	 */
	
	public String getCountInfo() {
		System.out.println("##################开始获取模块访问次数#################");
		String uid = ServletActionContext.getRequest().getParameter("uid");
		System.out.println(uid);
		Map<String, Integer> allUserMap = new HashMap<String, Integer>();
		if (uid.equals("")) {
			//取全部用户访问次数,去数据库获取mid对应的count
			allUserMap.clear();
			allUserMap = countService.countAllUser();
			String jsonAllUserMap = JSONObject.toJSONString(allUserMap);
			try {
				HttpServletResponse response = ServletActionContext.getResponse();
				PrintWriter out= response.getWriter();
				out.print(jsonAllUserMap);
				out.flush();
				out.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return "success";
		}else {
			allUserMap.clear();
			allUserMap = countService.count(uid);
			String jsonUserMap = JSONObject.toJSONString(allUserMap);
			try {
				HttpServletResponse response = ServletActionContext.getResponse();
				PrintWriter out= response.getWriter();
				out.print(jsonUserMap);
				out.flush();
				out.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return "success";
		}
		
	}
	
	/**
	 * @return the iUserService
	 */
	public IUserService getiUserService() {
		return iUserService;
	}

	/**
	 * @param iUserService the iUserService to set
	 */
	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}

	public String saveUserCount() {
		System.out.println("############保存用户点击记录#################");
		String mid = ServletActionContext.getRequest().getParameter("mid");
		String username = ServletActionContext.getRequest().getParameter("username");
		User user = iUserService.findUser(username);
		String id = user.getId();
		System.out.println(id);
		System.out.println(mid);
		Count tempCount = new Count();
		tempCount.setUid(id);
		tempCount.setMid(mid);
		System.out.println("########开始保存到数据库");
		try {
			System.out.println(countService.addCount(tempCount));
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter out= response.getWriter();
			out.print(true);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "success";
		
	}
	
	public String setCountInfo() {
		return null;
	}

	

	/**
	 * @return the countService
	 */
	public ICountService getCountService() {
		return countService;
	}

	/**
	 * @param countService the countService to set
	 */
	public void setCountService(ICountService countService) {
		this.countService = countService;
	}
	
	

}
