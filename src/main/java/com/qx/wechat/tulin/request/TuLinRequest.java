package com.qx.wechat.tulin.request;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 17, 2020 9:29:36 PM
 *
 * @since: 1.0.0
 *
 */
public class TuLinRequest {
	
	//0 文本, 1图片, 2, 音频
	private int reqType;
	
	private UserInfo userInfo;
	
	private Perception perception;

	public int getReqType() {
		return reqType;
	}

	public TuLinRequest setReqType(int reqType) {
		this.reqType = reqType;
		return this;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public TuLinRequest setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
		return this;
	}

	public Perception getPerception() {
		return perception;
	}

	public TuLinRequest setPerception(Perception perception) {
		this.perception = perception;
		return this;
	}
	
}
