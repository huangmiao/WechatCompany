package org.wechat.commons.model.message;


/**
 * 
 * @Title: BaseMessageMedia.java
 * @Package org.wechat.commons.model
 * @Description: 公共消息媒体类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:47:27
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageResponseMedia{

	private String MediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
}
