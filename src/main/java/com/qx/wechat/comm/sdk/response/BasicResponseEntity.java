package com.qx.wechat.comm.sdk.response;

public class BasicResponseEntity implements java.io.Serializable{
	
	private static final long serialVersionUID = 8206005618316746724L;

	private String wxid;
	
	private String nickname;

	public String getWxid() {
		return wxid;
	}

	public void setWxid(String wxid) {
		this.wxid = wxid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	

}
