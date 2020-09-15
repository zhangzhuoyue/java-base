package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * SimpleGenericClass
 *
 * @author Administrator
 * @desc  通用坐标类
 * @time 2020/9/14 14:23
 **/
public class SimpleGenericClass<T> {
    //提供一个模板类；避免强制类型转换；编译期检查
    //可以有多个类型变量， 作用域：方法返回类型，成员变量属性，局部变量
    private T x;
    private T y;
    public T getX() {
        return x;
    }
    public void setX(T x) {
        this.x = x;
    }
    public T getY() {
        return y;
    }
    public void setY(T y) {
        this.y = y;
    }

    //泛型方法 ,通用功能处理方法
    public <T> List<T> test1(T k){
        List<T> list = new ArrayList<>();
        list.add(k);
        return list;
    }
}
