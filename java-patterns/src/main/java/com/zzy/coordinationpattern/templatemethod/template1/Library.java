package com.zzy.coordinationpattern.templatemethod.template1;

/**
 * @author zzy
 * @date 2020/6/27 19:07
 */
/**
 * Library开发人员定义.
 * 库文件开发人员，预定义部分功能，无法确定的部分需要应用开发人员编写
 */

public class Library {

    public int step1(){
        return 1;
    }

    public int step3(){
        return 3;
    }

    public int step5(){
        return 5;
    }
}

