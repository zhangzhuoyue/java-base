package com.zzy.singleresposibility.bridge.template1.code;

/**
 * @author zhangyue666
 * @description 手机端的基础功能实现
 * @date 2020/7/20 21:19
 */
public class MobileMessageLite extends MobileMessagerBase {
    @Override
    public void login(String userInfo) {
        connect("mobileConnect");
    }

    @Override
    public void sendMessage(String message) {
        writeText("text");
    }

    @Override
    public void sendPicture(String picture) {
        drawShap("shap");
    }
}
