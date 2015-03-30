package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.BaseMessageEvent;

/**
 * 
 * @Title: UploadLocationMessage.java
 * @Package org.wechat.commons.model
 * @Description: 上传地理位置
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 下午3:21:00
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class UploadLocationMessage extends BaseMessageEvent{

	private Double Latitude;//地理位置纬度
	
	private Double Longitude;//地理位置经度
	
	private Double Precision;//地理位置精度

	public Double getLatitude() {
		return Latitude;
	}

	public void setLatitude(Double latitude) {
		Latitude = latitude;
	}

	public Double getLongitude() {
		return Longitude;
	}

	public void setLongitude(Double longitude) {
		Longitude = longitude;
	}

	public Double getPrecision() {
		return Precision;
	}

	public void setPrecision(Double precision) {
		Precision = precision;
	}
}
