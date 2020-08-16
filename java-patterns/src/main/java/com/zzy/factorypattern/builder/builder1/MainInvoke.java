package com.zzy.factorypattern.builder.builder1;

/**
 * @author zhangyue666
 * @description  调用者
 * @date 2020/8/13 22:18
 */
public class MainInvoke {
    public static void main(String[] args) {
        House phouse = new StoneHouse();//使用多态调用子类实现
        phouse.init();
    }
}
