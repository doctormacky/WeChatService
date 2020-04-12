package com.qx.wechat.comm.sdk.request.msg;

import java.util.HashMap;
/**
 * 链接消息
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 1:19:53 PM
 *
 * @since: 1.0.0
 *
 * @Copyright: 2020 IBM All rights reserved.
 */
public class PassiveLinkSendMsg extends PassiveMsg {

	private static final long serialVersionUID = -8587580929257693172L;
	// 链接标题
	private String title;
	// 链接内容
	private String text;
	// 跳转连接
	private String linkUrl;
	// 图片链接
	private String picUrl;

	public PassiveLinkSendMsg() {
		super.setType(PassiveMsgType.LINK_MSG.getValue());
	}

	public PassiveLinkSendMsg setTitle(String title) {
		this.title = title;
		return this;
	}

	public PassiveLinkSendMsg setText(String text) {
		this.text = text;
		return this;
	}

	public PassiveLinkSendMsg setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
		return this;
	}

	public PassiveLinkSendMsg setPicUrl(String picUrl) {
		this.picUrl = picUrl;
		return this;
	}

	public PassiveLinkSendMsg setMsg() {
		HashMap<String, String> link = new HashMap<String, String>();
		link.put("title", title);
		link.put("text", text);
		link.put("url", linkUrl);
		link.put("pic", picUrl);
		super.setMsg(link.toString());
		return this;
	}
}
