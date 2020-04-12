package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class RobotGroupMembersQuery extends BasicQuery{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5952023410986951767L;

	private String robot_wxid;
	
	// 是否刷新列表，0 从缓存获取 / 1 刷新并获取
	private String is_refresh = "1";
	// 群组微信id
	private String group_wxid;
	
	public RobotGroupMembersQuery() {
		super.setType(PassiveMsgType.ROBOT_GROUP_MEMBERS_MSG.getValue());
	}
	
	
	public RobotGroupMembersQuery setRefresh(boolean refresh) {
		if(refresh) {
			is_refresh = "1";
		}else {
			is_refresh = "0";
		}
		return this;
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotGroupMembersQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}

	public String getIs_refresh() {
		return is_refresh;
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public RobotGroupMembersQuery setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}
}
