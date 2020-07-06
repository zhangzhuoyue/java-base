package main.java.list.arraylist.sublistAndasList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubListAndAsList {

    public static void main(String[] args) {
        subList();
    }

    //arraylist.subList  截取集合元素
    public static void subList() {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("名称");
        list.add("名称2");
        list.add("名称1");

        //问题1：List<String> strings = (ArrayList)list.subList(0, 1); SubList 和arraylist都继承abstractlist，二者不存在继承关系。这种强制转换无法转换成功
        List<String> strings = list.subList(0, 1);
        //问题2：调用subList生成的对象，他和原始lisyt对象公用同一个数据源，因此修改sublist对象，等于修改原list
        strings.add("123");
        System.out.println(list);
        //问题3：sublist生成子列，但是在原list修改，则子列报错，遍历，get ,remove,add报错ConcurrentModificationException
        list.add("werw");
        strings.get(0);//会报错
    }

    //arrays.asList   将数组转换为List集合
    public static void asList(){
        String str1 = "123";
        String str2 = "234";
        //问题1：asList生成的list内部存储数据是一个不可扩容的数组，因此没有add方法，但是有基本的修改set和遍历操作
        List<String> strings = Arrays.asList(str1, str2);
        //strings.add(""); aslist不支持增加操作 ConcurrentModificationException
    }
}
