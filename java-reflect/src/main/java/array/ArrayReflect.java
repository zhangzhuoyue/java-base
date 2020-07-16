package array;

import field.Student;

import java.lang.reflect.Array;

/**
 * ArrayReflect
 *
 * @author Administrator
 * @desc 使用反射编写泛型数组
 * @time 2020/7/16 16:00
 **/
public class ArrayReflect {

    public static void main(String[] args) {
        Student[] students = new Student[2];
        Object o = goodCopyOf(students, 21);
        System.out.println((Student[])o);
    }

    /**
     * 数组类型转换为Object类型
     *
     * 1. 获取a数组的类对象
     * 2. 确认他是一个数组
     * 3. 使用Class类的getComponentType获取数组元素的类型
     * 4. Array.getLength(Object obj) 方法获取数组长度
     * @param a
     * @param newLength
     * @return
     */
    /**
     *1. 将方法入参对象数组(Object[]) 改为Object，因为基本数组类型数组int[] 可以转换成Object ,但是不能转换成对象数组。
     *
     */
   // public static Object goodCopyOf(Object[] a ,int newLength){
    public static Object goodCopyOf(Object a ,int newLength){
        Class<?> cl = a.getClass();
        if (!cl.isArray())  return null;
        Class<?> componentType = cl.getComponentType();
        int length = Array.getLength(a);

        Array.set(a,2,23);//使用反射给数组指定下标设置指定的值

        Object newArray = Array.newInstance(componentType, length);//通过反射创建数组，病转换为Object类型
        System.arraycopy(a,0,newArray,0,Math.min(newLength,length));//数组复制
        return newArray;
    }

    /**
     * 方法返回的数组类型无法转换为其他的数组类型。
     * 原因：
     *      java数组会记住每个元素的类型，也就是创建时new表达式中使用的元素类型。将一个Employee[] 临时转换为Object[]，然后再
     *      转换回来是可以的。但从开始就是Object[]的数组永远不能转换为Employee[]数组
     *
     * @param a
     * @param newLenth
     * @return
     */
    public static Object badCopyOf(Object[] a ,int newLenth){
        Object[] objects = new Object[newLenth];
        System.arraycopy(a,0,objects,0,Math.min(newLenth,a.length));
        return objects;
    }

}
