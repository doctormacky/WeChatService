package com.qx.wechat.service;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.qx.wechat.comm.enums.RequestTypeEnum;
import com.qx.wechat.event.FriendVefiryEvent;
import com.qx.wechat.event.GroupMsgEvent;
import com.qx.wechat.event.NewMemberJoinGroupEvent;
import com.qx.wechat.event.PrivateMsgEvent;
import com.qx.wechat.event.QuiteGroupEvent;
import com.qx.wechat.event.ScanQrCodePayEvent;
import com.qx.wechat.event.TransferEvent;
import com.qx.wechat.model.Msg;
/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 9:26:57 PM
 *
 * @since: 1.0.0
 *
 */
@Service
public class DispatchService {
	
	@Autowired
    ApplicationContext context;
	
    public void disp(Msg msg) throws IOException {
        RequestTypeEnum requestTypeEnum = RequestTypeEnum.map.get(msg.getType());
//        Integer msgType = msg.getMsgType();
//        String msgTypeDesc = null;
//        if(msgType == 0) {
//        	msgTypeDesc = "未知";
//        }else {
//        	msgTypeDesc = MsgTypeEnum.map.get(msg.getMsgType()).getDesc();
//        }
//        
//        System.out.println("收到msg，事件code: "+requestTypeEnum.getType()+" ("+requestTypeEnum.getDesc()+" - "+msgTypeDesc+") msg: "+msg.getMsg());
        switch (requestTypeEnum){
            case PRIVATE:
            	context.publishEvent(new PrivateMsgEvent(msg));
                break;
            case GROUP:
            	context.publishEvent(new GroupMsgEvent(msg));
                break;
            case UNKNOW:
            	context.publishEvent(new PrivateMsgEvent(msg));
                break;
            case MEMBER_ADD:
            	context.publishEvent(new NewMemberJoinGroupEvent(msg));
                break;
            case MEMBER_DEC:
            	context.publishEvent(new QuiteGroupEvent(msg));
                break;
            case VERFIGY:
            	context.publishEvent(new FriendVefiryEvent(msg));
                break;
            case SCAN_CASH_MONEY:
            	context.publishEvent(new ScanQrCodePayEvent(msg));
                break;
            case TRANSFER:
            	context.publishEvent(new TransferEvent(msg));
                break;
            case STARTUP:
                break;
            case LOGIN_SUCC:
                break;
            case LOGIN_OFF:
                break;
            default:
                break;
        }
    }
}
