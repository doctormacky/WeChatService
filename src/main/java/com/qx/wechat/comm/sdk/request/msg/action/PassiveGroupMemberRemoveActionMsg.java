package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 7:16:37 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveGroupMemberRemoveActionMsg extends PassiveActionMsg{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1005425813986564059L;
	
	
	private String group_wxid;
	
	private String member_wxid;
	
	public PassiveGroupMemberRemoveActionMsg() {
		this.setType(PassiveMsgType.ROBOT_REMOVE_GROUP_MEMBER_MSG.getValue());
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public PassiveGroupMemberRemoveActionMsg setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}

	public String getMember_wxid() {
		return member_wxid;
	}

	public PassiveGroupMemberRemoveActionMsg setMember_wxid(String member_wxid) {
		this.member_wxid = member_wxid;
		return this;
	}
	

	
}
