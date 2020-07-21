package com.zzy.singleresposibility.bridge.template4.code;

import com.zzy.singleresposibility.bridge.template3.code.MessagerImpl;

/**
 * @author zhangyue666
 * @description  软件通信模块-登录功能
 * @date 2020/7/19 18:02
 */
public abstract class Messager {

    public  MessagerImpl messagerImpl;

    public Messager(MessagerImpl messagerImpl) {
        this.messagerImpl = messagerImpl;
    }

    //用户登录
    public abstract void login(String userInfo);
    //发送信息
    public abstract void sendMessage(String message);
    //发送图片
    public abstract void sendPicture(String picture);

}
