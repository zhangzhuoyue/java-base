package com.zzy.factorypattern.builder.builder2.houseabstaract;

/**
 * @author zhangyue666
 * @description  仅包含house的对象构建功能  ，使用组合的方式将house其他状态传递进来
 * @date 2020/8/13 22:43
 */
public abstract class HouseBuild {
    private House pHouse;

    public HouseBuild(House house) {
        this.pHouse = house;
    }

    //返回构建后的house对象
    public House getpHouse() {
        return pHouse;
    }

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
