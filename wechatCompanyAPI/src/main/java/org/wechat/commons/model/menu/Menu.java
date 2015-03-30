package org.wechat.commons.model.menu;

import java.io.IOException;

import net.sf.json.JSONObject;

import org.wechat.commons.utils.JSONUtils;
import org.wechat.sender.DefaultSender;

public class Menu {

	private ComplexButton[] button;

	public ComplexButton[] getButton() {
		return button;
	}

	public void setButton(ComplexButton[] button) {
		this.button = button;
	}
	
	public static void main(String[] args){
		String menuStr = "{"+
				   "\"button\":["+
				             "{"+	
				                 "\"type\":\"click\","+
				                 "\"name\":\"今日歌曲\","+
				                 "\"key\":\"V1001_TODAY_MUSIC\""+
				             "},"+
				             "{"+
				                 "\"name\":\"菜单\","+
				                 "\"sub_button\":["+
				                     "{"+
				                         "\"type\":\"view\","+
				                         "\"name\":\"搜索\","+
				                         "\"url\":\"http://www.soso.com/\""+
				                     "},"+
				                     "{"+
				                         "\"type\":\"click\","+
				                         "\"name\":\"赞一下我们\","+
				                         "\"key\":\"V1001_GOOD\""+
				                     "}"+
				                 "]"+
				            "}"+
				         "]"+
				      "}";
		Menu menu = (Menu) JSONObject.toBean(JSONObject.fromObject(menuStr),Menu.class);
		System.out.println(JSONUtils.filterNullFromObject(menu));
		DefaultSender sender = DefaultSender.newInstance();
		try {
			sender.createMenu("122121", "1", JSONObject.fromObject(menu).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
