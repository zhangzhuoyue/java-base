package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description 扩展操作  对内存流加密操作
 * @date 2020/7/18 11:15
 */
public class CryptoInternalMemoryStream extends InternalMemoryStream {
    @Override
    public char read(int number) {
        return super.read(number);
        //额外的内存流加密操作
    }

    @Override
    public void writer(int number) {
        //额外的内存流加密操作
        super.writer(number);
    }
}
