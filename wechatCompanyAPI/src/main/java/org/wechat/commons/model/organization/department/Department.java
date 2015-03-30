package org.wechat.commons.model.organization.department;

import java.io.Serializable;

import net.sf.json.JSONObject;

import org.wechat.filter.DefaultJsonConfig;

/**
 * 
 * @Title: Department.java
 * @Package org.wechat.organization.department.model
 * @Description: 部门管理
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月25日 下午5:36:45
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;//部门id
	
	private String name;//部门名称
	
	private String parentid;//父级部门id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
	
	public static void main(String[] args){
		Department department = new Department();
		department.setId("1");
		DefaultJsonConfig json = DefaultJsonConfig.newInstance();
		json.setExcludeValues("id");;
		System.out.println(JSONObject.fromObject(department,json));
	}
}
