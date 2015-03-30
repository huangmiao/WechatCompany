package org.wechat.sender;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * 
 * @Title: BaseSender.java
 * @Package org.wechat.sender
 * @Description: Http封装请求类
  ======== author and date version ========
 * @author huangmiao
 * @date 2014年9月24日 下午3:06:02
 * @version V1.0
 * @Copyright: Copyright (c) 2014
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class BaseSender {

	/**
	 * HTTPS GET请求
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public Map httpsGetUrl(String url) throws IOException {
		URL requestURL = new URL(url);
		HttpsURLConnection httpsConnection = (HttpsURLConnection) requestURL.openConnection();
		httpsConnection.setUseCaches(false);
		httpsConnection.setRequestMethod("GET");
		Map jsonMap = JSONObject.fromObject(IOUtils.toString(httpsConnection.getInputStream()));
		httpsConnection.disconnect();
		return jsonMap;
	}

	/**
	 * HTTPS POST请求
	 * 
	 * @param url
	 * @return
	 * @throws IOException
	 */
	public Map httpsPostUrl(String url) throws IOException {
		URL requestURL = new URL(url);
		HttpsURLConnection httpsConnection = (HttpsURLConnection) requestURL.openConnection();
		httpsConnection.setDoInput(true);
		httpsConnection.setDoOutput(true);
		httpsConnection.setUseCaches(false);
		httpsConnection.setRequestMethod("POST");
		Map jsonMap = JSONObject.fromObject(IOUtils.toString(httpsConnection.getInputStream()));
		httpsConnection.disconnect();
		return jsonMap;
	}
	/**
	 * 
	 * @Title: httpsGetUrlByFile
	 * @Description: https get请求把数据数据写入File里
	 * @param url
	 * @param file
	 * @return
	 * @throws IOException    
	 * @throws
	 */
	public void httpsGetUrlWriteFile(String url,File file) throws IOException{
		URL requestURL = new URL(url);
		HttpsURLConnection httpsConnection = (HttpsURLConnection) requestURL.openConnection();
		httpsConnection.setUseCaches(false);
		httpsConnection.setRequestMethod("GET");
		byte[] data = IOUtils.toByteArray(httpsConnection.getInputStream());
		FileUtils.writeByteArrayToFile(file, data);
		httpsConnection.disconnect();
	}
	
	/**
	 * HTTPS POST请求
	 * 
	 * @param url
	 * @param postStr
	 * @return
	 * @throws IOException
	 */
	public Map httpsPostUrl(String url, String postStr) throws IOException {
		URL requestURL = new URL(url);
		HttpsURLConnection httpsConnection = (HttpsURLConnection) requestURL.openConnection();
		
		httpsConnection.setDoOutput(true);
		httpsConnection.setDoInput(true);
		httpsConnection.setUseCaches(false);
		httpsConnection.setRequestMethod("POST");
		httpsConnection.setUseCaches(false);
		httpsConnection.setInstanceFollowRedirects(true);
		httpsConnection.setRequestProperty("Content-Length",String.valueOf(postStr.getBytes().length));
		httpsConnection.getOutputStream().write(postStr.getBytes());
		httpsConnection.getOutputStream().flush();
		httpsConnection.getOutputStream().close();

		Map jsonMap = JSONObject.fromObject(IOUtils.toString(httpsConnection.getInputStream()));
		httpsConnection.disconnect();
		return jsonMap;
	}

	/**
	 * 
	 * @Title: httpsPostByJson
	 * @Description: HttpsPost提交Json参数
	 * @param urlStr
	 *            url请求地址
	 * @param data
	 *            json参数李彪
	 * @return
	 * @throws
	 */
	public Map<String, String> httpsPostByJson(String urlStr,JSONObject data) {
		Map<String, String> jsonMap = null;
		try {
			URL url = new URL(urlStr);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
			connection.connect();
			DataOutputStream out = new DataOutputStream(connection.getOutputStream());
			out.writeBytes(data.toString());
			out.flush();
			out.close();
			jsonMap = JSONObject.fromObject(IOUtils.toString(connection.getInputStream()));
			connection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonMap;
	}
	
	/**
	 * 
	 * @Title: upload
	 * @Description: 上传到服务器
	 * @param url
	 * @param file
	 * @return
	 * @throws IOException    
	 * @throws
	 */
    public static Map upload(String url, File file) throws IOException {  
    	Map resultMap = null;
        if (!file.exists() || !file.isFile()) {  
            throw new IOException("文件不存在");  
        }  
        /** 
        * 第一部分 
        */  
        URL urlObj = new URL(url);  
        HttpsURLConnection con = (HttpsURLConnection) urlObj.openConnection();  
        con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式  
        con.setDoInput(true);  
        con.setDoOutput(true);  
        con.setUseCaches(false); // post方式不能使用缓存  
        // 设置请求头信息  
        con.setRequestProperty("Connection", "Keep-Alive");  
        con.setRequestProperty("Charset", "UTF-8");  
        // 设置边界  
        String BOUNDARY = "----------" + System.currentTimeMillis();  
        con.setRequestProperty("Content-Type", "multipart/form-data; boundary="+ BOUNDARY);  
        // 请求正文信息  
        // 第一部分：  
        StringBuilder sb = new StringBuilder();  
        sb.append("--"); // 必须多两道线  
        sb.append(BOUNDARY);  
        sb.append("\r\n");  
        sb.append("Content-Disposition: form-data;name=\"file\";filename=\""+ file.getName() + "\"\r\n");  
        sb.append("Content-Type:application/octet-stream\r\n\r\n");  
        byte[] head = sb.toString().getBytes("utf-8");  
        // 获得输出流  
        OutputStream out = new DataOutputStream(con.getOutputStream());  
        // 输出表头  
        out.write(head);  
        // 文件正文部分  
        IOUtils.write(IOUtils.toByteArray(new FileInputStream(file)), out);
        // 结尾部分  
        byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线  
        out.write(foot);  
        out.flush();  
        out.close();  
        resultMap =  JSONObject.fromObject(IOUtils.toString(con.getInputStream()));
        con.disconnect();
        return resultMap;
    }
}
