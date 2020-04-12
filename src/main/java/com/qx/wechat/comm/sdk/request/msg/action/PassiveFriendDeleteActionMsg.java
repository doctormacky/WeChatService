package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class PassiveFriendDeleteActionMsg extends PassiveActionMsg{
	
	private static final long serialVersionUID = -5303743633991718782L;
	
	private String friend_wxid;

	public PassiveFriendDeleteActionMsg() {
		
		super.setType(PassiveMsgType.ROBOT_DELETE_FRIEND_MSG.getValue());
	}

	public String getFriend_wxid() {
		return friend_wxid;
	}

	public PassiveFriendDeleteActionMsg setFriend_wxid(String friend_wxid) {
		this.friend_wxid = friend_wxid;
		return this;
	}
	
	
}
