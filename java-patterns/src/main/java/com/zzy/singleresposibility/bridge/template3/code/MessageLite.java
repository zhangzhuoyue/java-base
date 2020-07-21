package com.zzy.singleresposibility.bridge.template3.code;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的基础功能实现，使用组合来动态实现
 * @date 2020/7/20 21:19
 */
//业务抽象
public class MessageLite implements Messager{

    private MessagerImpl messagerImpl;//这里可以是 new PCMessageBase()  也可以是 new MobileMessageBase()

    public MessageLite(MessagerImpl messagerImpl) {
        this.messagerImpl = messagerImpl;
    }

    public void login(String userInfo) {
        messagerImpl.connect("mobileConnect");
    }


    public void sendMessage(String message) {
        messagerImpl.writeText("text");
    }


    public void sendPicture(String picture) {
        messagerImpl.drawShap("shap");
    }
}
