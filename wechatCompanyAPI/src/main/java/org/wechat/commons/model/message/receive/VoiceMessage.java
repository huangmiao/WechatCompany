package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.BaseMessageMedia;

/**
 * 
 * @Title: VoiceMessage.java
 * @Package org.wechat.commons.model
 * @Description: 语音消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:51:10
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class VoiceMessage extends BaseMessageMedia{

	private String Format;//语音格式，如amr，speex等

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}
}
