package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.BaseMessageMedia;

/**
 * 
 * @Title: ImageMessage.java
 * @Package org.wechat.commons.model
 * @Description: 图片消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:50:14
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ImageMessage extends BaseMessageMedia{

	private String PicUrl;//图片Url

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
}
