package org.wechat.sender;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.wechat.constant.FiledConstant;

/**
 * 
 * @Title: DefaultSender.java
 * @Package org.wechat.sender
 * @Description: 微信发送类
 * ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月24日 下午5:21:49
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
@SuppressWarnings("rawtypes")
public class DefaultSender extends BaseSender{

	public static DefaultSender newInstance(){
		return new DefaultSender();
	}
	/**
	 * 
	 * @Title: getAccessTokenJson
	 * @Description: 获取accessToken
	 * @param corp_id
	 * 		公司id
	 * @param corpSecret
	 * 		公司key
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map getAccessToken(String corp_id,String corpSecret) throws IOException{
		return httpsGetUrl(FiledConstant.GET_TOKEN.
				replaceAll("CORPID", corp_id).
				replaceAll("CORPSECRET", corpSecret));
	}
	
	/**
	 * 
	 * @Title: createDepartment
	 * @Description: 创建部门
	 * @param access_token
	 * @param data
	 * 			json字符
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map createDepartment(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Department.CREATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: updateDepartment
	 * @Description: 修改部门
	 * @param access_token
	 * @param data
	 * 			json字符
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map updateDepartment(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Department.UPDATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: deleteDepartment
	 * @Description: 删除部门
	 * @param access_token
	 * @param id
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map deleteDepartment(String access_token,String id) throws IOException{
		return httpsGetUrl(FiledConstant.Department.DELETE.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("ID", id));
	}
	
	/**
	 * 
	 * @Title: searchDepartment
	 * @Description: 查询部门
	 * @param access_token
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map searchDepartment(String access_token) throws IOException{
		return httpsGetUrl(FiledConstant.Department.SEARCH.getValue().
				replaceAll("ACCESS_TOKEN", access_token));
	}
	
	/**
	 * 
	 * @Title: createMember
	 * @Description: 成员创建
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map createMember(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Member.CREATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: updateMember
	 * @Description: 修改成员
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map updateMember(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Member.UPDATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: deleteMember
	 * @Description: 删除成员
	 * @param access_token
	 * @param id
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map deleteMember(String access_token,String id) throws IOException{
		return httpsGetUrl(FiledConstant.Member.DELETE.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("ID", id));
	}
	
	/**
	 * 
	 * @Title: searchMemberById
	 * @Description: 根据id查询成员
	 * @param access_token
	 * @param id
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map searchMemberById(String access_token,String id) throws IOException{
		return httpsGetUrl(FiledConstant.Member.SEARCHBYID.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("ID", id));
	}
	
	/**
	 * 
	 * @Title: searchMemberByDepartmentKd
	 * @Description: 根据departmentId查询Member
	 * @param access_token
	 * @param departmentId
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map searchMemberByDepartmentKd(String access_token,String departmentId) throws IOException{
		return httpsGetUrl(FiledConstant.Member.GETBYDEPARTMENT.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("DEPARTMENTID", departmentId).
				replaceAll("CHILD", "0").
				replaceAll("STATUS", "0"));
	}
	
	/**
	 * 
	 * @Title: searchMemberByDepartmentKd
	 * @Description: 根据departmentId,child.status查询Member
	 * @param access_token
	 * @param departmentId
	 * @param child
	 * @param status
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map searchMemberByDepartmentId(String access_token,String departmentId,String child,String status) throws IOException{
		return httpsGetUrl(FiledConstant.Member.GETBYDEPARTMENT.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("DEPARTMENTID", departmentId).
				replaceAll("CHILD", child).
				replaceAll("STATUS", status));
	}
	
	/**
	 * 
	 * @Title: createTag
	 * @Description: 创建标签
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map createTag(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Tag.CREATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: updateTag
	 * @Description: 修改标签
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map updateTag(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Tag.UPDATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: deleteTag
	 * @Description: 删除标签
	 * @param access_token
	 * @param id
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map deleteTag(String access_token,String id) throws IOException{
		return httpsGetUrl(FiledConstant.Tag.DELETE.getValue().
				replaceAll("ACCESS_TOKEN", access_token).replaceAll("ID", id));
	}
	
	/**
	 * 
	 * @Title: getMemberByTag
	 * @Description: 根据标签获取成员列表
	 * @param access_token
	 * @param id
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map getMemberByTag(String access_token,String id) throws IOException{
		return httpsGetUrl(FiledConstant.Tag.SEARCHBYID.getValue().
				replaceAll("ACCESS_TOKEN", access_token).replaceAll("ID", id));
	}
	
	/**
	 * 
	 * @Title: addTagMember
	 * @Description: 添加标签成员
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map addTagMember(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Tag.ADDBYMEMBER.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: DeleteTagMember
	 * @Description: 删除标签成员
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map deleteTagMember(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Tag.DELETEBYMEMBER.getValue().
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
	
	/**
	 * 
	 * @Title: uploadMedia
	 * @Description: 上传多媒体
	 * @param access_token
	 * @param type
	 * @param file    
	 * @throws
	 */
	public Map uploadMedia(String access_token,String type,File file) throws IOException{
		return upload(FiledConstant.Media.UPLOAD.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("TYPE", type),file);
	}
	/**
	 * 
	 * @Title: getMediaById
	 * @Description: 根据mediaId获取多媒体
	 * @param access_token
	 * @param mediaId
	 * @param file
	 * @throws IOException    
	 * @throws
	 */
	public void getMediaById(String access_token,String mediaId,File file) throws IOException{
		httpsGetUrlWriteFile(FiledConstant.Media.GETBYID.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("MEDIA_ID", mediaId), file);
	}
	
	/**
	 * 
	 * @Title: createMenu
	 * @Description: 创建菜单
	 * @param access_token
	 * @param agentId
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map createMenu(String access_token,String agentId,String data) throws IOException{
		return httpsPostUrl(FiledConstant.Menu.CREATE.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("AGENTID", agentId),data);
	}
	
	/**
	 * 
	 * @Title: deleteMenu
	 * @Description: 删除菜单
	 * @param access_token
	 * @param agentId
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map deleteMenu(String access_token,String agentId) throws IOException{
		return httpsGetUrl(FiledConstant.Menu.DELETE.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("AGENTID", agentId));
	}
	
	/**
	 * 
	 * @Title: searchMenu
	 * @Description: 查询菜单
	 * @param access_token
	 * @param agentId
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map searchMenu(String access_token,String agentId) throws IOException{
		return httpsGetUrl(FiledConstant.Menu.SEARCH.getValue().
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("AGENTID", agentId));
	}
	
	/**
	 * 
	 * @Title: getUserInfo
	 * @Description: 网页授权获取用户信息
	 * @return    
	 * @throws
	 */
	public Map getUserInfo(String access_token,String code,String agentId) throws IOException{
		return httpsGetUrl(FiledConstant.GET_USERINFO.
				replaceAll("ACCESS_TOKEN", access_token).
				replaceAll("CODE", code).
				replaceAll("AGENTID", agentId));
	}
	
	/**
	 * 
	 * @Title: sendMessage
	 * @Description: 发送消息
	 * @param access_token
	 * @param data
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public Map sendMessage(String access_token,String data) throws IOException{
		return httpsPostUrl(FiledConstant.SEND_MESSAGE.
				replaceAll("ACCESS_TOKEN", access_token),data);
	}
}
