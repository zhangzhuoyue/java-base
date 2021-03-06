package com.zzy.singleresposibility.bridge.template4.code;

import com.zzy.singleresposibility.bridge.template3.code.MessagerImpl;

/**
 * @author zhangyue666
 * @description 手机端的功能实现
 * @date 2020/7/19 18:19
 */
//手机平台实现
public class MobileMessagerBase implements MessagerImpl {
    @Override
    public void playSound(String sound) {
        //#################
    }

    @Override
    public void drawShap(String shap) {
        //##################
    }

    @Override
    public void writeText(String text) {
        //##################
    }

    @Override
    public void connect(String connect) {
        //##################
    }
}
