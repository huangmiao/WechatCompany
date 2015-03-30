package org.wechat.commons.model.menu;

/**
 * 
 * @Title: BaseButton.java
 * @Package org.wechat.commons.model.menu
 * @Description: 基础button
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午12:17:11
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class BaseClickOrViewButton extends TypeButton{

	private String key;//菜单KEY值，用于消息接口推送，不超过128字节

	private String url;//链接

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
