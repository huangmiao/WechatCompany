package org.wechat.commons.model.message;

/**
 * 
 * @Title: BaseMessage.java
 * @Package org.wechat.commons.model
 * @Description: 消息base层
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:27:27
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessage {
	
	private String ToUserName;//发送者
	
	private String FromUserName;//接收者
	
	private Long CreateTime;//消息创建时间
	
	private Long AgentID;//企业应用的id，整型。可在应用的设置页面查看

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public Long getAgentID() {
		return AgentID;
	}

	public void setAgentID(Long agentID) {
		AgentID = agentID;
	}
}
