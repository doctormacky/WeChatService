package com.qx.wechat.comm.sdk.request.msg;

/**
 * 
 * 图片消息体
 * msg代表图片的绝对地址
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:53:32 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveImgSendMsg extends PassiveMsg{
	
	private static final long serialVersionUID = -4256964805113695463L;

	public PassiveImgSendMsg(){
		super.setType(PassiveMsgType.IMG_MSG.getValue());
	}
}
