package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:45:30 PM
 *
 * @since: 1.0.0
 *
 */
public class NewMemberJoinGroupEvent extends ApplicationEvent{

	private static final long serialVersionUID = -3944622812269059242L;
	
	public NewMemberJoinGroupEvent(Object source) {
		super(source);
	}
	

}
