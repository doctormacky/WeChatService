package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 8:35:32 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveGroupQuiteActionMsg extends PassiveActionMsg{
	
	private static final long serialVersionUID = 6968882591788073960L;
	
	private String group_wxid;
	
	public PassiveGroupQuiteActionMsg() {
		super.setType(PassiveMsgType.ROBOT_QUITE_GROUP_MSG.getValue());
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public PassiveGroupQuiteActionMsg setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}
}
