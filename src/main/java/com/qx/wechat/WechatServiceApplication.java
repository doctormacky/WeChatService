package com.qx.wechat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WechatServiceApplication {

	public static void main(String[] args) {
		//System.setProperty("api.url.host", "http://localhost:8073");
		SpringApplication.run(WechatServiceApplication.class, args);
	}

}
