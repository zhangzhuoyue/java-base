package Genericclass.method;

import com.sun.istack.internal.NotNull;
import org.junit.Test;

import java.io.Serializable;
import java.util.*;
import java.util.function.Supplier;

/**
 * @author zzy
 * @date 2020/7/8 20:56
 */

public class Persion<T > {
    private T name;
    private T address;
    private List<T> k = new ArrayList<>();
    public List<? extends Persion> list2 = new ArrayList<>();
    public List<? super Student> list3 = new ArrayList<>();

    public <T extends List >  T getuserName(T t){
        List<String> list = new ArrayList<>();
        return (T) t;
    }
    @Test
    public void test(){

    }

    /**
     * 非泛型方法，形式变量是泛型。限定传入参数只能是Persion或者Persion的父类。
     * 明确使用该工具类方法的使用范围。
     * List<? extends Persion> 限定了参数不能添加，只能读取，修改
     * @param list
     */
    public void finduser(List<? extends Persion> list){
        //list.add(new Persion());      读取报错，error
        list.remove(2);
        Persion persion = list.get(0);

    }






    //虽然泛型方法中的类型变量和类名后的类型变量相同 的字母，但是他们已经不是同一个概念
    public <T> T test(T t){
        return t;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getAddress() {
        return address;
    }

    public void setAddress(T address) {
        this.address = address;
    }


}
