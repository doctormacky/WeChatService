package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class RobotNameQuery extends BasicQuery{
	
	private static final long serialVersionUID = 1723864340095385011L;

	private String robot_wxid;
	
	public RobotNameQuery() {

		super.setType(PassiveMsgType.ROBOT_NAME_MSG.getValue());
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotNameQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}
}
