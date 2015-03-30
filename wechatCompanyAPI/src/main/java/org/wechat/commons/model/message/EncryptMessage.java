package org.wechat.commons.model.message;

/**
 * 
 * @Title: EncryptMessage.java
 * @Package org.wechat.commons.model
 * @Description: 加密消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午4:32:40
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class EncryptMessage {

	private String Encrypt;//密文
	
	private String MsgSignature;//签名串
	
	private String TimeStamp;//时间戳
	
	private String Nonce;//随机串

	public String getEncrypt() {
		return Encrypt;
	}

	public void setEncrypt(String encrypt) {
		Encrypt = encrypt;
	}

	public String getMsgSignature() {
		return MsgSignature;
	}

	public void setMsgSignature(String msgSignature) {
		MsgSignature = msgSignature;
	}

	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	public String getNonce() {
		return Nonce;
	}

	public void setNonce(String nonce) {
		Nonce = nonce;
	}
}
