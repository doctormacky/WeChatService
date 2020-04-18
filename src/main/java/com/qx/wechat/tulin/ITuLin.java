package com.qx.wechat.tulin;

import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.annotation.RetryPolicy;
import com.qx.wechat.tulin.request.TuLinRequest;
import com.qx.wechat.tulin.response.TuLinResponse;

@HttpApi("http://openapi.tuling123.com")
@RetryPolicy
public interface ITuLin {
	
	@HttpReq(value = "/openapi/api/v2", method = "POST")
	public TuLinResponse send(@Param TuLinRequest request);
}
