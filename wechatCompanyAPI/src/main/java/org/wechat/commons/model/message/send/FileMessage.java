package org.wechat.commons.model.message.send;

import org.wechat.commons.model.message.BaseMessageSendMedia;
import org.wechat.commons.model.message.BaseMessageSendSafe;

/**
 * 
 * @Title: FileMessage.java
 * @Package org.wechat.commons.model.send
 * @Description: 文件消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 上午11:13:11
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class FileMessage extends BaseMessageSendSafe{
	
	private File file;
	
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	class File extends BaseMessageSendMedia{
		
	}
}
