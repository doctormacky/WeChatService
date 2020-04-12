package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 10:03:44 PM
 *
 * @since: 1.0.0
 *
 */
public class TransferEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1733941309145726878L;

	public TransferEvent(Object source) {
		super(source);
		
	}

}
