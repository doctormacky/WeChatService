package com.qx.wechat.tulin.response;

import java.util.List;

public class TuLinResponse {
	
	private Intent intent;
	
	private List<Result>results;

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
	
}
