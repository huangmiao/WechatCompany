package org.wechat.commons.model.message;

/**
 * 
 * @Title: BaseMessageSendMedia.java
 * @Package org.wechat.commons.model
 * @Description: 公共发送媒体消息类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:37:02
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageSendMedia {

	private String media_id;//多媒体id

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
}
