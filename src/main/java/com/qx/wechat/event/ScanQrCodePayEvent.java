package com.qx.wechat.event;

import org.springframework.context.ApplicationEvent;

/**
 * 二维码扫描付款
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:58:23 PM
 *
 * @since: 1.0.0
 *
 */
public class ScanQrCodePayEvent extends ApplicationEvent{
	
	private static final long serialVersionUID = -8187461319181545518L;

	public ScanQrCodePayEvent(Object source) {
		super(source);
	}

}
