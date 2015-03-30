package org.wechat.constant;

/**
 * 
 * @Title: FiledConstant.java
 * @Package org.wechat.constant
 * @Description: 常量类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月24日 下午5:18:28
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class FiledConstant {

    public static String GET_TOKEN = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=CORPID&corpsecret=CORPSECRET";

    public static String GET_USERINFO = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE&agentid=AGENTID";
    
    public static String SEND_MESSAGE = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";
    /**
     * 
     * @Title: FiledConstant.java
     * @Package org.wechat.constant
     * @Description: 部门
     * @Company:成都时雍道泰科技有限公司
     * ======== author and date version ========
     * @author huangmiao
     * @date 2014年9月24日 下午5:39:37
     * @version V1.0
     * @Copyright: Copyright (c) 2014
     */
    public enum Department{
    	CREATE("https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=ACCESS_TOKEN"),
    	UPDATE("https://qyapi.weixin.qq.com/cgi-bin/department/update?access_token=ACCESS_TOKEN"),
    	DELETE("https://qyapi.weixin.qq.com/cgi-bin/department/delete?access_token=ACCESS_TOKEN&id=ID"),
    	SEARCH("https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token=ACCESS_TOKEN");
    	
    	private String value;
    	
    	private Department(String value){
    		this.value = value;
    	}
    	public String getValue() {
    		return value;
    	}

    	public void setValue(String value) {
    		this.value = value;
    	}
    }
    
    /**
     * 
     * @Title: FiledConstant.java
     * @Package org.wechat.constant
     * @Description:成员
     * @Company:成都时雍道泰科技有限公司
     * ======== author and date version ========
     * @author huangmiao
     * @date 2014年9月25日 上午9:18:15
     * @version V1.0
     * @Copyright: Copyright (c) 2014
     */
    public enum Member{
    	CREATE("https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=ACCESS_TOKEN"),
    	UPDATE("https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=ACCESS_TOKEN"),
    	DELETE("https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token=ACCESS_TOKEN&userid=ID"),
    	SEARCHBYID("https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=ID"),
    	GETBYDEPARTMENT("https://qyapi.weixin.qq.com/cgi-bin/user/simplelist?access_token=ACCESS_TOKEN&department_id=DEPARTMENTID&fetch_child=CHILD&status=STATUS");
    	private String value;
    	
    	private Member(String value){
    		this.value = value;
    	}
    	public String getValue() {
    		return value;
    	}

    	public void setValue(String value) {
    		this.value = value;
    	}
    }
    
    /**
     * 
     * @Title: FiledConstant.java
     * @Package org.wechat.constant
     * @Description: 标签
     * @Company:成都时雍道泰科技有限公司
     * ======== author and date version ========
     * @author huangmiao
     * @date 2014年9月25日 上午9:27:23
     * @version V1.0
     * @Copyright: Copyright (c) 2014
     */
    public enum Tag{
    	CREATE("https://qyapi.weixin.qq.com/cgi-bin/tag/create?access_token=ACCESS_TOKEN"),
    	UPDATE("https://qyapi.weixin.qq.com/cgi-bin/tag/update?access_token=ACCESS_TOKEN"),
    	DELETE("https://qyapi.weixin.qq.com/cgi-bin/tag/delete?access_token=ACCESS_TOKEN&tagid=ID"),
    	SEARCHBYID("https://qyapi.weixin.qq.com/cgi-bin/tag/get?access_token=ACCESS_TOKEN&tagid=ID"),
    	ADDBYMEMBER("https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=ACCESS_TOKEN"),
    	DELETEBYMEMBER("https://qyapi.weixin.qq.com/cgi-bin/tag/deltagusers?access_token=ACCESS_TOKEN");
    	private String value;
    	
    	private Tag(String value){
    		this.value = value;
    	}
    	public String getValue() {
    		return value;
    	}

    	public void setValue(String value) {
    		this.value = value;
    	}
    }
    
    /**
     * 
     * @Title: FiledConstant.java
     * @Package org.wechat.constant
     * @Description: 多媒体
     * @Company:成都时雍道泰科技有限公司
     * ======== author and date version ========
     * @author huangmiao
     * @date 2014年9月25日 上午9:44:02
     * @version V1.0
     * @Copyright: Copyright (c) 2014
     */
    public enum Media{
    	UPLOAD("https://qyapi.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE"),
    	GETBYID("https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID");
    	
    	private String value;
    	
    	private Media(String value){
    		this.value = value;
    	}
    	public String getValue() {
    		return value;
    	}

    	public void setValue(String value) {
    		this.value = value;
    	}
    }
    
    /**
     * 
     * @Title: FiledConstant.java
     * @Package: org.wechat.constant
     * @Description: 菜单管理
     * @Company:成都时雍道泰科技有限公司
     * ======== author and date version ========
     * @author huangmiao
     * @date 2014年9月25日 上午10:12:38
     * @version V1.0
     * @Copyright: Copyright (c) 2014
     */
    public enum Menu{
    	
    	CREATE("https://qyapi.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN&agentid=AGENTID"),
    	DELETE("https://qyapi.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN&agentid=AGENTID"),
    	SEARCH("https://qyapi.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN&agentid=AGENTID");
    	
    	private String value;
    	
    	private Menu(String value){
    		this.value = value;
    	}
    	public String getValue() {
    		return value;
    	}

    	public void setValue(String value) {
    		this.value = value;
    	}
    }
}
