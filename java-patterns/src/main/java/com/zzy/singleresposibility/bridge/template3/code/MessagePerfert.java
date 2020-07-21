package com.zzy.singleresposibility.bridge.template3.code;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的多功能实现，使用组合来动态实现
 * @date 2020/7/20 21:21
 */
//业务抽象
public class MessagePerfert implements Messager{

    private MessagerImpl messagerImpl;//这个可以是 new MobileMessageBase() ,也可以是new  PCMessagerBase()

    public MessagePerfert(MessagerImpl messager){
        this.messagerImpl = messager;
    }

    public void login(String userInfo) {
        messagerImpl.playSound("sound");
       //....
        messagerImpl.connect("connect");
    }


    public void sendMessage(String message) {
        messagerImpl.writeText("text");
        messagerImpl.playSound("sound");

    }


    public void sendPicture(String picture) {
        messagerImpl.playSound("sound");
        messagerImpl.drawShap("shap");
    }
}
