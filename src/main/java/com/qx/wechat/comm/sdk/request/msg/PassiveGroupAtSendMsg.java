package com.qx.wechat.comm.sdk.request.msg;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:44:35 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveGroupAtSendMsg extends PassiveMsg{
	
	private static final long serialVersionUID = 4126182982943599355L;
	
    private String at_wxid;// 艾特的id，群成员的id
    private String at_name;// 艾特的昵称，群成员的昵称

	public PassiveGroupAtSendMsg(){
		super.setType(PassiveMsgType.GROUP_AT_TEXT_MSG.getValue());
	}
	
	@Override
	public PassiveGroupAtSendMsg setMsg(String msg) {
		try {
			super.setMsg(URLEncoder.encode(msg, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return this;
	}

	public String getAt_wxid() {
		return at_wxid;
	}

	public PassiveGroupAtSendMsg setAt_wxid(String at_wxid) {
		this.at_wxid = at_wxid;
		return this;
	}

	public String getAt_name() {
		return at_name;
	}

	public PassiveGroupAtSendMsg setAt_name(String at_name) {
		this.at_name = at_name;
		return this;
	}
	
}
