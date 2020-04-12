package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.FriendVefiryEvent;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:56:14 PM
 *
 * @since: 1.0.0
 *
 */
@Component
public class FriendVerifyListener implements ApplicationListener<FriendVefiryEvent>{

	@Override
	public void onApplicationEvent(FriendVefiryEvent event) {
		//
	}

}
