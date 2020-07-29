package com.zzy.factorypattern.factorymethord.tenplate3;


/**
 * @author zhangyue666
 * @description 文件分割客户端
 * @date 2020/7/28 21:59
 */
public class MainForm {

    public void button_click(){
        /**
         * 这里通过工厂对象创建对象，但是工厂对象中依然使用new创建对象实例，
         * 依然是编译时依赖，这里只是将直接依赖转换为间接依赖。并没有解决编译时依赖的问题。
         *
         * 在java中new是编译时依赖，那么运行时依赖？答案是虚函数，抽象方法是编译时依赖。虚函数是一种延时
         */
        ISplitterFactory iSplitterFactory = new ISplitterFactory();
        ISplitter splitter = iSplitterFactory.createSplitter();
        splitter.spliter();
    }

}
