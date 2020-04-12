package com.qx.wechat.comm.sdk.request.msg.action;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 7:04:09 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveFriendAliaNameMsg extends PassiveActionMsg{
	
	private static final long serialVersionUID = 2179322416532272669L;
	
	private String friend_wxid;
	
	private String note;

	public String getFriend_wxid() {
		return friend_wxid;
	}

	public PassiveFriendAliaNameMsg() {
		super.setType(PassiveMsgType.ROBOT_UPDATE_FRIEND_NOTE_MSG.getValue());
	}
	
	
	public PassiveFriendAliaNameMsg setFriend_wxid(String friend_wxid) {
		this.friend_wxid = friend_wxid;
		return this;
	}

	public String getNote() {
		return note;
	}

	public PassiveFriendAliaNameMsg setNote(String note) {
		try {
			this.note = URLEncoder.encode(note, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return this;
	}

}
