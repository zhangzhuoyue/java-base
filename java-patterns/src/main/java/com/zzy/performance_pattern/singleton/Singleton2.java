package com.zzy.performance_pattern.singleton;

/**
 * @author zhangyue666
 * @description  使用双重检索，但是存在reorder问题  ，因此该模式在多线程是线程不安全
 * @date 2020/8/16 18:38
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static  Singleton2 getSingleton2(){
        if (singleton2 == null){
            synchronized(Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2();//reorder发生位置。
                    /**
                     * reorder问题由编译器优化引起的，在语言层面无法解决，CPU厂商提供的volatile功能限制代码在指令阶段的重排序
                     */
                }
            }
        }
        return singleton2;
    }
}
