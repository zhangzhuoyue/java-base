package com.zzy.singleresposibility.bridge.template4.code;

import com.zzy.singleresposibility.bridge.template1.code.Messager;
import com.zzy.singleresposibility.bridge.template1.code.MobileMessagePerfert;

/**
 * @author zhangyue666
 * @description
 * @date 2020/7/21 23:15
 */
public class MainMessager {

    public void process(){
        //编译时装配
        //Messager messager = new MobileMessagePerfert();

        //运行时装配
        Messagers messagePerfert = new MessagePerfert(new MobileMessagerBase());
    }
}
