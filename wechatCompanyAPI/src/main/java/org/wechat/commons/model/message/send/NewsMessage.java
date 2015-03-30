package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSend;

/**
 * 
 * @Title: NewsMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 图文消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 上午11:14:29
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class NewsMessage extends BaseMessageSend{

	private News news;
	
	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	class News{
		private Articles articles;
		
		public Articles getArticles() {
			return articles;
		}

		public void setArticles(Articles articles) {
			this.articles = articles;
		}

		class Articles{
			private String title;//标题
			
			private String description;//描述
			
			private String url;//点击后跳转的链接。企业可根据url里面带的code参数校验员工的真实身份。具体参考“9 微信页面跳转员工身份查询”
			
			private String picurl;//图文消息的图片链接，支持JPG、PNG格式，较好的效果为大图640*320，小图80*80。如不填，在客户端不显示图片

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

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getPicurl() {
				return picurl;
			}

			public void setPicurl(String picurl) {
				this.picurl = picurl;
			}
		}
	}
}
