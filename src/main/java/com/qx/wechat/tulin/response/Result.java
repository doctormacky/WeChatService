package com.qx.wechat.tulin.response;

import java.util.Map;

public class Result {

	
	//‘组’编号:0为独立输出，大于0时可能包含同组相关内容 (如：音频与文本为一组时说明内容一致)
	private int groupType;
	//文本(text);连接(url);音频(voice);视频(video);图片(image);图文(news)
	private String resultType;
	
	private Map<String,Object>values;

	public int getGroupType() {
		return groupType;
	}

	public void setGroupType(int groupType) {
		this.groupType = groupType;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public Map<String, Object> getValues() {
		return values;
	}

	public void setValues(Map<String, Object> values) {
		this.values = values;
	}
}
