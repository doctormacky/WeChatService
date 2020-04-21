package com.qx.wechat.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.qx.wechat.comm.sdk.WeXinApi;
import com.qx.wechat.comm.sdk.criteria.TransferData;
import com.qx.wechat.event.TransferEvent;
import com.qx.wechat.model.Msg;

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
		Msg msg = (Msg)event.getSource();
		System.out.println(msg.getMsg());
		TransferData td = JSON.parseObject(msg.getMsg(), TransferData.class);
		WeXinApi.acceptTransfer(
				msg.getRobotWxid(), 
				msg.getFromWxid(), 
				td);
		
		WeXinApi.sendTextMsg(msg.getRobotWxid(), msg.getFromWxid(),
				"哥收到你的转账金额："+td.getMoney()+", remark:"+td.getRemark() +",洗洗睡吧。");
	}

}
