package org.wechat.commons.model.message.receive;

import org.wechat.commons.model.message.ReceiveMessage;

/**
 * 
 * @Title: LocationMessage.java
 * @Package org.wechat.commons.model
 * @Description: 位置消息
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月26日 上午11:37:37
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class LocationMessage extends ReceiveMessage{

	private Double Location_X;//地理位置纬度
	
	private Double Location_Y;//地理位置经度
	
	private Long Scale;//地图缩放大小
	
	private String Label;//地理位置信息

	public Double getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(Double location_X) {
		Location_X = location_X;
	}

	public Double getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(Double location_Y) {
		Location_Y = location_Y;
	}

	public Long getScale() {
		return Scale;
	}

	public void setScale(Long scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
}
