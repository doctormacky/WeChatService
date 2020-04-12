package com.qx.wechat.comm.sdk.request.query;

/**
 * 最基础的 query实体
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 1:42:43 PM
 *
 * @since: 1.0.0
 *
 * @Copyright: 2020 IBM All rights reserved.
 */
public class BasicQuery implements  java.io.Serializable{
	private static final long serialVersionUID = -1875449593187760594L;
	private String type;

	public String getType() {
		return type;
	}

	public BasicQuery setType(String type) {
		this.type = type;
		return this;
	}
	
	

}
