package com.zzy.factorypattern.builder.builder1;

/**
 * @author zhangyue666
 * @description 构建者有稳定的整理流程，但是具体的环节是变化的。
 * @date 2020/8/13 22:04
 * 构造流程可以放在一个方法，也可以放到构造函数中
 */
public abstract class House {

    /**
     * 构建流程是稳定，这里使用具体的实现方法
     */
    public void init(){
        this.buildPart1();
        for (int i = 0 ;i < 4 ;i++){
            this.buildPart2();
        }
        boolean flag = this.buildPart3();
        if (flag){
            this.buildPart4();
        }

    }

    /**
     * 构建子步骤是变化的，定义为抽象方法
     */

    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract boolean buildPart3();
    public abstract void buildPart4();
}
