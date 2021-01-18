package a_5_ChangeParam;

import java.util.Objects;

/**
 * @author ze666
 * @desc
 * @date 2021/1/18 21:57
 */
public class a_5_ChangeParam {
    public static void main(String[] args) {
        String[] s = new String[9];

        paramTest1(new String[]{"",""});

    }
    //可变参数的变化
    public static void paramTest1(Object ... obj){
        System.out.println(obj.toString());
    }
}
