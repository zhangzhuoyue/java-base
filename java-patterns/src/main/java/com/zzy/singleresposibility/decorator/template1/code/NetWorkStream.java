package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description 网络流操作  读取 写入
 * @date 2020/7/18 10:59
 */
//流的基础功能
public class NetWorkStream implements Stream {
    @Override
    public char read(int number) {
        //网络流读操作
        return 0;
    }

    @Override
    public void writer(int number) {
        //网络流写操作

    }
}
