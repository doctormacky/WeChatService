package com.qx.wechat.comm.sdk.request.msg.event;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * 接收微信好友付款
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 5:28:01 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveAcceptTransferMsg extends PassiveAcceptMsg{
	
	private static final long serialVersionUID = 6391789762074622742L;

	private String friend_wxid;
	
	//转账事件原消息, 是一个json string,可以直接从Msg.getMsg()获取得到
	private String msg;
	
	public PassiveAcceptTransferMsg() {
		super.setType(PassiveMsgType.ROBOT_ACCEPT_TRANSFER_MSG.getValue());
	}

	public String getFriend_wxid() {
		return friend_wxid;
	}

	public PassiveAcceptTransferMsg setFriend_wxid(String friend_wxid) {
		this.friend_wxid = friend_wxid;
		return this;
	}

	public String getMsg() {
		return msg;
	}
	
	public PassiveAcceptTransferMsg setMsg(String msg) {
		this.msg = msg;
		return this;
	}
}
