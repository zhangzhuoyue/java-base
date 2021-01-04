package a1_lambda.aVariable;

import a1_lambda.test.LambdaInterfaces;

/**
 * @author zzy
 * @data 2021/1/4
 * 变量作用域
 */
public class VariableTest {

    /**
     * lambda 表达式只能引用标记了 final 的外层局部变量，这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
     *
     * @param args
     */
    public final int m = 12;//public int  m = 12;

    public static void main(String[] args) {

        VariableTest test = new VariableTest();
        LambdaInterfaces interfaces = test.test1();
        int i = interfaces.test1(12, "12");
    }

    //lambda 表达式只能引用标记了 final 的外层局部变量
    //局部变量 可以是全局的，也可以是局部的，但是只能是final类型的  或者 隐形的final【没有声明为final，但是在lambda后没有再修改过】
    public LambdaInterfaces test1() {
        final int kk = 12;//局部变量 int kk = 12;
        LambdaInterfaces interfaces = (int a, String b) -> {
            int i = Integer.parseInt(b);
            return i + a + m + kk;
        };
        return interfaces;
    }

    //在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
    public LambdaInterfaces test3(){
        final int kk = 12;//局部变量 int kk = 12;
        LambdaInterfaces interfaces = (int a, String b) -> {
            int i = Integer.parseInt(b);
            return i + a + m + kk;
        };
        return interfaces;
    }
}
