package com.qx.wechat.tulin.request;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 17, 2020 9:28:42 PM
 *
 * @since: 1.0.0
 *
 */
public class Perception {
	
	private InputText inputText;
	
	private InputImage inputImage;
	
	private SelfInfo selfInfo;

	public InputText getInputText() {
		return inputText;
	}

	public Perception setInputText(InputText inputText) {
		this.inputText = inputText;
		return this;
	}

	public InputImage getInputImage() {
		return inputImage;
	}

	public Perception setInputImage(InputImage inputImage) {
		this.inputImage = inputImage;
		return this;
	}

	public SelfInfo getSelfInfo() {
		return selfInfo;
	}

	public Perception setSelfInfo(SelfInfo selfInfo) {
		this.selfInfo = selfInfo;
		return this;
	}

}
