package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendMedia;
import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: VideoMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 视频消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 上午11:10:51
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class VideoMessage extends BaseMessageSendSafe{

	private Video video;
	
	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	class Video extends BaseMessageSendMedia{
		
		private String title;
		
		private String description;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}
