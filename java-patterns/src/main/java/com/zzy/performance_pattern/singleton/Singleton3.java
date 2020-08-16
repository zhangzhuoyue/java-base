package com.zzy.performance_pattern.singleton;

/**
 * @author zhangyue666
 * @description 双重检索  ，解决了reorder问题
 * @date 2020/8/16 18:47
 */
public class Singleton3 {
    private static volatile Singleton3 singleton3;//volatile解决了reorder问题
    private Singleton3(){}
    public static Singleton3 getSingleton3(){
        if (singleton3 == null){
            synchronized (Singleton3.class){
                if (singleton3 == null){
                    singleton3 = new Singleton3();//如果实例化其他对象，则要保证另一个对象访问入口唯一
                }
            }
        }
        return singleton3;
    }
}
