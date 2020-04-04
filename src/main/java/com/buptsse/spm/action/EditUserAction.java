package com.buptsse.spm.action;

import java.io.Console;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.buptsse.spm.domain.User;
import com.buptsse.spm.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新增功能，用户新增更多信息
 * @author ljh
 *
 */

public class EditUserAction extends ActionSupport{
	private static Logger Log = LoggerFactory.getLogger(EditUserAction.class);    //获取日志
	
	private User user;
	
	@Resource
	private IUserService userService;
	
	/**
	 * 实现用户信息更新功能
	 */
	
	public String userInfoAdd() {
		System.out.println("###########进行用户信息更新#########");
		String username = ServletActionContext.getRequest().getParameter("userName");
		String nickname = ServletActionContext.getRequest().getParameter("nickname");
		System.out.println(nickname);
		String gender = ServletActionContext.getRequest().getParameter("gender");
		String school = ServletActionContext.getRequest().getParameter("school");
		String identity = ServletActionContext.getRequest().getParameter("identity");
		String maxDegree = ServletActionContext.getRequest().getParameter("maxDegree");
		String selfIntroduction = ServletActionContext.getRequest().getParameter("selfIntroduction");
		try {
			User tempUser = userService.findUser(username);
			tempUser.setNickname(nickname);
			tempUser.setGender(gender);
			tempUser.setIdentity(identity);
			tempUser.setMaxDegree(maxDegree);
			tempUser.setSchool(school);
			tempUser.setSelfIntroduction(selfIntroduction);
			userService.updateUser(tempUser);
			
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
	
	public String getAllUser() {
		System.out.println("########取出全部用户########");
		List<User> list = new ArrayList<User>();
		Map<String, String> map = new HashMap<String, String>();
		try {
			list=userService.findAllUser();
			for (User user : list) {
				map.put(user.getId(), user.getUserName());
			}
			String jsonMap = JSONObject.toJSONString(map);
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter out= response.getWriter();
			out.print(jsonMap);
			out.flush();
			out.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "success";
	}
	
	public String getUserInfo() {
	 String username = ServletActionContext.getRequest().getParameter("userName");
	 System.out.println(username);
	 User user = userService.findUser(username);
	 System.out.println(user.getGender());
	 Map map = new HashMap<String, String>();
	 map.put("nickname", user.getNickname());
	 map.put("gender", user.getGender());
	 map.put("school", user.getSchool());
	 map.put("maxDegree", user.getMaxDegree());
	 map.put("identity", user.getIdentity());
	 map.put("selfIntroduction", user.getSelfIntroduction());
	 String userString = JSONObject.toJSONString(map);
	 System.out.println(userString);
	 try {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter out= response.getWriter();
		out.print(userString);
		out.flush();
		out.close();
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 return "success";
	}

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
