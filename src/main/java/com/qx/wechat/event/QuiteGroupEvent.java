package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:50:02 PM
 *
 * @since: 1.0.0
 *
 */
public class QuiteGroupEvent extends ApplicationEvent{

	
	private static final long serialVersionUID = 9103859482039177354L;

	public QuiteGroupEvent(Object source) {
		super(source);
		
	}

}
