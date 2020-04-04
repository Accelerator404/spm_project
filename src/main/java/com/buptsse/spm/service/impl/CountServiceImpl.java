package com.buptsse.spm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.buptsse.spm.dao.ICountDao;
import com.buptsse.spm.dao.IUserDao;
import com.buptsse.spm.domain.Count;
import com.buptsse.spm.service.ICountService;

/**
 * service 实现类
 * @author ljh
 *
 */
@Transactional
@Service
public class CountServiceImpl implements ICountService {

	
	
	@Resource
	private ICountDao ICountDao;
	
	@Resource
	private IUserDao IUserDao;
	
	//重写以下方法，用hql语句查询


	/* (non-Javadoc)
	 * @see com.buptsse.spm.service.ICountService#saveCount(com.buptsse.spm.domain.Count)
	 */
	@Override
	public boolean saveCount(Count count) {
		// TODO Auto-generated method stub
		//存下用户访问记录，要求有用户ID，访问模块ID(可以为空),访问时间
		try {
			ICountDao.saveCount(count);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	

	/* (non-Javadoc)
	 * @see com.buptsse.spm.service.ICountService#count(java.lang.String)
	 */
	@Override
	public Map<String, Integer> count(String uid) {
		// TODO Auto-generated method stub
		System.out.println("#############进入用户模块统计##############");
		List<Count> countList = new ArrayList<Count>();
		Map<String, Integer> userMap = new HashMap<String, Integer>();
		String hql="from Count where uid="+uid;
//		String[] param = new String[2];
//		param[1]=uid;
		countList = ICountDao.findCount(hql);
		if (countList==null || countList.size()==0) {
			return null;
		}else {
			for (Count count : countList) {
				Integer timesInteger = userMap.get(count.getMid());
				userMap.put(count.getMid(), (timesInteger==null)? 1:timesInteger+1);
			}
			return userMap;
		}
	
	}

	/* (non-Javadoc)
	 * @see com.buptsse.spm.service.ICountService#countAllUser()
	 */
	@Override
	public Map<String, Integer> countAllUser() {
		// TODO Auto-generated method stub
		System.out.println("##############进入全部用户统计############");
		List<Count> countAllList = new ArrayList<Count>();
		Map<String, Integer> allUserMap = new HashMap<String, Integer>();
		String hql = "from Count";
		countAllList = ICountDao.findAllCount(hql);
		if (countAllList==null || countAllList.size()==0) {
			return null;
		}else {
			for (Count count : countAllList) {
				Integer timesInteger = allUserMap.get(count.getMid());
				allUserMap.put(count.getMid(), (timesInteger==null)? 1:timesInteger+1);
			}
			return allUserMap;
		}
	}


	@Override
	public boolean updateCount(Count count) {
		// TODO Auto-generated method stub
		try {
			ICountDao.updateCount(count);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}


	@Override
	public boolean addCount(Count count) {
		// TODO Auto-generated method stub
		try {
			ICountDao.addCount(count);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}


	
	
	

	

}
