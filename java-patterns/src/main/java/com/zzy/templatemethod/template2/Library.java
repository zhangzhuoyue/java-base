package com.zzy.templatemethod.template2;

/**
 * @author zzy
 * @date 2020/6/27 21:07
 */

/**
 * 框架开发，定义了程序执行流程，确定的行为实现具体方法，不确定的行为定义抽象方法，利用多态实现功能
 * 的动态加入。
 */
public abstract class Library {

    protected int step1(){
        return 1;
    }

    protected int step3(){
        return 3;
    }

    protected int step5(){
        return 5;
    }

    protected abstract int step2();//软件结构中变化部分
    protected abstract int step4();//软件结构中变化部分

    protected void run(){
        if (step1() == 1){//软件结构中稳定部分
            System.out.println(1);
        }
        if (step2() == 2){  // 支持变化 ==>抽象的方法的多态
            System.out.println(2);
        }
        if (step3() ==3){
            System.out.println(3);
        }
        if (step4() == 4) {// 支持变化 ==>抽象的方法的多态
            System.out.println(4);
        }
        if (step5() == 5){
            System.out.println(5);
        }
    }
}
