package com.zzy.singleresposibility.bridge.template2.code;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的基础功能实现，使用组合来动态实现
 * @date 2020/7/20 21:19
 */
public class MessageLite {

    private Messager messager;//这里可以是 new PCMessageLite()  也可以是 new MobileMessageLite()

    public MessageLite(Messager messager) {
        this.messager = messager;
    }

    public void login(String userInfo) {
        messager.connect("mobileConnect");
    }


    public void sendMessage(String message) {
        messager.writeText("text");
    }


    public void sendPicture(String picture) {
        messager.drawShap("shap");
    }
}
