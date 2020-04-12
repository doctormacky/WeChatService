package com.qx.wechat.comm.sdk.request.msg.event;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 同意群聊邀请
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 5:54:03 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveAcceptGroupChatInviteMsg extends PassiveAcceptMsg{
	
	private static final long serialVersionUID = 6477874633784180197L;
	
	private String msg;
	
	public String getMsg() {
		return msg;
	}
	
	public PassiveAcceptGroupChatInviteMsg(String msg) {
		setMsg(msg);
	}
	
	public PassiveAcceptGroupChatInviteMsg() {
		super.setType(PassiveMsgType.ROBOT_ACCEPT_GROUP_CAHT_MSG.getValue());
	}

	public PassiveAcceptGroupChatInviteMsg setMsg(String msg) {
		this.msg = msg;
		return this;
	}
}
