package com.qx.wechat.comm.sdk.response;
/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 3:06:46 PM
 *
 * @since: 1.0.0
 *
 */
public class Friend extends BasicResponseEntity{
	private static final long serialVersionUID = -4608627176156666652L;
	// 微信签名
	private String note;
	//机器人微信id
	private String robot_wxid;

	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getRobot_wxid() {
		return robot_wxid;
	}
	public void setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
	}
	@Override
	public String toString() {
		return "Friend [wxid=" + super.getWxid() + ", note=" + note + ", nickname=" + super.getNickname() + ", robot_wxid=" + robot_wxid
				+ "]";
	}
}
