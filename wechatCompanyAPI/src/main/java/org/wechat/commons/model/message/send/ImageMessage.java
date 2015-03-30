package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendMedia;
import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: ImageMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 图片消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:41:39
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ImageMessage extends BaseMessageSendSafe{

	private Image image;
	
	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	class Image extends BaseMessageSendMedia{
		
	}
}
