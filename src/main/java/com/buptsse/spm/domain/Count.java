package com.buptsse.spm.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;



/**
 * click_log表的记录
 * @author ljh
 *
 */
public class Count implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	
	private String mid;
	
	private String uid;
	
	private String click_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the click_time
	 */
	public String getClick_time() {
		return click_time;
	}

	/**
	 * @param click_time the click_time to set
	 */
	public void setClick_time(String click_time) {
		this.click_time = click_time;
	}
	
	
	

	
	
	

}
