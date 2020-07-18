package com.zzy.singleresposibility.decorator.template1.code;

/**
 * @author zhangyue666
 * @description 测试
 * @date 2020/7/18 17:05
 */
public class MainTest {

    public static void main(String[] args) {

        //编译时装配，在编译时期已经存在了缓冲文件流，文件件加密缓冲流
        BufferFileStream bufferFileStream = new BufferFileStream();

        CryptoBufferFileStream cryptoBufferFileStream = new CryptoBufferFileStream();

        FileStrean fileStrean = new FileStrean();
    }
}
