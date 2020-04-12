package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 8:41:51 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveGroupInviteActionMsg extends PassiveActionMsg{
	
	private static final long serialVersionUID = 6607449123332106406L;
	
	private String group_wxid;
	
	private String friend_wxid;

	public PassiveGroupInviteActionMsg() {
		this.setType(PassiveMsgType.ROBOT_INVITE_GROUP_MSG.getValue());
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public PassiveGroupInviteActionMsg setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}

	public String getFriend_wxid() {
		return friend_wxid;
	}

	public PassiveGroupInviteActionMsg setFriend_wxid(String friend_wxid) {
		this.friend_wxid = friend_wxid;
		return this;
	}
}
