package org.wechat.commons.utils;

import org.wechat.commons.expand.CdataXstream;
import org.wechat.commons.model.message.response.ImageMessage;
import org.wechat.commons.model.message.response.NewsMessage;
import org.wechat.commons.model.message.response.TextMessage;
import org.wechat.commons.model.message.response.VideoMessage;
import org.wechat.commons.model.message.response.VoiceMessage;


/**
 * 
 * @Title: ResponseMessageUtils.java
 * @Package org.wechat.commons.utils
 * @Description: 响应消息模版工具类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午2:42:05
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ResponseMessageUtils extends CdataXstream{
	
	
	/**
	 * 
	 * @Title: textMessageToXml
	 * @Description: 返回文本消息对象转XML
	 * @param textMessage
	 * @return    
	 * @throws
	 */
	public static String textMessageToXml(TextMessage textMessage){
		cdataXstream.alias("xml", textMessage.getClass());
		return cdataXstream.toXML(textMessage);
	}
	
	/**
	 * 
	 * @Title: imageMessageToXml
	 * @Description: 返回图片消息对象转XML
	 * @param imageMessage
	 * @return    
	 * @throws
	 */
	public static String imageMessageToXml(ImageMessage imageMessage){
		cdataXstream.alias("xml", imageMessage.getClass());
		return cdataXstream.toXML(imageMessage);
	}
	
	/**
	 * 
	 * @Title: voiceMessageToXml
	 * @Description: 返回语音消息对象转XML
	 * @param voiceMessage
	 * @return    
	 * @throws
	 */
	public static String voiceMessageToXml(VoiceMessage voiceMessage){
		cdataXstream.alias("xml", voiceMessage.getClass());
		return cdataXstream.toXML(voiceMessage);
	}
	
	/**
	 * 
	 * @Title: videoMessageToXml
	 * @Description: 返回视频消息对象转XML
	 * @param videoMessage
	 * @return    
	 * @throws
	 */
	public static String videoMessageToXml(VideoMessage videoMessage){
		cdataXstream.alias("xml", videoMessage.getClass());
		return cdataXstream.toXML(videoMessage);
	}
	
	/**
	 * 
	 * @Title: newsMessageToXml
	 * @Description: 返回图文消息对象转XML
	 * @param newsMessage
	 * @return    
	 * @throws
	 */
	public static String newsMessageToXml(NewsMessage newsMessage){
		cdataXstream.alias("xml", newsMessage.getClass());
		return cdataXstream.toXML(newsMessage);
	}
}
