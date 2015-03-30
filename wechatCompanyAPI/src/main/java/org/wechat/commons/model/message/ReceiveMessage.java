package org.wechat.commons.model.message;


/**
 * 
 * @Title: ReceiveMessage.java
 * @Package org.wechat.commons.model
 * @Description: 接收消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:31:23
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class ReceiveMessage extends BaseMessageType{

	private Long MsgId;//消息id
	
	public Long getMsgId() {
		return MsgId;
	}

	public void setMsgId(Long msgId) {
		MsgId = msgId;
	}
}
