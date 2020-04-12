package com.qx.wechat.comm.sdk.criteria;

/**
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 5:18:41 PM
 *
 * @since: 1.0.0
 *
 */
public class TransferData implements java.io.Serializable{
	
	private static final long serialVersionUID = -2529348466901441667L;
	//1 代表有人转账了，但是还没有收款 
	//3 代表有人转账，而且机器人收款了 
	private String paysubtype;
	//1代表收到消息了
	private int is_arrived;
	//0代表没好有收款，1代表已经收款了
	private int is_received;
	//接收者pay id
	private String receiver_pay_id;
	//付款金额,以元为单位
	private String money;
	//支付id
	private String pay_id;
	//支付者 pay id
	private String payer_pay_id;
	//标记
	private String remark;
	//机器人支付id，应该跟当前 接收者id是一样的
	private String robot_pay_id;
	//不很重要的msg
	private String update_msg;
	public String getPaysubtype() {
		return paysubtype;
	}
	public void setPaysubtype(String paysubtype) {
		this.paysubtype = paysubtype;
	}
	public int getIs_arrived() {
		return is_arrived;
	}
	public void setIs_arrived(int is_arrived) {
		this.is_arrived = is_arrived;
	}
	public int getIs_received() {
		return is_received;
	}
	public void setIs_received(int is_received) {
		this.is_received = is_received;
	}
	public String getReceiver_pay_id() {
		return receiver_pay_id;
	}
	public void setReceiver_pay_id(String receiver_pay_id) {
		this.receiver_pay_id = receiver_pay_id;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getPay_id() {
		return pay_id;
	}
	public void setPay_id(String pay_id) {
		this.pay_id = pay_id;
	}
	public String getPayer_pay_id() {
		return payer_pay_id;
	}
	public void setPayer_pay_id(String payer_pay_id) {
		this.payer_pay_id = payer_pay_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRobot_pay_id() {
		return robot_pay_id;
	}
	public void setRobot_pay_id(String robot_pay_id) {
		this.robot_pay_id = robot_pay_id;
	}
	public String getUpdate_msg() {
		return update_msg;
	}
	public void setUpdate_msg(String update_msg) {
		this.update_msg = update_msg;
	}
}
