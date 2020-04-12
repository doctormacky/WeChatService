package com.qx.wechat.comm.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class ResultKit {
	
	public static <T> T packageSingleResult(String result, Class<T> clazz) {
		String data = JSON.parseObject(result).getString("data");
		try {
			return JSON.parseObject(URLDecoder.decode(data, "UTF-8"), clazz);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static <T> List<T> packageResult(String result, Class<T> clazz) {
		String data = JSON.parseObject(result).getString("data");
		try {
			return JSON.parseArray(URLDecoder.decode(data, "UTF-8"), clazz);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public static String packageResult(String result) {
		String data = JSON.parseObject(result).getString("data");
		try {
			return URLDecoder.decode(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}

}
