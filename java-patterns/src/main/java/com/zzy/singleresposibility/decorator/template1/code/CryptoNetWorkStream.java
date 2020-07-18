package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description 扩展操作 对网络流进行加密操作
 * @date 2020/7/18 11:15
 */
public class CryptoNetWorkStream extends NetWorkStream {
    @Override
    public char read(int number) {
        return super.read(number);
        //额外的网络流加密操作
    }

    @Override
    public void writer(int number) {
        //额外的网络流加密操作
        super.writer(number);

    }
}
