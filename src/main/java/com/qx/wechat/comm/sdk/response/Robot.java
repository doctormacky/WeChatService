package com.qx.wechat.comm.sdk.response;

public class Robot extends BasicResponseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7024121359927035543L;
	//机器人id
	private String robot_wxid;
	//微信号
	private String wx_num;
	//头像链接
	private String head_url;
	public String getRobot_wxid() {
		return robot_wxid;
	}
	public void setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
	}
	public String getWx_num() {
		return wx_num;
	}
	public void setWx_num(String wx_num) {
		this.wx_num = wx_num;
	}
	public String getHead_url() {
		return head_url;
	}
	public void setHead_url(String head_url) {
		this.head_url = head_url;
	}
	@Override
	public String toString() {
		return "Robot [robot_wxid=" + robot_wxid + ", wxid=" + super.getWxid() + ", wx_num=" + wx_num + ", nickname=" + super.getNickname()
				+ ", head_url=" + head_url + "]";
	}
	
}
