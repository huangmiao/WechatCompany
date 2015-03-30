package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.BaseMessageMedia;

/**
 * 
 * @Title: VideoMessage.java
 * @Package org.wechat.commons.model
 * @Description: 视频消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:52:36
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class VideoMessage extends BaseMessageMedia{

	private String ThumbMediaId;//视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
}
