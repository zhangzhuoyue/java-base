package com.zzy.factorypattern.builder.builder3.houseabstaractimpl;

import com.zzy.factorypattern.builder.builder3.houseabstaract.House;
import com.zzy.factorypattern.builder.builder3.houseabstaract.HouseBuild;

/**
 * @author zhangyue666
 * @description  针对不同的功能实现抽象的构架过程
 * @date 2020/8/13 22:50
 */
public class StoneBuild extends HouseBuild {

    public StoneBuild(House house) {
        super(house);
    }

    @Override
    public void buildPart1() {
        //对传入的house实例进行状态初始化
        //phouse.getxxx();
        //
    }

    @Override
    public void buildPart2() {
//对传入的house实例进行状态初始化
        //phouse.setxx();
    }

    @Override
    public boolean buildPart3() {
        //对传入的house实例进行状态初始化
        return false;
    }

    @Override
    public void buildPart4() {
//对传入的house实例进行状态初始化
    }
}
