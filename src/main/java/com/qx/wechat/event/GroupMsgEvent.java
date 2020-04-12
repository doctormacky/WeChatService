package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:38:53 PM
 *
 * @since: 1.0.0
 *
 */
public class GroupMsgEvent extends ApplicationEvent{

	private static final long serialVersionUID = -5776836749799846840L;

	public GroupMsgEvent(Object source) {
		super(source);
	}

	
}
