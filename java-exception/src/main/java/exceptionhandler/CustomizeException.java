package exceptionhandler;

import java.io.IOException;

/**
 * CustomizeException
 *
 * @author Administrator
 * @desc 自定义异常类，继承exception   或者 Exception的子类，例如IOException
 * @time 2020/7/21 12:12
 **/
public class CustomizeException extends IOException {

    /**
     * 调用父类构造器
     */
    public CustomizeException() {

    }

    public CustomizeException(String message) {
        super(message);
    }

    public CustomizeException(Throwable cause) {
        super(cause);
    }

    //获取异常信息
    public String getInfo() {
        return getMessage();
    }
}
