package com.zzy.performance_pattern.singleton;

/**
 * @author zhangyue666
 * @description 使用单线程
 * @date 2020/8/16 18:32
 * 懒汉式  ：不适用于多线程情况
 */
public class Singleton1 {

    private static Singleton1 singleton1 ;
    private Singleton1(){ }

    public static  Singleton1 getSingleton1(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }


}
