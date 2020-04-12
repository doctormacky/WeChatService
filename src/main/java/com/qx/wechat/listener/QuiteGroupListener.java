package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.QuiteGroupEvent;

@Component
public class QuiteGroupListener implements ApplicationListener<QuiteGroupEvent>{

	@Override
	public void onApplicationEvent(QuiteGroupEvent event) {
		//TODO
	}

}
