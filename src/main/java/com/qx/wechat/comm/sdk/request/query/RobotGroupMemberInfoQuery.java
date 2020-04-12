package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 4:10:12 PM
 *
 * @since: 1.0.0
 *
 */
public class RobotGroupMemberInfoQuery extends BasicQuery {
	private static final long serialVersionUID = 8962056880260850646L;
	
	private String robot_wxid;
	
	private String group_wxid;// 群id
	
	private String member_wxid;// 群成员id

	public RobotGroupMemberInfoQuery() {
		super.setType(PassiveMsgType.ROBOT_GROUP_MEMBER_MSG.getValue());
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotGroupMemberInfoQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public RobotGroupMemberInfoQuery setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}

	public String getMember_wxid() {
		return member_wxid;
	}

	public RobotGroupMemberInfoQuery setMember_wxid(String member_wxid) {
		this.member_wxid = member_wxid;
		return this;
	}

}
