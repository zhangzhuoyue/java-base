package com.zzy.factorypattern.factorymethord.template4;

/**
 * @author zhangyue666
 * @description  具体工厂
 * @date 2020/7/29 21:42
 */
public class TextIsplitterFactory implements ISplitterFactory {
    @Override
    public ISplitter createSplitter() {
        return new TextSplitter();
    }
}
