package com.zzy.singleresposibility.bridge.template3.code;

/**
 * @author zhangyue666
 * @description  软件通信模块-登录功能
 * @date 2020/7/19 18:02
 */
public interface Messager {

    //用户登录
    public  void login(String userInfo);
    //发送信息
    public  void sendMessage(String message);
    //发送图片
    public  void sendPicture(String picture);

}
