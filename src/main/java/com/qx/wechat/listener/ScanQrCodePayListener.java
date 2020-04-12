package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.ScanQrCodePayEvent;

/**
 * 二维码扫描付款
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 10:00:15 PM
 *
 * @since: 1.0.0
 *
 */
@Component
public class ScanQrCodePayListener implements ApplicationListener<ScanQrCodePayEvent>{
	@Override
	public void onApplicationEvent(ScanQrCodePayEvent event) {
		
	}

}
