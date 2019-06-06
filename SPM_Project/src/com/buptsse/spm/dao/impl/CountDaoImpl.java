package com.buptsse.spm.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections.ListUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.buptsse.spm.dao.ICountDao;
import com.buptsse.spm.domain.Count;
import com.buptsse.spm.domain.User;


/**
 * 模块统计数据层操作实现
 * @author ljh
 *
 */

@Repository
public class CountDaoImpl extends BaseDAOImpl<Count> implements ICountDao{

	/* (non-Javadoc)
	 * @see com.buptsse.spm.dao.IBaseDAO#find(java.lang.String, java.lang.Object[])
	 */
	@Override
	public List<Count> find(String hql, Count[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.buptsse.spm.dao.IBaseDAO#get(java.lang.String, java.lang.Object[])
	 */
	@Override
	public Count get(String hql, Count[] param) {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.buptsse.spm.dao.IBaseDAO#executeHql(java.lang.String, java.lang.Object[])
	 */
	@Override
	public Integer executeHql(String hql, Count[] param) {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see com.buptsse.spm.dao.ICountDao#findAllCount()
	 */
	@Override
	public List<Count> findAllCount(String hql) {
		// TODO Auto-generated method stub
		return super.find(hql);
	}


	/* (non-Javadoc)
	 * @see com.buptsse.spm.dao.ICountDao#addCount(com.buptsse.spm.domain.Count)
	 */
	@Override
	public boolean saveCount(Count count) {
		// TODO Auto-generated method stub
		try {
			super.save(count);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Long count(String hql, Count[] param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Count> findCount(String hql) {
		// TODO Auto-generated method stub
		return super.find(hql);
	}

	@Override
	public boolean updateCount(Count count) {
		// TODO Auto-generated method stub
		try {
			super.update(count);
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
		return insertCount(count);
	}
	
	@Override
	public boolean insertCount(Count count) {
		try {
			super.save(count);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	

	
}
