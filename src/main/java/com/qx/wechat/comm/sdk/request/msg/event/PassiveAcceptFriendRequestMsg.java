package com.qx.wechat.comm.sdk.request.msg.event;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 6:18:13 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveAcceptFriendRequestMsg extends PassiveAcceptMsg{
	
	
	private static final long serialVersionUID = 9132434256529122597L;
	private String msg;

	public String getMsg() {
		return msg;
	}
	
	public PassiveAcceptFriendRequestMsg() {
		super.setType(PassiveMsgType.ROBOT_ACCEPT_FRIEND_REQUEST_MSG.getValue());
	}
	

	public PassiveAcceptFriendRequestMsg setMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
	
}
