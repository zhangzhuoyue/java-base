package java.field;

import java.lang.reflect.Field;

/**
 * GainField
 *
 * @author Administrator
 * @desc 运行时，反射分析  Field描述信息
 * @time 2020/7/16 12:28
 **/
public class GainField {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        GainField gainField = new GainField();
        gainField.getFieldValue(new field.Student("23",34));
    }

    /**
     *     通过放射获取域值
     */
    public <T>  void getFieldValue(T t) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cl = t.getClass();
        /**
         * 1. 私有属性，需要获取安全权限才能访问。
         * 2. 成员类型是引用类型，调用get()返回一个对象
         * 3. 如果成员类型是基本数据类型，调用get()方法返回的是该基本类型的包装类。
         */

        Field declaredField = cl.getDeclaredField("name");//获取指定的成员的Field对象。
        declaredField.setAccessible(true);
        Object o = declaredField.get(t);//获取属性值
        System.out.println(o);

        //通过反射获取基本数据类型的值
        Field ageField = cl.getDeclaredField("age");
        ageField.setAccessible(true);
        Object o1 = ageField.get(t);
        System.out.println(o1);

    }
}
