package com.qx.wechat.tencent.text2speach;

import com.github.dadiyang.httpinvoker.annotation.Form;
import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.annotation.RetryPolicy;

@HttpApi("https://api.ai.qq.com")
@RetryPolicy
public interface ITencentText2Speach {

	@Form
	@HttpReq(value = "/fcgi-bin/aai/aai_tts", method = "POST")
	public String send(@Param TencentText2Speach tp);
}
