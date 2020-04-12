package com.qx.wechat.comm.sdk.request.msg;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 音乐消息
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 1:28:33 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveMusicSendMsg extends PassiveMsg{
	
	private static final long serialVersionUID = 3905563961902005931L;
	
	public PassiveMusicSendMsg() {
		super.setType(PassiveMsgType.MUSIC_MSG.getValue());
	}
	
	@Override
	public PassiveMusicSendMsg setMsg(String msg) {
		try {
			super.setMsg(URLEncoder.encode(msg, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return this;
	}

}
