package com.zzy.factorypattern.factorymethord.template2;

import com.zzy.factorypattern.factorymethord.template1.FileSpliter;

/**
 * @author zhangyue666
 * @description 文件分割客户端
 * @date 2020/7/28 21:59
 */
public class MainForm {

    public void button_click(){
        /**
         * 1. 面向接口编程，第一步，定义一个抽象基类，定义一个抽象，也是为了隔离变化。
         * 2. 面向接口编程，最显而易见的是变量要声明为抽象基类。
         * 需要解决的问题：
         * 3. 实现面向对象编程的原因：设计模式原则中的依赖导致原则，应该依赖【编译时依赖】抽象，而不应该依赖于实现细节
         * 4. 在代码中即使有一处具体依赖【编译时依赖】也解决不了问题，即使只有一处细节依赖，也会打破依赖导致原则（DIP）
         *
         * 引出对象创建模式：
         * 通过对象创建模式绕开new ，避免对象创建（new）导致的紧耦合【依赖具体的类】，从而支持对象创建的稳定，是面向接口编程必然需求。
         * 为了避免编译时依赖，变量左边需要是抽象，变量右边也需要是抽象的。这样必成依赖抽象，而不是依赖具体。
         *
         * 解决问题：
         * 1.最原始的解决问题思路： 1. new 创建对象  2. 通过一个方法返回一个对象
         *
         *
         *
         */
        ISplitter spliter = //抽象依赖【运行时依赖】
                new BinnarySplitter();//【编译时依赖】  依赖具体类
        spliter.spliter();
    }

}
