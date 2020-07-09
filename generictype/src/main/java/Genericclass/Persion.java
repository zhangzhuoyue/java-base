package Genericclass;

/**
 * @author zzy
 * @date 2020/7/8 20:56
 */

public class Persion<T> {
    private T name;
    private T address;

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
