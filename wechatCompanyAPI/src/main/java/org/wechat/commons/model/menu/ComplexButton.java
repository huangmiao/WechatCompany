package org.wechat.commons.model.menu;

/**
 * 
 * @Title: ComplexButton.java
 * @Package org.wechat.commons.model.menu
 * @Description: 复杂的button
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午12:26:39
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class ComplexButton extends BaseClickOrViewButton{

	private BaseClickOrViewButton[] sub_button;

	public BaseClickOrViewButton[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(BaseClickOrViewButton[] sub_button) {
		this.sub_button = sub_button;
	}
}
