package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author zhangyue666
 * @description 声明受检查异常
 * @date 2020/11/15 16:49
 */
public class ThrowsException {
    //调用一个受检查异常方法
    public void test1() throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("c:/"),"utf-8");
    }

    //抛出异常，让调用者知道错误
    public void test2() throws Exception {
        String kk = "1";
        if ("1".equals(kk)){
            throw new Exception("未匹配到");
        }
    }
}
