package com.zzy.factorypattern.prototype;

/**
 * @author zhangyue666
 * @description 客户端  稳定
 * @date 2020/8/10 22:12
 */
public class MainForm {

    /**
     * 原型模式将工厂和基类合并  ，通过克隆自己来创建对象。
     *注意：类的拷贝构造函数需要学正确
     */
    private ISplitter protoType;

    public void buttenClick(){
        ISplitter splitter = protoType.clone();
        splitter.split();

    }
}
