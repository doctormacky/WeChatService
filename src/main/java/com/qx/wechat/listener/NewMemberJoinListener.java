package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.event.NewMemberJoinGroupEvent;
import com.qx.wechat.model.Msg;

@Component
public class NewMemberJoinListener implements ApplicationListener<NewMemberJoinGroupEvent>{

	@Override
	public void onApplicationEvent(NewMemberJoinGroupEvent event) {
		
		Msg msg = (Msg)event.getSource();
		//TODO
		System.out.println(msg.getMsgTime());
	}
	

}
