package com.qx.wechat.comm.sdk.http;

import com.github.dadiyang.httpinvoker.annotation.Form;
import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.annotation.RetryPolicy;
import com.qx.wechat.comm.sdk.criteria.FormData;

@HttpApi("${api.url.host}")
@RetryPolicy
public interface IHttpHelper {
	
	@Form
	@HttpReq(value = "/send", method = "POST")
	@RetryPolicy(times = 2, fixedBackOffPeriod = 3000)
	public String sendMsg(@Param FormData data);
	
	@Form
	@HttpReq(value = "/send", method = "POST")
	@RetryPolicy(times = 2, fixedBackOffPeriod = 3000)
	public String query(@Param FormData data);

}
