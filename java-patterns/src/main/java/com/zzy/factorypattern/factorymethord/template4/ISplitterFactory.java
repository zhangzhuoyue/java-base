package com.zzy.factorypattern.factorymethord.template4;

/**
 * @author zhangyue666
 * @description  抽象工厂基类，为了将解决对象创建依赖问题
 * @date 2020/7/29 21:27
 */
public interface ISplitterFactory {

    public ISplitter createSplitter();
}
