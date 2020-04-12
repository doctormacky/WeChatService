package com.qx.wechat.comm.sdk.request.msg.action;

import java.util.List;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class PassiveGroupCreationActionMsg extends PassiveActionMsg{

	private static final long serialVersionUID = 2765534130813027698L;
	
	public PassiveGroupCreationActionMsg() {
		this.setType(PassiveMsgType.ROBOT_CREATE_GROUP_MSG.getValue());
	}
	
	private String friends;

	public String getFriends() {
		return friends;
	}

	public PassiveGroupCreationActionMsg setFriends(List<String> friends) {
		this.friends = friends.toString();
		return this;
	}

}
