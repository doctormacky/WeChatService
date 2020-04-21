package com.qx.wechat.tencent.text2speach;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.util.DigestUtils;

import com.google.common.collect.Maps;

/**
 * https://ai.qq.com/doc/aaitts.shtml
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 21, 2020 7:28:02 PM
 *
 * @since: 1.0.0
 *
 * @Copyright: 2020 IBM All rights reserved.
 */
public class TencentText2Speach {
	
	private String app_key;
	
	private Integer app_id;
	
	private Integer time_stamp;
	
	private String nonce_str;
	
	private String sign;
	
	private Integer speaker = 6;
	
	private Integer format = 2;
	
	private Integer volume = 7;
	
	private Integer speed = 100;
	
	private String text;
	
	private Integer aht = 0;
	
	private Integer apc = 58;

	public Integer getApp_id() {
		return app_id;
	}

	public TencentText2Speach setApp_id(int app_id) {
		this.app_id = app_id;
		return this;
	}

	public Integer getTime_stamp() {
		return time_stamp;
	}

	public TencentText2Speach setTime_stamp(int time_stamp) {
		this.time_stamp = time_stamp;
		return this;
	}

	public String getNonce_str() {
		return nonce_str;
	}

	public TencentText2Speach setNonce_str(String nonce_str) {
		this.nonce_str = nonce_str;
		return this;
	}

	public String getSign() {
		return sign;
	}

	public TencentText2Speach initSign() {
		this.time_stamp = (int) (System.currentTimeMillis() / 1000);
		this.nonce_str =  UUID.randomUUID().toString().substring(0, 10);
		
		Map<String, Object> params = new HashMap<String,Object>();
		
		params.put("app_id", getApp_id());
		params.put("time_stamp",time_stamp);
		params.put("nonce_str", nonce_str);
		params.put("speaker",this.speaker);
		params.put("format", this.getFormat());
		params.put("volume", this.volume);
		params.put("speed", this.speed);
		params.put("text", this.getText());
		params.put("aht", this.getAht());
		params.put("apc",this.getApc());
		
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

	public Integer getSpeaker() {
		return speaker;
	}

	public TencentText2Speach setSpeaker(int speaker) {
		this.speaker = speaker;
		return this;
	}

	public Integer getFormat() {
		return format;
	}

	public TencentText2Speach setFormat(int format) {
		this.format = format;
		return this;
	}

	public Integer getVolume() {
		return volume;
	}

	public TencentText2Speach setVolume(int volume) {
		this.volume = volume;
		return this;
	}

	public Integer getSpeed() {
		return speed;
	}

	public TencentText2Speach setSpeed(int speed) {
		this.speed = speed;
		return this;
	}

	public String getText() {
		return text;
	}

	public TencentText2Speach setText(String text) {
		this.text = text;
		return this;
	}

	public Integer getAht() {
		return aht;
	}

	public TencentText2Speach setAht(int aht) {
		this.aht = aht;
		return this;
	}

	public Integer getApc() {
		return apc;
	}

	public TencentText2Speach setApc(int apc) {
		this.apc = apc;
		return this;
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

	public String getApp_key() {
		return app_key;
	}

	public TencentText2Speach setApp_key(String app_key) {
		this.app_key = app_key;
		return this;
	}
}
