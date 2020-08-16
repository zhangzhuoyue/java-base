package com.zzy.factorypattern.builder.builder3.houseabstaract;

/**
 * @author zhangyue666
 * @description  稳定的构建流程，定义为实体类
 * @date 2020/8/16 15:47
 */
public class HouseDriector {
    private HouseBuild houseBuild;
    public HouseDriector(HouseBuild houseBuild){
        this.houseBuild = houseBuild;
    }

    public void init(){
        houseBuild.buildPart1();
        for (int i = 0 ;i < 4 ;i++){
            houseBuild.buildPart2();
        }
        boolean flag = houseBuild.buildPart3();
        if (flag){
            houseBuild.buildPart4();
        }

    }
}
