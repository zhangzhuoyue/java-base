package com.zzy.factorypattern.builder.builder2;

import com.zzy.factorypattern.builder.builder2.houseabstaract.House;
import com.zzy.factorypattern.builder.builder2.houseabstaract.HouseBuild;
import com.zzy.factorypattern.builder.builder2.houseabstaractimpl.StoneBuild;
import com.zzy.factorypattern.builder.builder2.houseabstaractimpl.StoneHouse;

/**
 * @author zhangyue666
 * @description  使用house对象
 * @date 2020/8/16 15:28
 */
public class MainInvoke {

    /**
     * 如果一个类功除了构建对象功能外，还有其他的功能【比较多】，那么僵构建功能单独拆分出来
     *
     * 将house构建和house状态拆分，考虑到对象这则职责问题，
     * @param args
     */
    public static void main(String[] args) {
        House house = new StoneHouse();
        HouseBuild houseBuild = new StoneBuild(house);
        houseBuild.init();//对house对象进行初始化
        House house1 = houseBuild.getpHouse();//获取初始化后的house对象
    }
}
