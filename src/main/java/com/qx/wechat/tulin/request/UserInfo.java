package com.qx.wechat.tulin.request;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 17, 2020 9:20:56 PM
 *
 * @since: 1.0.0
 *
 */
public class UserInfo {
	
	private String apiKey;
	
	private String userId;

	public String getApiKey() {
		return apiKey;
	}

	public UserInfo setApiKey(String apiKey) {
		this.apiKey = apiKey;
		return this;
	}

	public String getUserId() {
		return userId;
	}

	public UserInfo setUserId(String userId) {
		this.userId = userId;
		
		return this;
	}
	
}
