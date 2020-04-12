package com.qx.wechat.comm.sdk.request.msg.action;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

public class PassiveGroupNoticeUpdateActionMsg extends PassiveActionMsg{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5527252477710626179L;
	
	private String group_wxid;
	
	private String notice;
	
	public PassiveGroupNoticeUpdateActionMsg() {
		super.setType(PassiveMsgType.ROBOT_UPDATE_GROUP_NOTICE_MSG.getValue());
	}

	public String getGroup_wxid() {
		return group_wxid;
	}

	public PassiveGroupNoticeUpdateActionMsg setGroup_wxid(String group_wxid) {
		this.group_wxid = group_wxid;
		return this;
	}

	public String getNotice() {
		return notice;
	}

	public PassiveGroupNoticeUpdateActionMsg setNotice(String notice) {
		this.notice = notice;
		return this;
	}
	
	

}
