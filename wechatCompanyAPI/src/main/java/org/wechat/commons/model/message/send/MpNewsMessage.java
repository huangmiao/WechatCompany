package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendMedia;
import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: MpNewsMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 存储到微信端的媒体消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 上午11:18:58
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class MpNewsMessage extends BaseMessageSendSafe{
	
	private MpNews mpnews;
	
	public MpNews getMpnews() {
		return mpnews;
	}

	public void setMpnews(MpNews mpnews) {
		this.mpnews = mpnews;
	}

	class MpNews extends BaseMessageSendMedia{
		
		private Articles articles;
		
		public Articles getArticles() {
			return articles;
		}

		public void setArticles(Articles articles) {
			this.articles = articles;
		}

		class Articles{
			
			private String thumb_media_id;
			
			private String author;
			
			private String content_source_url;
			
			private String content;
			
			private String digest;
			
			private String show_cover_pic;

			public String getThumb_media_id() {
				return thumb_media_id;
			}

			public void setThumb_media_id(String thumb_media_id) {
				this.thumb_media_id = thumb_media_id;
			}

			public String getAuthor() {
				return author;
			}

			public void setAuthor(String author) {
				this.author = author;
			}

			public String getContent_source_url() {
				return content_source_url;
			}

			public void setContent_source_url(String content_source_url) {
				this.content_source_url = content_source_url;
			}

			public String getContent() {
				return content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getDigest() {
				return digest;
			}

			public void setDigest(String digest) {
				this.digest = digest;
			}

			public String getShow_cover_pic() {
				return show_cover_pic;
			}

			public void setShow_cover_pic(String show_cover_pic) {
				this.show_cover_pic = show_cover_pic;
			}
		}
	}
}
