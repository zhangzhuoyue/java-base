package java.checkclassconstructor;

import java.lang.reflect.*;
import java.util.Scanner;

/**
 * @author zhangyue666
 * @description  反射检查类
 * @date 2020/7/15 22:16
 */
public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if (args.length > 0) name = args[0];
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入 java.util.Date :");
            name = scanner.next();
        }

        try {
            /**
             * 获取Class的三种方式：
             * 1. 类名.class
             * 2.Class.forName(类全路径)
             * 3. 对象.getClass()
             */
            Class<?> aClass = Class.forName(name);
            //获取父类Class
            Class<?> superclass = aClass.getSuperclass();
            /**
             * class对象的getModifiers()，返回权限修饰符的位表示
             * Modifier.toString（）将权限修饰符打印出来
             */
            String modifers = Modifier.toString(aClass.getModifiers());
            if (modifers.length() > 0) System.out.print(modifers +" ");
            System.out.print("class : "+name);
            if (superclass != null && superclass == Object.class) System.out.print(" extends " +superclass.getName());
            System.out.print("\n{\n");
            printConstructors(aClass);
            System.out.println();
            printMethods(aClass);
            System.out.println();
            printField(aClass);
            System.out.println("}");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 打印构造器信息
     * @param clazz
     */

    public static void printConstructors(Class clazz){
        //返回类中声明的所有构造器，但不包括父类
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors){
            String name = c.getName();//构造器名称
            String modifers = Modifier.toString(c.getModifiers());//构造器权限修饰符
            if (modifers.length() > 0) System.out.print(modifers+" ");
            System.out.print(name +"(");
            Class[] parameterTypes = c.getParameterTypes();//构造器的入参类型数组
            for (int j = 0 ;j < parameterTypes.length ;j++){
                if (j > 0) System.out.print(",");
                System.out.print(parameterTypes[j].getName());//获取参数的类型名称
            }
            System.out.println(");");
        }
    }

    /**
     * 打印方法信息
     * @param clazz
     */
    public static void printMethods(Class clazz){
        Method[] declaredFields = clazz.getDeclaredMethods();//返回类中所有的方法，但不包括父类
        for (Method method : declaredFields){
            Class<?> returnType = method.getReturnType();//方法的返回值类型
            String methodName = method.getName();//方法签名
            System.out.print("  ");
            String modiferString = Modifier.toString(method.getModifiers());//获取方法的权限修饰符
            if (modiferString.length() > 0 ) System.out.print(modiferString + " ");
            System.out.print(returnType.getName() + " "+ methodName +"(");
            Class<?>[] parameterTypes = method.getParameterTypes();//获取参数类型列表
            for (int i = 0 ; i< parameterTypes.length ;i++){
                if (i > 0) System.out.print(", ");
                System.out.print(parameterTypes[i].getName());//获取类型名称
            }
            System.out.println(")");
            //描述方法抛出的异常类型的Class数组
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            //判断权限
            Modifier.isAbstract(method.getModifiers());
            System.out.println("exceptionTypes   : "+exceptionTypes.toString());

        }



    }

    /**
     * 打印域信息
     * @param clazz
     */

    public static void printField(Class clazz){
        Field[] declaredFields = clazz.getDeclaredFields();//获取类中所有域，但不包括父类
        for (Field field : declaredFields){
            Class<?> type = field.getType();//成员类型
            String name = field.getName(); //成员名称
            System.out.print(" ");
            String modifers = Modifier.toString(field.getModifiers());//成员的权限
            if (modifers.length() > 0) System.out.print(modifers + " ");
            System.out.println(type.getName() +" "+name +";");
        }
    }


}
