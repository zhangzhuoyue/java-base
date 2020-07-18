package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description 扩展操作  内存流进行加密和缓冲操作
 * @date 2020/7/18 11:28
 */
public class CryptoBufferInternalMemoryStream extends InternalMemoryStream {
    @Override
    public char read(int number) {
        //内存流进行加密操作
        //内存流进行缓冲操作
        return super.read(number);
    }

    @Override
    public void writer(int number) {
        //内存流进行加密操作
        //内存流进行缓冲操作
        super.writer(number);
    }
}
