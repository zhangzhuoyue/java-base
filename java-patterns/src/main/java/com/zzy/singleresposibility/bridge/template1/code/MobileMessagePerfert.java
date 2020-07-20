package com.zzy.singleresposibility.bridge.template1.code;

/**
 * @author zhangyue666
 * @description 手机移动端的 丰富功能
 * @date 2020/7/20 21:21
 */
public class MobileMessagePerfert extends MobileMessagerBase {
    @Override
    public void login(String userInfo) {
       playSound("sound");
       //....
       connect("connect");
    }

    @Override
    public void sendMessage(String message) {
        writeText("text");
        playSound("sound");

    }

    @Override
    public void sendPicture(String picture) {
        playSound("sound");
        drawShap("shap");
    }
}
