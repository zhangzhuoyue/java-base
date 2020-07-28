package com.zzy.factorypattern.factorymethord.template1;


/**
 * @author zhangyue666
 * @description  文件切割客户端
 * @date 2020/7/28 21:45
 */
public class MainForm {

    public void button_click(){
        /**
         * 从静态角度：new的方式创建对象，并没有不合适
         * 从动态角度：创建变量，变量的两侧是具体的类，意味着不可变，不支持未来需求发生变化。
         *            一般而言，对于需求发生变化的对象，变量要声明为接口，来支持未来的变化，例如支持文本文件分割，视频文件的分割。。。
         */

        /**
         * 当想到对象在未来可能变化，则需要抽象出一个基类（稳定的抽象）
         */
        FileSpliter spliter = new FileSpliter();
        spliter.split();
    }
}
