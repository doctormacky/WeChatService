# WeChatService

## WeChatService是什么?
Wechat Service 是一个基于可爱猫 开发的微信SDK，可以很方便的基于这个SDK做二次开发
Wechat Service 基于springboot 开发, 大家可以把核心代码抠出来放到其他框架下是一样的

## SDK使用者需要做什么？
clone这套代码，实现自己的listener, 所有Listener 在com.qx.wechat.listener 包下
例如：当有人给你发私信的时候，你可以修改com.qx.wechat.listener.PrivateMsgListener 去做你想要的功能，比如直接回复他：
WeXinApi.sendTextMsg(msg.getRobotWxid(), msg.getFromWxid(), "我已经收到你的消息:"+msg.getMsg()+"洗洗睡吧。。。");

# WeChatService有哪些依赖？
WeChatService依赖[可爱猫官网](http://www.keaimao.com/) 

## Wechat有哪些功能？

* 方便的`微信操作`功能
    * 发送私人消息
    * 发送群消息
    * 发送群@消息
    * 微信收款通知
    * 删除好友
    * 二维码扫描付款通知
    * 群成员剔除
    * 等等。。。大家慢慢挖掘

## 有问题反馈
在使用中有任何问题，欢迎反馈给我，可以用以下联系方式跟我交流
* 邮件(liuyun105@126.com)
* QQ: 316110840

## 捐助开发者
在兴趣的驱动下,写一个`免费`的东西，有欣喜，也还有汗水，希望你喜欢我的作品，同时也能支持一下。
当然，有钱捧个钱场（右上角的爱心标志，支持支付宝和PayPal捐助），没钱捧个人场，谢谢各位。

## 感激
感谢以下的项目,排名不分先后

* [可爱猫官网](http://www.keaimao.com/) 
* [可爱猫Github](https://github.com/www-keaimao-com)

## 关于作者
作者平时上班比较忙，本项目会随着可爱猫的进度更新

```
Contact me in QQ 316110840
```
