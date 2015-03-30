package org.wechat.commons.model.message;


/**
 * 
 * @Title: MediaMessage.java
 * @Package org.wechat.commons.model.receive
 * @Description: 媒体消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午4:25:30
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageMedia extends ReceiveMessage{

	private String MediaId;//图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
}
