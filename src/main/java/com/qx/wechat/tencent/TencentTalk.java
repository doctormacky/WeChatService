package com.qx.wechat.tencent;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

import org.springframework.util.DigestUtils;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

/**
 * https://ai.qq.com/doc/nlpchat.shtml
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 18, 2020 8:58:40 AM
 *
 * @since: 1.0.0
 *
 */
public class TencentTalk {

	private String app_key;

	private Integer app_id;

	private Long time_stamp;// 秒

	private String nonce_str;// 随机字符串

	private String sign;// 签名信息

	private String session;// 应用内唯一

	private String question;// 聊天内容，类似 你叫啥？

	public int getApp_id() {
		return app_id;
	}

	public TencentTalk setApp_id(int app_id) {
		this.app_id = app_id;
		return this;
	}

	public long getTime_stamp() {
		return time_stamp;
	}

	public String getNonce_str() {
		return nonce_str;
	}
	
	

	public TencentTalk initSign() {
		this.time_stamp = System.currentTimeMillis() / 1000;
		this.nonce_str =  UUID.randomUUID().toString().substring(0, 10);
		this.session = "100001";
		Map<String, Object> params = ImmutableMap.of(
				"app_id", getApp_id(),
				"time_stamp",time_stamp, 
				"nonce_str", nonce_str, 
				"session", session, 
				"question",getQuestion());

		Map<String, Object> sortedMap = sortByKey(params, false);
		StringBuffer signSB = new StringBuffer();
		sortedMap.forEach((key, value) -> {
			try {
				signSB.append(key).append("=").append(URLEncoder.encode(value + "", "UTF-8")).append("&");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		});
		signSB.append("app_key=").append(app_key);
		
		System.out.println(signSB.toString());
		
		sign = DigestUtils.md5DigestAsHex(signSB.toString().getBytes()).toUpperCase();
		
		return this;
	}

	public TencentTalk setApp_key(String app_key) {
		this.app_key = app_key;
		return this;
	}

	public String getSession() {
		return session;
	}

	public TencentTalk setSession(String session) {
		this.session = session;
		return this;
	}

	public String getQuestion() {
		return question;
	}

	public TencentTalk setQuestion(String question) {
		this.question = question;
		return this;

	}
	
	

	public String getApp_key() {
		return app_key;
	}

	public TencentTalk setApp_id(Integer app_id) {
		this.app_id = app_id;
		return this;
	}



	public String getSign() {
		return sign;
	}

	public static <K extends Comparable<? super K>, V> Map<K, V> sortByKey(Map<K, V> map, boolean isDesc) {
		Map<K, V> result = Maps.newLinkedHashMap();
		if (isDesc) {
			map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey().reversed())
					.forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
		} else {
			map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByKey())
					.forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
		}
		return result;
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, boolean isDesc) {
		Map<K, V> result = Maps.newLinkedHashMap();
		if (isDesc) {
			map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByValue().reversed())
					.forEach(e -> result.put(e.getKey(), e.getValue()));
		} else {
			map.entrySet().stream().sorted(Map.Entry.<K, V>comparingByValue())
					.forEachOrdered(e -> result.put(e.getKey(), e.getValue()));
		}
		return result;
	}
}
