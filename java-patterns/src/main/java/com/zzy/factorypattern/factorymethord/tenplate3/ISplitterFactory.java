package com.zzy.factorypattern.factorymethord.tenplate3;

/**
 * @author zhangyue666
 * @description
 * @date 2020/7/29 21:27
 */
public class ISplitterFactory {

    public ISplitter createSplitter(){
        return new BinnarySplitter();
    }
}
