package com.zzy.factorypattern.prototype;

/**
 * @author zhangyue666
 * @description
 * @date 2020/8/10 22:09
 */
public interface ISplitter {

    public abstract ISplitter clone();//通过克隆自己来创建对象。
    public abstract void split();

}
