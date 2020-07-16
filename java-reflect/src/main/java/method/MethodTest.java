package method;

import field.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * MethodTest
 *
 * @author Administrator
 * @desc 反射描述方法
 * @time 2020/7/16 16:50
 **/
public class MethodTest {

    public static void main(String[] args) throws Exception {
        /*Student student = new Student("12", 23);
        Class<Student> studentClass = Student.class;
        Method getAge = studentClass.getMethod("getAge");
        Method setAge = studentClass.getMethod("setAge",int.class);
        setAge.invoke(student,123);
        Object invoke = getAge.invoke(student, null);
        System.out.println(invoke);*/
        reflectMethod4();
    }

    //反射调用无参方法
    public static void reflectMethod1() throws Exception {
        //通过反射调用无参方法的
        Student student = new Student("12", 23);
        Class<Student> studentClass = Student.class;
        Method getAge = studentClass.getMethod("getAge");
        Object invoke = getAge.invoke(student);
        System.out.println(invoke);
    }

    //反射调用有参方法
    public static void reflectMethod2() throws Exception {
        //反射调用有参方法
        Student student = new Student("12", 23);
        Class<Student> studentClass = Student.class;
        Method setAge = studentClass.getMethod("setAge",int.class);
        setAge.invoke(student,123);
    }


    //反射调用静态方法
    public static void reflectMethod3() throws Exception {
        //反射调用有参方法
        Student student = new Student("12", 23);
        Class<Student> studentClass = Student.class;
        Method testName = studentClass.getMethod("testName", String.class, int.class);
        Object dddd = testName.invoke(null,"dddd", 123);
        System.out.println(dddd);
    }

    /**
     * 1. 反射调用方法,例如：方法的返回值是基本类型 int，invoke会实际会返回其包装类型 Integer ,必须完成类型转账，可以使用自动拆箱将他转换为int
     * 2. 注意：使用包装类传递基本数据类型，基本类型的返回值必须是未包装的
     */
    public static void reflectMethod4() throws Exception {
        //反射调用有参方法
        Student student = new Student("12", 23);
        Class<Student> studentClass = Student.class;
        Method testName = studentClass.getMethod("testName1", String.class, int.class);
        //int dddd = (Integer)testName.invoke(student,"dddd", 123);
        double dddd = (Double) testName.invoke(student,"dddd", 123);
        System.out.println(dddd);
    }

}
