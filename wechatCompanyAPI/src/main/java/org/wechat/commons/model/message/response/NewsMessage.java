package org.wechat.commons.model.message.response;

import java.util.List;

import org.wechat.commons.model.message.BaseMessageType;

/**
 * 
 * @Title: NewsMessage.java
 * @Package org.wechat.commons.model.response
 * @Description: 图文消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:18:42
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class NewsMessage extends BaseMessageType{

	private String ArticleCount;//多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
	
	private Articles Articles;
	
	public String getArticleCount() {
		return ArticleCount;
	}


	public void setArticleCount(String articleCount) {
		ArticleCount = articleCount;
	}


	public Articles getArticles() {
		return Articles;
	}


	public void setArticles(Articles articles) {
		Articles = articles;
	}


	class Articles{
		
		private List<Item> item;
		
		public List<Item> getItem() {
			return item;
		}

		public void setItem(List<Item> item) {
			this.item = item;
		}

		class Item{
	
			private String Title;//图文消息标题
			
			private String Description;//图文消息描述
			
			private String PicUrl;//图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
			
			private String url;//点击图文消息跳转链接

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

			public String getPicUrl() {
				return PicUrl;
			}

			public void setPicUrl(String picUrl) {
				PicUrl = picUrl;
			}

			public String getUrl() {
				return url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}
}
