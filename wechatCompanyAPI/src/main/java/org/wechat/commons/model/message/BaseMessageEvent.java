package org.wechat.commons.model.message;

/**
 * 
 * @Title: SubscribeMessage.java
 * @Package org.wechat.commons.model
 * @Description: 关注消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:28:28
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageEvent extends BaseMessageType{

	private String Event;//事件类型，subscribe(订阅)、unsubscribe(取消订阅)

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}
}
