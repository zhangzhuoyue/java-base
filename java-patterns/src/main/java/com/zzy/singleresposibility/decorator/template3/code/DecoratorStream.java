package com.zzy.singleresposibility.decorator.template3.code;

/**
 * @author zhangyue666
 * @description  支持未来多态的变化
 * @date 2020/7/18 17:36
 */
// 在重构中，如果多个子类中出现相同的成员，则可以将他们提取出一个抽象
//没有将公共的属性放到Stream基类中，因为Stream抽象接口主要针对的是主体功能的抽象，并且FileStream这样的操作没有使用到Strean属性，
//Decorator将公共的Stream属性单独抽离出一个抽象，这个抽象专门由于组合功能
//Stream定义接口规范，给外界调用
public abstract class DecoratorStream implements Stream {

    public Stream stream;

    protected DecoratorStream(Stream stream){
        this.stream = stream;
    }


}
