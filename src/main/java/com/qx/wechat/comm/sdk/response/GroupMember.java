package com.qx.wechat.comm.sdk.response;
/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 4:04:19 PM
 *
 * @since: 1.0.0
 *
 */
public class GroupMember extends BasicResponseEntity{
	
	private static final long serialVersionUID = -4356150068405568769L;

	private String robot_wxid;

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public void setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
	}
	
	
}
