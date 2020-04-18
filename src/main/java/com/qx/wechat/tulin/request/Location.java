package com.qx.wechat.tulin.request;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 17, 2020 9:27:38 PM
 *
 * @since: 1.0.0
 *
 */
public class Location {
	
	private String city = "上海";
	
	private String province;
	
	private String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
