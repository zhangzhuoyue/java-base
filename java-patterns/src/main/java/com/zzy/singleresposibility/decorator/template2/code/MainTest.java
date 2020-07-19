package com.zzy.singleresposibility.decorator.template2.code;

import com.zzy.singleresposibility.decorator.template1.code.BufferFileStream;
import com.zzy.singleresposibility.decorator.template1.code.CryptoBufferFileStream;

/**
 * @author zhangyue666
 * @description 测试
 * @date 2020/7/18 17:05
 */
public class MainTest {

    public static void main(String[] args) {

        /*编译时装配，在编译时期已经存在了缓冲文件流，文件件加密缓冲流
        BufferFileStream bufferFileStream = new BufferFileStream();

        CryptoBufferFileStream cryptoBufferFileStream = new CryptoBufferFileStream();

        FileStrean fileStrean = new FileStrean();*/

        //运行时装配，在编译时不存在加密流、缓冲流，在运行装配，才存在。
        //将类的具体行为延迟的运行时，是大多数设计模式的真谛
        Stream stream = new FileStrean();//文件流操作
        BufferStream bufferStream = new BufferStream(stream);//缓冲流操作
        CryptoStream cryptoStream = new CryptoStream(stream);//加密流操作
        BufferStream cryptoAndBuffer = new BufferStream(cryptoStream);//加密 缓冲流


    }
}
