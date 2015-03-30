package org.wechat.commons.model.organization.tag;

import java.io.Serializable;

/**
 * 
 * @Title: Tag.java
 * @Package org.wechat.organization.tag.model
 * @Description: 标签
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午10:35:07
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class Tag implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String tagid;//标签ID
	
	private String tagname;//标签名称。最长64个字符
	
	private String userlist;//企业员工ID列表

	public String getTagid() {
		return tagid;
	}

	public void setTagid(String tagid) {
		this.tagid = tagid;
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public String getUserlist() {
		return userlist;
	}

	public void setUserlist(String userlist) {
		this.userlist = userlist;
	}
}
