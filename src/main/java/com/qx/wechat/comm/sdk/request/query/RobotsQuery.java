package com.qx.wechat.comm.sdk.request.query;

import com.qx.wechat.comm.sdk.request.msg.PassiveMsgType;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 2:28:27 PM
 *
 * @since: 1.0.0
 *
 */
public class RobotsQuery extends BasicQuery{
	
	private static final long serialVersionUID = 1431001139973628675L;

	public RobotsQuery() {

		super.setType(PassiveMsgType.ROBOT_LIST_MSG.getValue());
	}

}
