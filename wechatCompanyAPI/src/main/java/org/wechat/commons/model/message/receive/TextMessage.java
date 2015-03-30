package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.ReceiveMessage;

/**
 * 
 * @Title: TextMessage.java
 * @Package org.wechat.commons.model
 * @Description: 文本消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:29:36
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class TextMessage extends ReceiveMessage{

	private String Content;//文本消息内容

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
