package org.wechat.filter;

import net.sf.json.JsonConfig;

/**
 * 
 * @Title: DefaultJsonConfig.java
 * @Package org.wechat.json
 * @Description: JSON配置类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月25日 下午5:52:31
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class DefaultJsonConfig extends JsonConfig {  
	
	public static DefaultJsonConfig newInstance(){
		return new DefaultJsonConfig();
	}
	
	/**
	 * 
	 * @Title: setExcludeValues
	 * @Description: 需要过滤对象的JSON属性
	 * @param values    
	 * @throws
	 */
	public void setExcludeValues(String... values){
		setExcludes(values);
	}
}