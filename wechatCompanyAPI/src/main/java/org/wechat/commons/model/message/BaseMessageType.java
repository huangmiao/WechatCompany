package org.wechat.commons.model.message;

/**
 * 
 * @Title: BaseMessageType.java
 * @Package org.wechat.commons.model
 * @Description: 公共消息类型
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:42:03
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageType extends BaseMessage{
	
	private String MsgType;//消息类型，此时固定为：event

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
