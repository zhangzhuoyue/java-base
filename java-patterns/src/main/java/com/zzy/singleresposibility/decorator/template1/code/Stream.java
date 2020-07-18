package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description  stream流的父类
 * @date 2020/7/18 10:55
 */
public interface Stream {

    /**
     * 读取流
     * @param number
     * @return
     */
    public char read(int number);

    /**
     * 写入流
     * @param number
     */
    public void writer(int number);
}
