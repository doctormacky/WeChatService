package com.qx.wechat.comm.sdk.request.msg;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:07:00 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveTextSendMsg extends PassiveMsg{
	
	private static final long serialVersionUID = 929204027660555935L;
	
	public PassiveTextSendMsg(){
		super.setType(PassiveMsgType.TEXT_MSG.getValue());
	}
	
	@Override
	public PassiveTextSendMsg setMsg(String msg) {
		try {
			super.setMsg(URLEncoder.encode(msg, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return this;
	}

}
