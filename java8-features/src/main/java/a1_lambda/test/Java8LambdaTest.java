package a1_lambda.test;

import org.apache.commons.lang.StringUtils;

/**
 * @author zzy
 * @data 2021/1/4
 */
public class Java8LambdaTest {
    public static void main(String[] args) {
        LambdaInterfaces interfaces = (int a, String b) -> {
            int c = StringUtils.isNotBlank(b) ? 0 : Integer.parseInt(b);
            return a + c;
        };
        int i = interfaces.test1(12, "13");
    }
}
/**
 * Lambda 表达式免去了使用匿名方法的麻烦
 * 变量作用域
 */
