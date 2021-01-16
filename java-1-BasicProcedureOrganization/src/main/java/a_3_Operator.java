import java.text.DecimalFormat;

/**
 * @author ze666
 * @description 运算符
 * @date 2021/1/15 14:48
 */
public class a_3_Operator {

    public static void main(String[] args) {
        //整数除法运算，得到商
        int i = 2 / 3;
        //整数的除法运算，得到余数
        int j = 2%3;

        //浮点数,除法，会得到小数点，需要设置精度，使用 DecimalFormat
        //DecimalFormat df = new DecimalFormat("#.##");保留2位小数，并去掉无效0；如20.10会去掉百分位的0
        //DecimalFormat df = new DecimalFormat("0.00");//保留2位小数，不够两位用0补；如20.10会去掉百分位的0
        DecimalFormat df = new DecimalFormat("0.00");//自动四色五入
        String d =df.format(1/2);

    }

}
