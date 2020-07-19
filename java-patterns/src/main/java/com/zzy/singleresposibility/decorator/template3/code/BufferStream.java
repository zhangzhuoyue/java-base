package com.zzy.singleresposibility.decorator.template3.code;

/**
 * @author zhangyue666
 * @description 公共扩展操作  对流进行缓冲，具体对哪一类的流进行缓冲，具体看构造器传递的参数
 * @date 2020/7/18 11:20
 */
//扩展功能，既然使用了组合实现功能，那么在这里实现又实现接口是否多余？这里实现接口，为了定义接口规范
//扩展功能实现相同的接口规范，那么基于同一套规范，他们可以不断的组合复杂的功能
public class BufferStream extends DecoratorStream {

    protected BufferStream(Stream stream){
        super(stream);
    }

    @Override
    public char read(int number) {
        //缓冲功能
        char read = stream.read(0);

        return read;
    }

    @Override
    public void writer(int number) {
        //缓冲功能
        stream.writer(0);
    }
}
