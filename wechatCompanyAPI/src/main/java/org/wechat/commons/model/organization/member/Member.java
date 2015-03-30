package org.wechat.commons.model.organization.member;

import java.io.Serializable;

/**
 * 
 * @Title: Member.java
 * @Package org.wechat.organization.member.model
 * @Description: 成员
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午10:26:28
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class Member implements Serializable{

	private static final long serialVersionUID = 1L;

	private String userid;//员工UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字符
	
	private String name;//成员名称。长度为1~64个字符
	
	private String department;//成员所属部门id列表。注意，每个部门的直属员工上限为1000个
	
	private String position;//职位信息。长度为0~64个字符
	
	private String mobile;//手机号码。企业内必须唯一，mobile/weixinid/email三者不能同时为空
	
	private String gender;//性别。gender=0表示男，=1表示女。默认gender=0
	
	private String tel;//办公电话。长度为0~64个字符
	
	private String email;//邮箱。长度为0~64个字符。企业内必须唯一
	
	private String weixinid;//微信号。企业内必须唯一

	private String enable;//启用/禁用成员。1表示启用成员，0表示禁用成员

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWeixinid() {
		return weixinid;
	}

	public void setWeixinid(String weixinid) {
		this.weixinid = weixinid;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}
}
