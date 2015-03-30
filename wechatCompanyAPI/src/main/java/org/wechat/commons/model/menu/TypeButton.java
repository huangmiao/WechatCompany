package org.wechat.commons.model.menu;

/**
 * 
 * @Title: TypeButton.java
 * @Package org.wechat.commons.model.menu
 * @Description: 类型button
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午12:20:29
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class TypeButton extends Button{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
