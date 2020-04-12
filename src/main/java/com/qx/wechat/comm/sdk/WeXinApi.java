package com.qx.wechat.comm.sdk;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.github.dadiyang.httpinvoker.HttpApiProxyFactory;
import com.qx.wechat.comm.sdk.criteria.FormData;
import com.qx.wechat.comm.sdk.criteria.TransferData;
import com.qx.wechat.comm.sdk.http.IHttpHelper;
import com.qx.wechat.comm.sdk.request.msg.PassiveEmojiSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveFileSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveGroupAtSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveImgSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveLinkSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveMusicSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveTextSendMsg;
import com.qx.wechat.comm.sdk.request.msg.PassiveVideoSendMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveFriendAliaNameMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveFriendDeleteActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupCreationActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupInviteActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupMemberRemoveActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupNameUpdateActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupNoticeUpdateActionMsg;
import com.qx.wechat.comm.sdk.request.msg.action.PassiveGroupQuiteActionMsg;
import com.qx.wechat.comm.sdk.request.msg.event.PassiveAcceptFriendRequestMsg;
import com.qx.wechat.comm.sdk.request.msg.event.PassiveAcceptGroupChatInviteMsg;
import com.qx.wechat.comm.sdk.request.msg.event.PassiveAcceptTransferMsg;
import com.qx.wechat.comm.sdk.request.query.RobotFriendsQuery;
import com.qx.wechat.comm.sdk.request.query.RobotGroupMemberInfoQuery;
import com.qx.wechat.comm.sdk.request.query.RobotGroupMembersQuery;
import com.qx.wechat.comm.sdk.request.query.RobotGroupsQuery;
import com.qx.wechat.comm.sdk.request.query.RobotImgQuery;
import com.qx.wechat.comm.sdk.request.query.RobotNameQuery;
import com.qx.wechat.comm.sdk.request.query.RobotsQuery;
import com.qx.wechat.comm.sdk.response.Friend;
import com.qx.wechat.comm.sdk.response.Group;
import com.qx.wechat.comm.sdk.response.GroupMember;
import com.qx.wechat.comm.sdk.response.GroupMemberDetail;
import com.qx.wechat.comm.sdk.response.Robot;
import com.qx.wechat.comm.utils.ResultKit;

/**
 * 微信操作统一接口
 * 
 * @author Macky(liuyunsh@cn.ibm.com)
 *
 * @date: Apr 12, 2020 12:33:09 PM
 *
 * @since: 1.0.0
 *
 */
public class WeXinApi {

	/**
	 * 发送文本消息 (可以是群消息，也可以是私人消息)
	 * 
	 * @param msg        发送消息文本
	 * @param fromWxId   发出者微信id(机器人id)
	 * @param toWxId     接收者微信id
	 */
	public static void sendTextMsg(String fromWxId, String toWxId, String msg) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveTextSendMsg textMsg = new PassiveTextSendMsg();
		textMsg.setMsg(msg).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(textMsg);
		helper.sendMsg(c);
	}

	/**
	 * 发送群消息，并且@某人
	 * 
	 * @param fromWxId     发送者微信id
	 * @param toWxId       接收者微信id
	 * @param atWxId       at接收者id
	 * @param atWxName     at接收者名字
	 * @param msg          消息文本
	 */
	public static void sendGroupAtMsg(String fromWxId, String toWxId, String atWxId, String atWxName, String msg) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupAtSendMsg gMsg = new PassiveGroupAtSendMsg();
		gMsg.setAt_name(atWxName).setAt_wxid(atWxId).setMsg(msg).setRobot_wxid(fromWxId);
		FormData c = FormData.initCriteria(gMsg);
		helper.sendMsg(c);
	}

	/**
	 * 发送图片消息
	 * 
	 * @param fromWxId   发送者微信id
	 * @param toWxId     接收者微信id
	 * @param picPath    图片绝对地址
	 */
	public static void sendImageMsg(String fromWxId, String toWxId, String picPath) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveImgSendMsg msg = new PassiveImgSendMsg();
		msg.setMsg(picPath).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);
	}

	/**
	 * 发送视频消息
	 * 
	 * @param fromWxId     发送者微信id
	 * @param toWxId       接收者微信id
	 * @param videoPath    视频绝对地址
	 */
	public static void sendVideoMsg(String fromWxId, String toWxId, String videoPath) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveVideoSendMsg msg = new PassiveVideoSendMsg();
		msg.setMsg(videoPath).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);
	}

	/**
	 * 发送文件消息
	 * 
	 * @param fromWxId     发送者微信id
	 * @param toWxId       接收者微信id
	 * @param filePath     文件绝对地址
	 */
	public static void sendFileMsg(String fromWxId, String toWxId, String filePath) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveFileSendMsg msg = new PassiveFileSendMsg();
		msg.setMsg(filePath).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);
	}

	/**
	 * 发送 emoji消息
	 * 
	 * @param fromWxId      发送者微信id
	 * @param toWxId        接收者微信id
	 * @param emojiPath     emoji绝对地址
	 */
	public static void sendEmojiMsg(String fromWxId, String toWxId, String emojiPath) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveEmojiSendMsg msg = new PassiveEmojiSendMsg();
		msg.setMsg(emojiPath).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);
	}

	/**
	 * 发送链接消息
	 * 
	 * @param fromWxId 发送者微信id
	 * @param toWxId   接收者微信id
	 * @param linkUrl  内容链接
	 * @param picUrl   图片链接
	 * @param title    链接标题
	 * @param text     链接内容
	 */
	public static void sendLinkMsg(String fromWxId, String toWxId, String linkUrl, String picUrl, String title,
			String text) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveLinkSendMsg msg = new PassiveLinkSendMsg();
		msg.setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		msg.setLinkUrl(linkUrl).setPicUrl(picUrl).setText(text).setTitle(title);
		msg.setMsg();
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);
	}

	/**
	 * 发送音乐消息
	 * 
	 * @param fromWxId
	 * @param toWxId
	 * @param musicName 音乐名称
	 */
	public static void sendMusicMsg(String fromWxId, String toWxId, String musicName) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveMusicSendMsg msg = new PassiveMusicSendMsg();
		msg.setMsg(musicName).setRobot_wxid(fromWxId).setTo_wxid(toWxId);
		FormData c = FormData.initCriteria(msg);
		helper.sendMsg(c);

	}

	/**
	 * 查询机器人微信名
	 * 
	 * @param robotWxId
	 * @return
	 */
	public static String queryRobotName(String robotWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		FormData c = FormData.initCriteria(new RobotNameQuery().setRobot_wxid(robotWxId));
		return ResultKit.packageResult(helper.query(c));
	}

	/**
	 * 目前测试出来是空的，要等可爱猫的更新， 可以考虑用queryAllRobots()代替
	 * 
	 * 查询微信机器人头像
	 * 
	 * @param robotWxId   机器人微信id
	 * @return
	 */
	public static String queryRobotHeadImge(String robotWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		FormData c = FormData.initCriteria(new RobotImgQuery().setRobot_wxid(robotWxId));
		String image = helper.query(c);
		return image;
	}

	/**
	 * 获取可爱猫已经登陆的所有机器人
	 * 
	 * @return
	 */
	public static List<Robot> queryAllRobots() {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		FormData c = FormData.initCriteria(new RobotsQuery());
		String result = helper.query(c);
		return ResultKit.packageResult(result, Robot.class);
	}

	/**
	 * 查询微信机所有好友
	 * @param robotWxId    当前微信id
	 * @param refresh      是否强制刷新
	 * @return
	 */
	public static List<Friend> queryAllFriends(String robotWxId, boolean refresh) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		FormData c = FormData.initCriteria(new RobotFriendsQuery().setRobot_wxid(robotWxId).setRefresh(refresh));
		String result = helper.query(c);
		return ResultKit.packageResult(result, Friend.class);
	}

	/**
	 * 查询机器人所有群
	 * @param robotWxId  微信机器人id
	 * @param refresh    是否强制刷新
	 * @return
	 */
	public static List<Group> queryAllGroups(String robotWxId, boolean refresh) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		FormData c = FormData.initCriteria(new RobotGroupsQuery().setRobot_wxid(robotWxId).setRefresh(refresh));
		String result = helper.query(c);
		return ResultKit.packageResult(result, Group.class);
	}

	/**
	 * 查询某个机器人的所有群列表
	 * @param robotWxId    机器人微信id
	 * @param groupWxId    微信机器人所在的群id
	 * @return
	 */
	public static List<GroupMember> queryGroupMembers(String robotWxId, String groupWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		RobotGroupMembersQuery rgmq = new RobotGroupMembersQuery();
		rgmq.setGroup_wxid(groupWxId).setRefresh(true).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(rgmq);
		String result = helper.query(c);
		return ResultKit.packageResult(result, GroupMember.class);
	}

	/**
	 * 查询单个群成员基本信息
	 * @param robotWxId          微信机器人id
	 * @param groupWxId          群id
	 * @param groupMemberWxId    群成员微信id
	 * @return
	 */
	public static GroupMemberDetail queryGroupMemeberInfo(String robotWxId, String groupWxId, String groupMemberWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		RobotGroupMemberInfoQuery rgmq = new RobotGroupMemberInfoQuery();
		rgmq.setGroup_wxid(groupWxId).setRobot_wxid(robotWxId).setMember_wxid(groupMemberWxId);
		FormData c = FormData.initCriteria(rgmq);
		String result = helper.query(c);
		return ResultKit.packageSingleResult(result, GroupMemberDetail.class);
	}
	
	/**
	 * 
	 * @param robotWxId     微信机器人id
	 * @param friendWxId    微信好友id
	 * @param event         支付事件，从Msg.getMsg()获取
	 */
	public static void acceptTransfer(String robotWxId,String friendWxId,TransferData event) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveAcceptTransferMsg pat = new PassiveAcceptTransferMsg();
		if(event.getIs_received() == 1) {
			return;
		}
		pat.setFriend_wxid(friendWxId).setMsg(JSON.toJSONString(event)).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pat);
		helper.sendMsg(c);
	}
	/**
	 * 同意群聊邀请
	 * @param robotWxId       微信机器人id
	 * @param msg             可以通过Msg.getMsg()获取
	 */
	public static void agreeGroupChatInvite(String robotWxId,String msg) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveAcceptGroupChatInviteMsg pat = new PassiveAcceptGroupChatInviteMsg();
		pat.setMsg(msg).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pat);
		helper.sendMsg(c);
	}
	
	/**
	 * 同意好友请求
	 * @param robotWxId    微信机器人id
	 * @param msg          可以通过Msg.getMsg()获取
	 */
	public static void agreeFriendRequest(String robotWxId,String msg) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveAcceptFriendRequestMsg pat = new PassiveAcceptFriendRequestMsg();
		pat.setMsg(msg).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pat);
		helper.sendMsg(c);
	}

	/**
	 * 修改好友备注
	 * @param robotWxId
	 * @param friendWxId
	 * @param note
	 */
	public static void updateFriendNote(String robotWxId, String friendWxId, String note) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveFriendAliaNameMsg pfa = new PassiveFriendAliaNameMsg();
		pfa.setNote(note).setFriend_wxid(friendWxId).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pfa);
		helper.sendMsg(c);
	}
	
	/**
	 * 删除好友
	 * @param robotWxId
	 * @param friendWxId
	 */
	public static void deleteFriend(String robotWxId, String friendWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveFriendDeleteActionMsg pfd = new PassiveFriendDeleteActionMsg();
		pfd.setFriend_wxid(friendWxId).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pfd);
		helper.sendMsg(c);
	}
	/**
	 * 踢出群成员
	 * @param robotWxId       微信机器人id
	 * @param groupWxId       群微信id
	 * @param memeberWxId     群成员id
	 */
	public static void removeGroupMember(String robotWxId,String groupWxId,String memeberWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupMemberRemoveActionMsg pfd = new PassiveGroupMemberRemoveActionMsg();
		pfd.setGroup_wxid(groupWxId).setMember_wxid(memeberWxId).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pfd);
		helper.sendMsg(c);
	}
	
	/**
	 * 更新群名称
	 * @param robotWxId        微信机器人id
	 * @param groupWxId        微信群id
	 * @param newGroupName     新的group名字
	 */
	public static void updateGroupName(String robotWxId,String groupWxId,String newGroupName) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupNameUpdateActionMsg pfd = new PassiveGroupNameUpdateActionMsg();
		pfd.setGroup_wxid(groupWxId).setGroup_name(newGroupName).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pfd);
		helper.sendMsg(c);
	}
	
	/**
	 * 更新群公告
	 * @param robotWxId     机器人微信id
	 * @param groupWxId     微信群id
	 * @param notice        群公告
	 */
	public static void updateGroupNotice(String robotWxId,String groupWxId,String notice) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupNoticeUpdateActionMsg pfd = new PassiveGroupNoticeUpdateActionMsg();
		pfd.setGroup_wxid(groupWxId).setNotice(notice).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pfd);
		helper.sendMsg(c);
	}
	
	/**
	 * 创建group
	 * @param robot_wxid    机器人微信id
	 * @param friendWxIds   朋友微信id,至少需要3个人才可以。
	 */
	public static void createGroup(String robot_wxid,List<String>friendWxIds) {
		if(friendWxIds == null || friendWxIds.isEmpty() || friendWxIds.size() < 2) {
			return;
		}
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupCreationActionMsg pgca = new PassiveGroupCreationActionMsg();
		pgca.setFriends(friendWxIds).setRobot_wxid(robot_wxid);
		FormData c = FormData.initCriteria(pgca);
		helper.sendMsg(c);
	}
	
	/**
	 * 退出群聊
	 * @param robotWxId    机器人微信id
	 * @param groupWxId    群id
	 */
	public static void quiteGroup(String robotWxId,String groupWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupQuiteActionMsg pgca = new PassiveGroupQuiteActionMsg();
		pgca.setGroup_wxid(groupWxId).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pgca);
		helper.sendMsg(c);
	}
	
	/**
	 * 
	 * @param robotWxId     微信机器人id
	 * @param groupWxId     群id
	 * @param friendWxId    好友微信id
	 */
	public static void inviteGroup(String robotWxId,String groupWxId,String friendWxId) {
		IHttpHelper helper = new HttpApiProxyFactory().getProxy(IHttpHelper.class);
		PassiveGroupInviteActionMsg pgca = new PassiveGroupInviteActionMsg();
		pgca.setFriend_wxid(friendWxId).setGroup_wxid(groupWxId).setRobot_wxid(robotWxId);
		FormData c = FormData.initCriteria(pgca);
		helper.sendMsg(c);
	}
}
