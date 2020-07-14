package com.zzy.coordinationpattern.observer.template3;

/**
 * @author zhangyue666
 * @description 抽象的通知机制
 * @date 2020/7/14 21:42
 */
public interface IProgress {


    /**
     * 抽象控件
     * @param progress 分割进度
     */
    public void dprogress(double progress);
}
