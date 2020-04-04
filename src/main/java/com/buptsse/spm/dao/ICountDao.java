package com.buptsse.spm.dao;

import java.util.List;

import com.buptsse.spm.domain.Count;
import com.buptsse.spm.domain.Course;

/**
 * 模块数据统计接口定义
 * @author ljh
 *
 */
public interface ICountDao {
	public boolean saveCount(Count count);
	public List<Count> findAllCount(String hql);
	public List<Count> findCount(String hql);
	public boolean updateCount(Count count);
	public boolean addCount(Count count);
	public boolean insertCount(Count count);

}
