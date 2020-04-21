package com.qx.wechat.tencent.text2speach;

import java.io.IOException;

import com.alibaba.fastjson.JSON;
import com.github.dadiyang.httpinvoker.HttpApiProxyFactory;
import com.qx.wechat.kit.FileKit;

public class Main {

	public static void main(String[] args) throws IOException {
		ITencentText2Speach tencent = new HttpApiProxyFactory().getProxy(ITencentText2Speach.class);
		String str = tencent.send(new TencentText2Speach()
				.setApp_id(2134770574)
				.setApp_key("zFg5yclT4DbTFHHd").setText("何妈妈，该做饭了。先淘米，再炒菜！").initSign());
		TecentText2SpeachResponse tr = JSON.parseObject(str, TecentText2SpeachResponse.class);
		FileKit.decoderBase64File(tr.getData().getSpeech(),"/Users/doctormacky/Desktop/report/test.wav");
	}
	
	

}
