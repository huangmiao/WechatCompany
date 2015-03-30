package org.wechat.commons.model.message;

/**
 * 
 * @Title: BaseMessageSendSafe.java
 * @Package org.wechat.commons.model
 * @Description: 公共保密消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:32:53
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageSendSafe extends BaseMessageSend{

	private String safe;//表示是否是保密消息，0表示否，1表示是，默认0

	public String getSafe() {
		return safe;
	}

	public void setSafe(String safe) {
		this.safe = safe;
	}
}
