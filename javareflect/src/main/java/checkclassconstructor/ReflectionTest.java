package checkclassconstructor;

import java.lang.reflect.*;
import java.util.Scanner;

/**
 * @author zhangyue666
 * @description
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
            Class<?> aClass = Class.forName(name);
            Class<?> superclass = aClass.getSuperclass();
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

    public static void printConstructors(Class clazz){
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor c : declaredConstructors){
            String name = c.getName();
            String modifers = Modifier.toString(c.getModifiers());
            if (modifers.length() > 0) System.out.print(modifers+" ");
            System.out.print(name +"(");
            Class[] parameterTypes = c.getParameterTypes();
            for (int j = 0 ;j < parameterTypes.length ;j++){
                if (j > 0) System.out.print(",");
                System.out.print(parameterTypes[j].getName());
            }
            System.out.println(");");
        }
    }

    public static void printMethods(Class clazz){
        Method[] declaredFields = clazz.getDeclaredMethods();
        for (Method method : declaredFields){
            Class<?> returnType = method.getReturnType();
            String methodName = method.getName();
            System.out.print("  ");
            String modiferString = Modifier.toString(method.getModifiers());
            if (modiferString.length() > 0 ) System.out.print(modiferString + " ");
            System.out.print(returnType.getName() + " "+ methodName +"(");
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (int i = 0 ; i< parameterTypes.length ;i++){
                if (i > 0) System.out.print(", ");
                System.out.print(parameterTypes[i].getName());
            }
            System.out.println(")");

        }
    }

    public static void printField(Class clazz){
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields){
            Class<?> type = field.getType();
            String name = field.getName();
            System.out.print(" ");
            String modifers = Modifier.toString(field.getModifiers());
            if (modifers.length() > 0) System.out.print(modifers + " ");
            System.out.println(type.getName() +" "+name +";");
        }
    }


}
