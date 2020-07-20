package com.zzy.singleresposibility.bridge.template2.code;

/**
 * @author zhangyue666
 * @description  软件通信模块
 * @date 2020/7/19 18:02
 */
public abstract class Messager {
    //用户登录
    public  void login(String userInfo){};
    //发送信息
    public  void sendMessage(String message){};
    //发送图片
    public  void sendPicture(String picture){};

    //不同平台的功能实现方式不同

    //播放声音
    public abstract void playSound(String sound);
    //画图片
    public abstract void drawShap(String shap);
    //写文档
    public abstract void writeText(String text);
    //连接
    public abstract void connect(String connect);
}
