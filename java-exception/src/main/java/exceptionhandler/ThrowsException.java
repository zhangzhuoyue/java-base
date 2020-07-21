package exceptionhandler;

import org.junit.Test;

import java.io.*;

/**
 * ThrowsException
 *
 * @author Administrator
 * @desc  声明受检查异常
 * @time 2020/7/21 11:32
 **/
public class ThrowsException {

    /**
     * 需要抛出异常的情况
     * 1. 调用抛出受检查异常的方法，如 ：FileInputStream
     * 2. 程序运行中发现错误，使用throw 语句抛出受检查异常
     * 3. 不应该声明继承RunntionException的异常
     *
     */

    //IO操作抛出受检查异常
    public void exception1() throws FileNotFoundException {
        byte[] bytes = new byte[1];
        OutputStream outputStream = new FileOutputStream("");
    }

    //抛出异常
    public void exception2() throws IOException {
        byte[] bytes = new byte[1];
        try {
            InputStream inputStream = new FileInputStream("/wer");
           /* OutputStream outputStream = new FileOutputStream(inputStream);
            outputStream.write(bytes);*/
        } catch (FileNotFoundException e) {
            //使用有参构造器，写入异常影响
            throw new CustomizeException("文件未找到");
            //throw new FileNotFoundException();
        } catch (IOException e) {
            throw new IOException("异常");
        }

    }

    @Test
    public void test() throws IOException {
        exception2();
    }

}
