package com.zzy.singleresposibility.bridge.template4.code;

import com.zzy.singleresposibility.bridge.template3.code.MessagerImpl;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的基础功能实现，使用组合来动态实现
 * @date 2020/7/20 21:19
 */
//业务抽象
public class MessageLite extends Messager {

    public MessageLite(MessagerImpl messagerImpl) {
        super(messagerImpl);
    }

    //这里可以是 new PCMessageBase()  也可以是 new MobileMessageBase()
    @Override
    public void login(String userInfo) {
        //connect("mobileConnect");
    }

    @Override
    public void sendMessage(String message) {
        // messagerImpl.writeText("text");
    }

    @Override
    public void sendPicture(String picture) {
        // messagerImpl.drawShap("shap");
    }
}
