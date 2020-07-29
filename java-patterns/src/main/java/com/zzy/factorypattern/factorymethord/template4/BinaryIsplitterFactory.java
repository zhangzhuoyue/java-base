package com.zzy.factorypattern.factorymethord.template4;

/**
 * @author zhangyue666
 * @description  具体工程
 * @date 2020/7/29 21:41
 */
public class BinaryIsplitterFactory implements ISplitterFactory {

    @Override
    public ISplitter createSplitter() {
        return new BinnarySplitter();
    }
}
