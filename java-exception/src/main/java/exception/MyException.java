package exception;

/**
 * @author zhangyue666
 * @description 自定义异常
 * @date 2020/11/15 17:02
 */
public class MyException extends Exception{
    private String code;//异常对应的返回码
    private String msg;//异常对应描述信息
    public MyException(){
        super();
    };
    //用详细信息指定异常
    public MyException(String msg){
        super(msg);
    }

    //用指定的详细信息和原因构造一个新的异常； message：指定异常描述信息，cause：异常原因，二者构造一个异常
    public MyException(String message, Throwable cause){
        super(message,cause);
    }

    //用指定原因构造一个新的异常
    public MyException(Throwable cause) {
        super(cause);
    }

    //指定异常信息
    public MyException(String code,String msg,Throwable cause){
        super(cause);
        this.code = code;
        this.msg = msg;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
