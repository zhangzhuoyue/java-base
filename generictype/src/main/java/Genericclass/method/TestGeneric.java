package Genericclass.method;

import org.junit.Test;

import java.util.*;

/**
 * @author zzy
 * @date 2020/7/12 10:35
 */
public class TestGeneric<E> {

    @Test
    public void test1(){
        //TreeSet
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        add(studentList);

    }
    /**
     * <?> 无限定通配符,内部调用的元素方法是Object的方法。
     * 类型擦除，无限定通配符用object替换。
     */
    public boolean comtains(Collection<?> c){
        for (Object o : c)
            if (!contins(o)) return false;
        return true;
    }

    private boolean contins(Object o) {
        //
        //        Iterable<?> it = new Iterable<Object>() {
        //            @Override
        //            public Iterator<Object> iterator() {
        //                return null;
        //            }
        //        };
        //
        //        if (o == null){
        //            while (it.hasNext()){
        //                if (it.next() == null)
        //                    return true;
        //            }
        //        }else {
        //            while (it.hasNext()){
        //                if (o.equals(it.next()))
        //                    return true;
        //            }
        //        }
        //        return false;
        //    }
        return false;
    }

    /**
     * <? extends E></>
     *  Collection中addAll()方法的实现原理
     * 存元素时使用上限（<? extends E>），取出数据数据类型统一是E，取出数据安全。
     * 原理：虚拟机的擦除机制，使得类型变量在替换时将替换为第一限定类型，也就是E，使得在运行时他们有统一的类型。
     * 注意：使用这种模板方式，需要子类实现父类中公共方法，以便在多态机制中调用子类实现完成个性化业务运算。
     */
    public void addAll(Collection<? extends E> c){

    }

    /**
     * <? super E></>
     *
     */
    public void add(List<? super Student> list){
        Student object = (Student)list.get(0);
    }
}
