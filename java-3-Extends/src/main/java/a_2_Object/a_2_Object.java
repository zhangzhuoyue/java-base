package a_2_Object;

import a_1_ExtendsRelation.Son;

import java.util.Arrays;
import java.util.Objects;
import java.util.SortedMap;

/**
 * @author ze666
 * @desc Object超类
 * @date 2021/1/18 19:55
 */
public class a_2_Object {
    /**
     * Object 类中的equals方法：检测两个对象是否有相同引用。重写后检测两个对象状态相等，对象状态相等则认为对象相等
     */

    public static void main(String[] args) {
        String[] str1 = {"12", "34"};
        String[] str2 = {"12", "34"};
        boolean equals = Arrays.equals(str1, str2);//数组长度相等，元素相等。如果存入对象，则一定要重写toString()方法
        //如果在数据量比较大，可以调用Objects.hashCode()首先判断总体的hashCode，这样成本比较小。

        Son son = new Son();
        son.setAddress("er");
        Son son1 = new Son();
        son1.setAddress("er");

        boolean equals1 = Objects.equals(son, son1);//会调用对象重写的equals方法
        /**
         * Object 的hashCode方法，默认值是对象的存储地址
         *
         * Objects.hash(...) 会组合多个参数的散列值，该方法调用各个参数Objects.hashCode
         *
         * Objcts.hashCode(Obejct obj)  为null，返回0，否则obj.hashCode()
         *
         * String 的hashCode方法，是内容导出的，散列码存在重复，因此散列码相等，equals不一定相等。
         * 但是equals相等，则hashCode一定相等。
         * hashCode和equals具有一致性，则需要一起定义
         *
         *
         *
         *
         */
    }
}
