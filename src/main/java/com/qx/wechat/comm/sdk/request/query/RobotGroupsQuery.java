package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class RobotGroupsQuery extends BasicQuery{
	
	private static final long serialVersionUID = 4695231256990150800L;

	private String robot_wxid;
	
	// 是否刷新列表，0 从缓存获取 / 1 刷新并获取
	private String is_refresh = "1";
	
	public RobotGroupsQuery setRefresh(boolean refresh) {
		if(refresh) {
			is_refresh = "1";
		}else {
			is_refresh = "0";
		}
		return this;
	}
	
	public RobotGroupsQuery() {
		super.setType(PassiveMsgType.ROBOT_GROUPS_MSG.getValue());
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotGroupsQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}

	public String getIs_refresh() {
		return is_refresh;
	}


}
