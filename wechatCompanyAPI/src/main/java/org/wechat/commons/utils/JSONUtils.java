package org.wechat.commons.utils;

import org.wechat.filter.DefaultJsonConfig;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

/**
 * 
 * @Title: JSONUtils.java
 * @Package org.wechat.commons.utils
 * @Description: JSON工具类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月29日 下午2:19:59
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
public class JSONUtils {
	
	private static JsonConfig newJsonConfig = null;//空值统一处理
	
	static{
		newJsonConfig = new JsonConfig();
		PropertyFilter filter = new PropertyFilter() {
            public boolean apply(Object object, String fieldName, Object fieldValue) {
            	return null == fieldValue;
            }
	    };
	    newJsonConfig.setJsonPropertyFilter(filter);
	}
	
	/**
	 * 
	 * @Title: fromObject
	 * @Description: 过滤数据空值转jsonStr
	 * @param o
	 * @return    
	 * @throws
	 */
	public static String filterNullFromObject(Object o){
		return JSONObject.fromObject(o,newJsonConfig).toString();
	}
	
	public static String fromObject(Object o){
		return JSONObject.fromObject(o).toString();
	}
	/**
	 * 
	 * @Title: fromObject
	 * @Description: 自定义json处理方式
	 * @param o
	 * @param jsonConfig
	 * @return    
	 * @throws
	 */
	public static String fromObject(Object o,JsonConfig jsonConfig){
		return JSONObject.fromObject(o,jsonConfig).toString();
	}
	
	/**
	 * 
	 * @Title: fromObject
	 * @Description: 对象转string过滤字符串
	 * @param o
	 * @param excludes
	 * @return    
	 * @throws
	 */
	public static String fromObjectFilterStr(Object o,String... excludes){
		DefaultJsonConfig jsonConfig = new DefaultJsonConfig();
		jsonConfig.setExcludeValues(excludes);
		return JSONObject.fromObject(o, jsonConfig).toString();
	}
}
