package com.zzy.factorypattern.builder.builder3.houseabstaract;

/**
 * @author zhangyue666
 * @description  housebuild只包含变化的构建步骤
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
     * 构建子步骤是变化的，定义为抽象方法
     */

    public abstract void buildPart1();
    public abstract void buildPart2();
    public abstract boolean buildPart3();
    public abstract void buildPart4();
}
