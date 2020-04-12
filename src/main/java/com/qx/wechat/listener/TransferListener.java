package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.TransferEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 10:05:13 PM
 *
 * @since: 1.0.0
 *
 */

@Component
public class TransferListener implements ApplicationListener<TransferEvent>{

	@Override
	public void onApplicationEvent(TransferEvent event) {
		
	}

}
