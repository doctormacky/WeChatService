package com.qx.wechat.comm.sdk.request.msg.event;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 5:32:41 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveAcceptMsg implements java.io.Serializable{
	
	private static final long serialVersionUID = -7627012168717371498L;

	private String type;
	
	private String robot_wxid;

	public String getType() {
		return type;
	}

	public PassiveAcceptMsg setType(String type) {
		this.type = type;
		return this;
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public PassiveAcceptMsg setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}
	
	
}
