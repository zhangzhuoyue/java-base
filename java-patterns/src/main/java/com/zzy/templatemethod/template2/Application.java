package com.zzy.templatemethod.template2;

/**
 * @author zzy
 * @date 2020/6/27 21:16
 */

/**
 * 应用开发人员实现Library中抽象方法
 */
public class Application extends Library {
    @Override
    protected int step2() {
        return 2;
    }

    @Override
    protected int step4() {
        return 4;
    }
}
