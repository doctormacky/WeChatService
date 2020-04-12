package com.qx.wechat.comm.sdk.request.msg;

/**
 * 
 * 视频消息
 * msg 为视频源的绝对地址
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:57:42 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveVideoSendMsg extends PassiveMsg{

	private static final long serialVersionUID = -1237608915864945983L;

	public PassiveVideoSendMsg(){
		super.setType(PassiveMsgType.VIDEO_MSG.getValue());
	}
}
