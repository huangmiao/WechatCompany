package org.wechat.commons.model.message.response;

import org.wechat.commons.model.message.BaseMessageType;


/**
 * 
 * @Title: TextMessage.java
 * @Package org.wechat.commons.model.response
 * @Description: 响应文本消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午4:40:54
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class TextMessage extends BaseMessageType{

	private String Content;//文本内容

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
