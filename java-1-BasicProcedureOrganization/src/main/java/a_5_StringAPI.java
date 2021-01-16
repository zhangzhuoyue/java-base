import java.util.ArrayList;

/**
 * @author ze666
 * @description  常用stringAPI
 * @date 2021/1/15 16:15
 */
public class a_5_StringAPI {

    public static void main(String[] args) {
        //String.join()
        String[] str = {"qw","er","io"};
        String split = "-";
        String kk = String.join(split,str);//用给定的定界符连接字符串
        System.out.println(kk);
    }

}
