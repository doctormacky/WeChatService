package com.qx.wechat.comm.sdk.request.msg;

/**
 * 所有发送类型的消息结构体
 * 例如: 发送文本消息,图片消息
 * 
 * 注意: 发送群@消息例外
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:02:50 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveMsg implements java.io.Serializable{
	
	private static final long serialVersionUID = -1403760141424370499L;

	private String msg;
	
	private String type;
	
	private String to_wxid;
	
	private String robot_wxid;

	public String getMsg() {
		return msg;
	}

	public PassiveMsg setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public String getType() {
		return type;
	}

	public PassiveMsg setType(String type) {
		this.type = type;
		return this;
	}

	public String getTo_wxid() {
		return to_wxid;
	}

	public PassiveMsg setTo_wxid(String to_wxid) {
		this.to_wxid = to_wxid;
		return this;
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public PassiveMsg setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}
}
