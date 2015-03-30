package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendMedia;
import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: VoiceMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 语音消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 上午11:09:10
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class VoiceMessage extends BaseMessageSendSafe{

	private Voice voice;
	
	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	class Voice extends BaseMessageSendMedia{
		
	}
}
