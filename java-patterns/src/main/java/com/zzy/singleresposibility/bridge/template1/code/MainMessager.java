package com.zzy.singleresposibility.bridge.template1.code;

/**
 * @author zhangyue666
 * @description
 * @date 2020/7/21 23:15
 */
public class MainMessager {

    public void process(){
        //编译时装配
        Messager messager = new MobileMessagePerfert();
    }
}
