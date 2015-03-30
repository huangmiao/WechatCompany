package org.wechat.commons.utils;

import org.wechat.commons.model.message.send.FileMessage;
import org.wechat.commons.model.message.send.ImageMessage;
import org.wechat.commons.model.message.send.MpNewsMessage;
import org.wechat.commons.model.message.send.NewsMessage;
import org.wechat.commons.model.message.send.TextMessage;
import org.wechat.commons.model.message.send.VideoMessage;
import org.wechat.commons.model.message.send.VoiceMessage;

/**
 * 
 * @Title: SendMessageUtils.java
 * @Package org.wechat.commons.utils
 * @Description: 发送消息工具类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午3:47:15
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class SendMessageUtils {
	
	/**
	 * 
	 * @Title: sendTextMessage
	 * @Description: 发送文本消息
	 * @param textMessage
	 * @return    
	 * @throws
	 */
	public static String sendTextMessage(TextMessage textMessage){
		return JSONUtils.fromObject(textMessage);
	}
	
	/**
	 * 
	 * @Title: sendImageMessage
	 * @Description: 发送图片消息
	 * @param imageMessage
	 * @return    
	 * @throws
	 */
	public static String sendImageMessage(ImageMessage imageMessage){
		return JSONUtils.fromObject(imageMessage);
	}
	
	/**
	 * 
	 * @Title: sendVoiceMessage
	 * @Description: 发送语音消息
	 * @param voiceMessage
	 * @return    
	 * @throws
	 */
	public static String sendVoiceMessage(VoiceMessage voiceMessage){
		return JSONUtils.fromObject(voiceMessage);
	}
	
	/**
	 * 
	 * @Title: sendVideoMessage
	 * @Description: 发送视频消息
	 * @param videoMessage
	 * @return    
	 * @throws
	 */
	public static String sendVideoMessage(VideoMessage videoMessage){
		return JSONUtils.fromObject(videoMessage);
	}
	
	/**
	 * 
	 * @Title: sendFileMessage
	 * @Description: 发送文件消息
	 * @param fileMessage
	 * @return    
	 * @throws
	 */
	public static String sendFileMessage(FileMessage fileMessage){
		return JSONUtils.fromObject(fileMessage);
	}
	
	/**
	 * 
	 * @Title: sendNewsMessage
	 * @Description: 发送图文消息
	 * @param newsMessage
	 * @return    
	 * @throws
	 */
	public static String sendNewsMessage(NewsMessage newsMessage){
		return JSONUtils.fromObject(newsMessage);
	}
	
	/**
	 * 
	 * @Title: sendMpNewsMessage
	 * @Description: 发送存储到微信里的图文消息
	 * @param mpNewsMessage
	 * @return    
	 * @throws
	 */
	public static String sendMpNewsMessage(MpNewsMessage mpNewsMessage){
		return JSONUtils.fromObject(mpNewsMessage);
	}
}
