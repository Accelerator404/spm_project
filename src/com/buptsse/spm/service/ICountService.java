package com.buptsse.spm.service;

import java.util.List;
import java.util.Map;

import com.buptsse.spm.domain.Count;

public interface ICountService {
	public boolean saveCount(Count count);
	public Map<String, Integer> count(String uid);
	public Map<String, Integer> countAllUser();
	public boolean updateCount(Count count);
	public boolean addCount(Count count);

}
