package com.qx.wechat.qyk;

import com.github.dadiyang.httpinvoker.annotation.HttpApi;
import com.github.dadiyang.httpinvoker.annotation.HttpReq;
import com.github.dadiyang.httpinvoker.annotation.Param;
import com.github.dadiyang.httpinvoker.annotation.RetryPolicy;

@HttpApi("http://api.qingyunke.com")
@RetryPolicy
public interface IQYK {
	
	@HttpReq(value = "/api.php", method = "GET")
	public QingYunKeResponse send(@Param("key") String key, @Param("appid")int appid,@Param("msg")String msg );
}