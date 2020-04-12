package com.qx.wechat.comm.sdk.request.msg;

/**
 * Emoji 消息
 * 
 * msg 是gif的绝对地址
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 1:07:33 PM
 *
 * @since: 1.0.0
 * 
 */
public class PassiveEmojiSendMsg extends PassiveMsg {
	private static final long serialVersionUID = 575256190965057445L;

	public PassiveEmojiSendMsg() {
		super.setType(PassiveMsgType.EMOJI_MSG.getValue());
	}

}
