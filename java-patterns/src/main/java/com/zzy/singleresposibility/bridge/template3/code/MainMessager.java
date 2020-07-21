package com.zzy.singleresposibility.bridge.template3.code;

import com.zzy.singleresposibility.bridge.template1.code.Messager;
import com.zzy.singleresposibility.bridge.template1.code.MobileMessagePerfert;
import com.zzy.singleresposibility.bridge.template1.code.PCMessagerPerfect;

/**
 * @author zhangyue666
 * @description
 * @date 2020/7/21 23:15
 */
public class MainMessager {

    public void process(){
        //运行时装配
        MessagePerfert messager = new MessagePerfert(new MobileMessagerBase());
    }
}
