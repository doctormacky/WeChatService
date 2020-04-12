package com.qx.wechat.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qx.wechat.model.Msg;
import com.qx.wechat.service.DispatchService;

import io.swagger.annotations.ApiOperation;

@RestController
public class WechatController {

	@Autowired
    private DispatchService dispatchService;
	@ApiOperation(value="wechatapi", notes="wechatapi")
	@RequestMapping(value = "/api")
	public ResponseEntity<String> callback(
			HttpServletRequest request,
			@RequestBody String body){
		Msg msg = new Msg();
        msg.setRequestId(toInt(request.getParameter("rid")));
        msg.setMsgType(toInt(request.getParameter("msg_type")));
        msg.setType(toInt(request.getParameter("type")));
        msg.setMsgId(toInt(request.getParameter("msg_id")));
        msg.setRobotWxid(request.getParameter("robot_wxid"));
        msg.setFromWxid(request.getParameter("from_wxid"));
        msg.setFromName(request.getParameter("from_name"));
        msg.setFinalFromWxid(request.getParameter("final_from_wxid"));
        msg.setFinalFromName(request.getParameter("final_from_name"));
        msg.setMsg(request.getParameter("msg"));
        msg.setMsgTime(toInt(request.getParameter("time")));
        msg.setFileUrl(request.getParameter("file_url"));
        System.out.println(msg);
        try {
            dispatchService.disp(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = "rtn ok";
        return new ResponseEntity<String>(result,HttpStatus.OK);
	}
	private Integer toInt(String agr){
        return agr!=null ? Integer.valueOf(agr) : 0;
    }
}
