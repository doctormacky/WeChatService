package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.PrivateMsgEvent;
import com.qx.wechat.model.Msg;

@Component
public class GroupMsgListener implements ApplicationListener<PrivateMsgEvent>{

	@Override
	public void onApplicationEvent(PrivateMsgEvent event) {
		Msg msg = (Msg)event.getSource();
		//TODO
		System.out.println(msg.getMsgTime());
	}

}
