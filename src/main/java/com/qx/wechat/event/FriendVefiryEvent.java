package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;


/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:55:05 PM
 *
 * @since: 1.0.0
 *
 */
public class FriendVefiryEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7564356148925485918L;

	public FriendVefiryEvent(Object source) {
		super(source);
	}

}
