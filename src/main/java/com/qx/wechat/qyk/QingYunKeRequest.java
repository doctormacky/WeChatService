package com.qx.wechat.qyk;

public class QingYunKeRequest {
	
	private String key = "free";
	
	private int appid = 0;
	
	private String msg;

	public String getKey() {
		return key;
	}

	public QingYunKeRequest setKey(String key) {
		this.key = key;
		return this;
	}

	public int getAppid() {
		return appid;
	}

	public QingYunKeRequest setAppid(int appid) {
		this.appid = appid;
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public QingYunKeRequest setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
}
