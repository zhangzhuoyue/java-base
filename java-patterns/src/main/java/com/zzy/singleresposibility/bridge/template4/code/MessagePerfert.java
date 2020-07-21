package com.zzy.singleresposibility.bridge.template4.code;

import com.zzy.singleresposibility.bridge.template3.code.Messager;
import com.zzy.singleresposibility.bridge.template3.code.MessagerImpl;

/**
 * @author zhangyue666
 * @description 手机和电脑端 的多功能实现，使用组合来动态实现
 * @date 2020/7/20 21:21
 */
//业务抽象
public class MessagePerfert extends Messagers {

    public MessagePerfert(MessagerImpl messagerImpl) {
        super(messagerImpl);
    }

    @Override
    public void login(String userInfo) {
        //messagerImpl.playSound("sound");
        //....
        // messagerImpl.connect("connect");
    }

    @Override
    public void sendMessage(String message) {
        // messagerImpl.writeText("text");
        //  messagerImpl.playSound("sound");

    }

    @Override
    public void sendPicture(String picture) {
        //messagerImpl.playSound("sound");
        //messagerImpl.drawShap("shap");
    }
}
