package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * 私人消息收到后的事件
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:21:29 PM
 *
 * @since: 1.0.0
 *
 */
public class PrivateMsgEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = -8315273556318499633L;
	public PrivateMsgEvent(Object source) {
		super(source);
	}
	
}
