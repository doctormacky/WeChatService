package com.qx.wechat.comm.sdk.request.msg;

/**
 * 
 * 文件消息
 * msg 为文件的绝对地址
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 1:02:55 PM
 *
 * @since: 1.0.0
 *
 */
public class PassiveFileSendMsg extends PassiveMsg{

	private static final long serialVersionUID = 3280418901713031677L;
	public PassiveFileSendMsg(){
		super.setType(PassiveMsgType.FILE_MSG.getValue());
	}
}
