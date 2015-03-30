package org.wechat.commons.utils;

import org.wechat.commons.model.message.receive.ImageMessage;
import org.wechat.commons.model.message.receive.LocationMessage;
import org.wechat.commons.model.message.receive.MenuMessage;
import org.wechat.commons.model.message.receive.SubscribeMessage;
import org.wechat.commons.model.message.receive.TextMessage;
import org.wechat.commons.model.message.receive.UploadLocationMessage;
import org.wechat.commons.model.message.receive.VideoMessage;
import org.wechat.commons.model.message.receive.VoiceMessage;

import com.thoughtworks.xstream.XStream;

/**
 * 
 * @Title: ReceiveMessageUtils.java
 * @Package org.wechat.commons.utils
 * @Description: 接收消息/事件工具类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午3:18:32
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ReceiveMessageUtils{

	private static XStream xstream = new XStream();
	
	/**
	 * 
	 * @Title: fromSubscribeMessage
	 * @Description: XML转关注事件消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static SubscribeMessage fromSubscribeMessage(String xml){
		return (SubscribeMessage) xstream.fromXML(xml, SubscribeMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromTextMessage
	 * @Description: XML转文本消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static TextMessage fromTextMessage(String xml){
		return (TextMessage) xstream.fromXML(xml,TextMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromImageMessage
	 * @Description: XML转图片消息对象保存
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static ImageMessage fromImageMessage(String xml){
		return (ImageMessage) xstream.fromXML(xml,ImageMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromVoiceMessage
	 * @Description: XML转语音消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static VoiceMessage fromVoiceMessage(String xml){
		return (VoiceMessage) xstream.fromXML(xml,VoiceMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromVideoMessage
	 * @Description: XML转语音消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static VideoMessage fromVideoMessage(String xml){
		return (VideoMessage) xstream.fromXML(xml,VideoMessage.class);
	}
	/**
	 * 
	 * @Title: fromLocationMessage
	 * @Description: XML转地理位置消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static LocationMessage fromLocationMessage(String xml){
		return (LocationMessage) xstream.fromXML(xml,LocationMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromMenuMessage
	 * @Description: XML转菜单消息对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static MenuMessage fromMenuMessage(String xml){
		return (MenuMessage) xstream.fromXML(xml,MenuMessage.class);
	}
	
	/**
	 * 
	 * @Title: fromUploadLocationMessage
	 * @Description: 自动上传地理位置对象
	 * @param xml
	 * @return    
	 * @throws
	 */
	public static UploadLocationMessage fromUploadLocationMessage(String xml){
		return (UploadLocationMessage) xstream.fromXML(xml,UploadLocationMessage.class);
	}
}
