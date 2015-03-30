package org.wechat.commons.model.message.response;

import org.wechat.commons.model.message.BaseMessageResponseMedia;
import org.wechat.commons.model.message.BaseMessageType;

/**
 * 
 * @Title: VideoMessage.java
 * @Package org.wechat.commons.model.response
 * @Description: 视频消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:14:09
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class VideoMessage extends BaseMessageType{

	private Video Video;
	
	
	public Video getVideo() {
		return Video;
	}


	public void setVideo(Video video) {
		Video = video;
	}


	class Video extends BaseMessageResponseMedia{
		
		private String Title;//标题
		
		private String Description;//说明

		public String getTitle() {
			return Title;
		}

		public void setTitle(String title) {
			Title = title;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}
	}
}
