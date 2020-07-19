package com.zzy.singleresposibility.bridge.template1.code;

/**
 * @author zhangyue666
 * @description pc版1.0 简化的功能操作
 * @date 2020/7/19 18:21
 */
//PC业务抽象实现
public class PCMessageLite extends PCMessagerBase {

    @Override
    public void login(String userInfo) {
       connect("connect");
       //......
    }

    @Override
    public void sendMessage(String message) {
        writeText("text");
        //......
    }

    @Override
    public void sendPicture(String picture) {
        drawShap("picture");
        //......
    }
}
