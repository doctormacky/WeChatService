package com.qx.wechat.comm.sdk.request.msg;

/**
 * 
 * 所有主动发送给《可爱猫》的消息类别
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 11:14:15 AM
 *
 * @since: 1.0.0
 *
 */
public enum PassiveMsgType {
	
/*****************发送消息******************/
	//文本消息
	TEXT_MSG("100"),
	//群消息 并且@ 某人
	GROUP_AT_TEXT_MSG("102"),
	//图片消息
	IMG_MSG("103"),
	//视频消息
	VIDEO_MSG("104"),
	//文件消息
	FILE_MSG("105"),
	//emoji 消息
	EMOJI_MSG("106"),
	//link 消息
	LINK_MSG("107"),
	//音乐消息
	MUSIC_MSG("108"),
/*****************查询消息******************/
	// 机器人名称
	ROBOT_NAME_MSG("201"),
	// 机器人头像
	ROBOT_IMG_MSG("202"),
	// 机器人列表
	ROBOT_LIST_MSG("203"),
	// 机器人 好友列表
	ROBOT_FRIENDS_MSG("204"),
	// 机器人群列表
	ROBOT_GROUPS_MSG("205"),
	// 机器人群成员列表
	ROBOT_GROUP_MEMBERS_MSG("206"),
	// 机器人群成员信息
	ROBOT_GROUP_MEMBER_MSG("207"),
/*****************同意类消息******************/
	// 机器人接受好友转账
	ROBOT_ACCEPT_TRANSFER_MSG("301"),
	// 机器人同意群聊邀请
	ROBOT_ACCEPT_GROUP_CAHT_MSG("302"),
	// 机器人同意好友申请
	ROBOT_ACCEPT_FRIEND_REQUEST_MSG("303"),
/*************微信 属性，操作类消息*********/
	// 修改好友备注
	ROBOT_UPDATE_FRIEND_NOTE_MSG("304"),
	// 删除好友
	ROBOT_DELETE_FRIEND_MSG("305"),
	// 剔除成员
	ROBOT_REMOVE_GROUP_MEMBER_MSG("306"),
	// 修改群名称
	ROBOT_UPDATE_GROUP_NAME_MSG("307"),
	// 修改群公告
	ROBOT_UPDATE_GROUP_NOTICE_MSG("308"),
	// 新建群
	ROBOT_CREATE_GROUP_MSG("309"),
	// 退出群
	ROBOT_QUITE_GROUP_MSG("310"),
	// 邀请加入群聊
	ROBOT_INVITE_GROUP_MSG("311");
	
	
	
	private String value;

	PassiveMsgType(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
