package com.zzy.singleresposibility.decorator.template3.code;

/**
 * @author zhangyue666
 * @description  内存流操作 读取  写入
 * @date 2020/7/18 11:00
 */
//流的基础功能
public class InternalMemoryStream implements Stream {

    @Override
    public char read(int number) {
        //内存流读操作
        return 0;
    }

    @Override
    public void writer(int number) {
        //内存流写操作
    }
}
