package com.zzy.factorypattern.prototype;

/**
 * @author zhangyue666
 * @description 实现类
 * @date 2020/8/10 22:10
 */
public class BinarrySplitter implements ISplitter {

    private ISplitter iSplitter;

    public BinarrySplitter(ISplitter iSplitter) {
        this.iSplitter = iSplitter;
    }

    @Override
    public ISplitter clone() {

        ISplitter binarrySplitter = new BinarrySplitter(this);

        return binarrySplitter;
    }

    @Override
    public void split() {
        //对成员进行操作

    }
}
