package org.wechat.commons.model.message.response;

import org.wechat.commons.model.message.BaseMessageResponseMedia;
import org.wechat.commons.model.message.BaseMessageType;

/**
 * 
 * @Title: VoiceMessage.java
 * @Package org.wechat.commons.model.response
 * @Description: 语言消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午5:12:58
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */

public class VoiceMessage extends BaseMessageType{

	private BaseMessageResponseMedia Voice;

	public BaseMessageResponseMedia getVoice() {
		return Voice;
	}

	public void setVoice(BaseMessageResponseMedia voice) {
		Voice = voice;
	} 
}
