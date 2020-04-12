package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;
/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 2:51:41 PM
 *
 * @since: 1.0.0
 *
 */
public class RobotFriendsQuery extends BasicQuery{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4254011747404995121L;
	
	private String robot_wxid;
	
	// 是否刷新列表，0 从缓存获取 / 1 刷新并获取
	private String is_refresh = "1";
	
	public RobotFriendsQuery setRefresh(boolean refresh) {
		if(refresh) {
			is_refresh = "1";
		}else {
			is_refresh = "0";
		}
		return this;
	}

	public RobotFriendsQuery() {
		super.setType(PassiveMsgType.ROBOT_FRIENDS_MSG.getValue());
	}

	public String getRobot_wxid() {
		return robot_wxid;
	}

	public RobotFriendsQuery setRobot_wxid(String robot_wxid) {
		this.robot_wxid = robot_wxid;
		return this;
	}

	public String getIs_refresh() {
		return is_refresh;
	}	

}
