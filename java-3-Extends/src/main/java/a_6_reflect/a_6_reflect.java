package a_6_reflect;

import a_1_ExtendsRelation.Son;

/**
 * @author ze666
 * @desc  反射
 * @date 2021/1/18 22:05
 */
public class a_6_reflect {
    /**
     * 获取Class的三中方式：
     * 1. 类名.class
     * 2. 对象.getClass()
     * 3. Class.forName("全限定类名")
     */
    public static void classTest() throws ClassNotFoundException {
        Class<Son> sonClass = Son.class;
        Class<?> aClass = Class.forName("a_1_ExtendsRelation.Son");
        Son son = new Son();
        Class<? extends Son> aClass1 = son.getClass();
        System.out.println(sonClass == aClass);
    }

    public static void main(String[] args) {
        try {
            classTest();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
