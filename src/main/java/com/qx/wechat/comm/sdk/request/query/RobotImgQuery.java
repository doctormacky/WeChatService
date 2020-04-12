package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class RobotImgQuery extends BasicQuery{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 48790581210316208L;
	
	private String robot_wxid;
	
	public RobotImgQuery() {

		super.setType(PassiveMsgType.ROBOT_IMG_MSG.getValue());
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotImgQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
