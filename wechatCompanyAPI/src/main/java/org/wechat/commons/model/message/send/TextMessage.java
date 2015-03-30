package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: TextMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 文本消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:39:03
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class TextMessage extends BaseMessageSendSafe{

	private Text text;
	
	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	class Text{
		
		private String content;

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}
}
