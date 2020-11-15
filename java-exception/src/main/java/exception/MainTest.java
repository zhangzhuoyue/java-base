package exception;

/**
 * @author zhangyue666
 * @description 测试自定义异常
 * @date 2020/11/15 17:09
 */
public class MainTest {
    //测试一  ，直接抛出自定义异常，指定异常信息
    /*public static void main(String[] args) {
        MainTest test = new MainTest();
        try {
            test.test();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getStackTrace()[0]);//打印异常在调用栈位置
            System.out.println(e.toString());//打印异常详细信息
        }
    }
    //将异常抛出，让调用者自行处理问题
    public void test() throws MyException {
        throw new MyException("自定义异常");
    }*/

    //测试二  ，抛出自定义异常 ，用指定的详细信息和原因构造一个新的异常； message：指定异常描述信息，cause：异常原因，二者构造一个异常
   /* public static void main(String[] args) {
        MainTest test = new MainTest();
        try {
            test.test1();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());//打印设置的异常信息  -> 异常新法基金
            System.out.println(e.getStackTrace()[0]);//异常发生最初的位置
            System.out.println(e.getCause().toString());//java的报错信息
        }
    }
    public void test1() throws MyException {
        try {
            int[] kk = new int[1];
            kk[2] = 0;
        } catch (Exception e) {
            *//*Throwable th = new Throwable("新发基金异常");//异常包装，可以将受检查异常，包装成一个运行时异常
            th.initCause(e);*//*
            throw new MyException("异常新法基金",e);//异常描述+具体的异常信息
        }
    }*/

    //测试三， 原因异常和属性条件  一起封装自定义对象
    public static void main(String[] args) {
        MainTest test = new MainTest();
        try {
            test.test();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getStackTrace()[0]);//发生异常的位置
            System.out.println(e.getMessage());//异常信息
        }
    }

    public void test() throws MyException {
        try {
            int[] kk = new int[1];
            kk[2] = 0;
        } catch (Exception e) {
            throw new MyException("0000", "原因",e);//使用自定义异常包装原始异常
        }
    }
}
