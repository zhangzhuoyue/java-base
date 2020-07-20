package com.zzy.singleresposibility.bridge.template2.code;

/**
 * @author zhangyue666
 * @description pc 2.0版本  丰富的功能
 * @date 2020/7/19 18:26
 */
//PC业务抽象实现
public class PCMessagerPerfect  extends PCMessagerBase {

    @Override
    public void login(String userInfo) {
        playSound("sound");
        //......
        connect("connect");

    }

    @Override
    public void sendMessage(String message) {

        playSound("sound");
        //......
        writeText("text");

    }

    @Override
    public void sendPicture(String picture) {
        playSound("sound");
        //......
        drawShap("picture");
    }
}
