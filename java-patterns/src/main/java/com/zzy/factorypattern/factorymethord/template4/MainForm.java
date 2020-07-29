package com.zzy.factorypattern.factorymethord.template4;


/**
 * @author zhangyue666
 * @description 文件分割客户端
 * @date 2020/7/28 21:59
 */
public class MainForm {

    /**
     * 1.返回对象方法方法是抽象方法，可以将对象创建延迟到运行时。
     * 2.文件分割有抽象基类，使得对外有统一抽象，可以自由在不同处理方式中切换。
     */
    private ISplitterFactory iSplitterFactory;

    public MainForm(ISplitterFactory iSplitterFactory){
        this.iSplitterFactory = iSplitterFactory;
    }

    public void button_click(){
        /**
         * 变量左侧是抽象，右侧也是抽象
         *
         * 这些操作保证了MainForm中没有依赖具体类，但是其他地方存在依赖具体类，面向对象设计模式，并不是将具体依赖消灭，而是将
         * 具体依赖限制在某一出，可以对
         */
        ISplitter splitter =
                iSplitterFactory.createSplitter();//多态new，通过运行时传入工厂对象决定具体的文件分割行为【运行时依赖】
        splitter.spliter();
    }

}
