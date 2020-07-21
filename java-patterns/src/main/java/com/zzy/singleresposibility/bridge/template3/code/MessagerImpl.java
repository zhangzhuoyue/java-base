package com.zzy.singleresposibility.bridge.template3.code;

/**
 * @author zhangyue666
 * @description  软件通信功能-平台功能实现
 * @date 2020/7/21 22:25
 */
public interface MessagerImpl {

    //不同平台的功能实现方式不同

    //播放声音
    public abstract void playSound(String sound);
    //画图片
    public abstract void drawShap(String shap);
    //写文档
    public abstract void writeText(String text);
    //连接
    public abstract void connect(String connect);
}
