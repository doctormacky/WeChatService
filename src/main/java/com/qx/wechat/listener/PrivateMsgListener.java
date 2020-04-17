package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.qx.wechat.comm.sdk.WeXinApi;
import com.qx.wechat.event.PrivateMsgEvent;
import com.qx.wechat.model.Msg;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:23:40 PM
 *
 * @since: 1.0.0
 *
 *
 */
@Component
public class PrivateMsgListener implements ApplicationListener<PrivateMsgEvent>{

	@Override
	public void onApplicationEvent(PrivateMsgEvent event) {
		Msg msg = (Msg)event.getSource();
		WeXinApi.sendTextMsg(msg.getRobotWxid(), msg.getFromWxid(), "我已经收到你的消息:"+msg.getMsg()+"洗洗睡吧。。。");

	}

}
