package com.qx.wechat.comm.sdk.request.msg.action;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 6:46:46 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveActionMsg implements java.io.Serializable{
	
	private static final long serialVersionUID = 1145794934789287759L;

	private String type;
	
	private String robot_wxid;

	public String getType() {
		return type;
	}

	public PassiveActionMsg setType(String type) {
		this.type = type;
		return this;
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public PassiveActionMsg setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}
}
