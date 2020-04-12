package com.qx.wechat.comm.sdk.criteria;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:23:07 PM
 *
 * @since: 1.0.0
 *
 */
public class FormData {
	
	private String data;

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public static <T> FormData initCriteria(T t) {
		FormData c = new FormData();
		c.setData(JSON.toJSONString(t));
		return c;
	}
	
}
