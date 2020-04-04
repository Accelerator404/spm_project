package com.buptsse.spm.domain;

import java.io.Serializable;
/**
 * @author BUPT-TC
 * @date 2015年11月01日 下午2:34
 * @description	User表的信息记录
 * @modify BUPT-TC
 * @modifyDate 
 */
public class User implements Serializable{
	private String id;
	private String userName;
	private String password;
	private String password1;
	private String position;
	private String userId;
	private int videoTime;
	
	//以下为新增的用户信息
	private String nickname;
	private String gender;    //性别
	private String school;    //学校
	private String maxDegree;     //学历
	private String selfIntroduction;  //个人简介
	private String identity;    //身份信息

	public int getVideoTime() {
		return videoTime;
	}

	public void setVideoTime(int videoTime) {
		this.videoTime = videoTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getPassword1() {
		return this.password1;
	}

	public void setPassword1(String password1) {
		this.password1=password1;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position=position;
	}
	
	public void setUserId(String userId){
		this.userId = userId;
	}
	
	public String getUserId(){
		return this.userId;
	}
	
	//新增信息的方法
	//对应个人信息编辑页面

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getMaxDegree() {
		return maxDegree;
	}

	public void setMaxDegree(String maxDegree) {
		this.maxDegree = maxDegree;
	}

	public String getSelfIntroduction() {
		return selfIntroduction;
	}

	public void setSelfIntroduction(String selfIntroduction) {
		this.selfIntroduction = selfIntroduction;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	
	

}
