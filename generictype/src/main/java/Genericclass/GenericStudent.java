package Genericclass;

/**
 * @author zzy
 * @date 2020/7/9 23:06
 */
//在继承关系中使用泛型
public class GenericStudent<T> implements GenericPersion<T> {
    @Override
    public T getName() {
        return null;
    }

    @Override
    public void setname(T t) {

    }
}
