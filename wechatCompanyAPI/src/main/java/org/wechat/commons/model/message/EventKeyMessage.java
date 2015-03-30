package org.wechat.commons.model.message;


/**
 * 
 * @Title: EventKeyMessage.java
 * @Package org.wechat.commons.model
 * @Description: 事件带key的消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午3:23:47
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class EventKeyMessage extends BaseMessageEvent{

	private String EventKey;//事件KEY值，与菜单接口中KEY值对应

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
}
