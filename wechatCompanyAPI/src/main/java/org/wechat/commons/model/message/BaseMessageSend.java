package org.wechat.commons.model.message;

/**
 * 
 * @Title: BaseMessageSend.java
 * @Package org.wechat.commons.model
 * @Description: 公共信息发送类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:29:51
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public abstract class BaseMessageSend {

	private String touser;//UserID列表（消息接收者，多个接收者用‘|’分隔）。特殊情况：指定为@all，则向关注该企业应用的全部成员发送
	
	private String toparty;//PartyID列表，多个接受者用‘|’分隔。当touser为@all时忽略本参数
	
	private String totag;//TagID列表，多个接受者用‘|’分隔。当touser为@all时忽略本参数
	
	private String msgtype;//消息类型，此时固定为：text
	
	private String agentid;//企业应用的id，整型。可在应用的设置页面查看

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public String getToparty() {
		return toparty;
	}

	public void setToparty(String toparty) {
		this.toparty = toparty;
	}

	public String getTotag() {
		return totag;
	}

	public void setTotag(String totag) {
		this.totag = totag;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}
}
