package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 7:22:49 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveGroupNameUpdateActionMsg extends PassiveActionMsg{
	
	private static final long serialVersionUID = 616006840973040158L;
	
	private String group_wxid;
	
	private String group_name;

	public String getGroup_wxid() {
		return group_wxid;
	}
	
	public PassiveGroupNameUpdateActionMsg() {
		this.setType(PassiveMsgType.ROBOT_UPDATE_GROUP_NAME_MSG.getValue());
	}

	public PassiveGroupNameUpdateActionMsg setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}

	public String getGroup_name() {
		return group_name;
	}

	public PassiveGroupNameUpdateActionMsg setGroup_name(String group_name) {
		this.group_name = group_name;
		return this;
	}
	
	
}
