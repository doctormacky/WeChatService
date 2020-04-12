package com.qx.wechat.comm.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by winn on 2020/02/12.
 */
public enum MsgTypeEnum {
    TEXT(1, "文本"),
    PIC(3, "图片"),
    VOICE(34, "语音"),
    NAME_CARD(42, "名片"),
    VIDEO(43, "视频"),
    GIF_FACE(47, "表情"),
    LOCATION(48, "位置"),
    SHARE_LINK(49, "链接"),
    HONGBAO(2001, "红包"),
    SMALL_PROGRAM(2002, "小程序"),
    GROUP_INVITATION(2003, "群邀请"),
    GROUP_TBD(2006,"群代办");
	
    private Integer type;
    private String  desc;

    public static Map<Integer, MsgTypeEnum> map = new HashMap<Integer, MsgTypeEnum>();

    static {
        MsgTypeEnum[] enums = MsgTypeEnum.values();
        for (MsgTypeEnum e : enums){
            map.put(e.getType(), e);
        }
    }

    private MsgTypeEnum(Integer type, String desc){
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getDesc() {
        return this.desc;
    }

    public MsgTypeEnum getEnum(Integer  type){
        return map.get(type);
    }

    public Map<Integer,MsgTypeEnum> getEnumMap(){
        return map;
    }
}
