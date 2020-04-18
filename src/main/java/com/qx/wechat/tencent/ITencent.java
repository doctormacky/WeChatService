package com.qx.wechat.tencent;

import com.github.dadiyang.httpinvoker.annotation.Form;
import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.annotation.RetryPolicy;

@HttpApi("https://api.ai.qq.com")
@RetryPolicy
public interface ITencent {
	
	@Form
	@HttpReq(value = "/fcgi-bin/nlp/nlp_textchat", method = "POST")
	public TencentReponse send(@Param TencentTalk tt);
}
