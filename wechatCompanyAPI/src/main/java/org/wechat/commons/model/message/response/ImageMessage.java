package org.wechat.commons.model.message.response;

import org.wechat.commons.model.message.BaseMessageResponseMedia;
import org.wechat.commons.model.message.BaseMessageType;

import com.thoughtworks.xstream.XStream;


/**
 * 
 * @Title: ImageMessage.java
 * @Package org.wechat.commons.model.response
 * @Description: 图片消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午4:45:42
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ImageMessage extends BaseMessageType{

	private Image Image;

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}
	
	class Image extends BaseMessageResponseMedia{
		
		public Image(){
			
		}
	}
	
	
	public static void main(String[] args){
		ImageMessage imageMessage = new ImageMessage();
//		ImageMessage.Image image = imageMessage.new Image(); 
//		image.setMediaId("1");
//		imageMessage.setImage(image);
		XStream xtream  = new XStream();
		xtream.alias("xml", imageMessage.getClass());
		String alq = "<xml>"+
   "<ToUserName><![CDATA[toUser]]></ToUserName>"+
   "<FromUserName><![CDATA[fromUser]]></FromUserName>"+
   "<CreateTime>1348831860</CreateTime>"+
   "<MsgType><![CDATA[image]]></MsgType>"+
   "<Image>"+
       "<MediaId><![CDATA[media_id]]></MediaId>"+
   "</Image>"+
"</xml>";
		ImageMessage imageMeg = (ImageMessage)xtream.fromXML(alq);
//		xtream.aliasSystemAttribute(null, "reference");
//		xtream.alias("xml", imageMessage.getClass());
		System.out.println(xtream.toXML(imageMeg));
	}
}
