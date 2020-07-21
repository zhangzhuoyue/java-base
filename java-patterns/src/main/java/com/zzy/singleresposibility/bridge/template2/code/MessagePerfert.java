package com.zzy.singleresposibility.bridge.template2.code;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的多功能实现，使用组合来动态实现
 * @date 2020/7/20 21:21
 */
//业务抽象
public class MessagePerfert {

    private Messager messager;//这个可以是 new MobileMessageBase() ,也可以是new  PCMessagerBase()

    public MessagePerfert(Messager messager){
        this.messager = messager;
    }

    public void login(String userInfo) {
        messager.playSound("sound");
       //....
        messager.connect("connect");
    }


    public void sendMessage(String message) {
        messager.writeText("text");
        messager.playSound("sound");

    }


    public void sendPicture(String picture) {
        messager.playSound("sound");
        messager.drawShap("shap");
    }
}
