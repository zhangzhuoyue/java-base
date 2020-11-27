import java.text.DecimalFormat;

/**
 * DefimalFormatTest
 *
 * @author Administrator
 * @desc 数字格式
 * @time 2020/11/24 11:10
 **/
public class DefimalFormatTest {

    public static void main(String[] args) {
        double pi = 3.1415927; //圆周率
        //取一位整数
        System.out.println(new DecimalFormat("0").format(pi)); //3
        //取一位整数和两位小数
        System.out.println(new DecimalFormat("0.00").format(pi)); //3.14
        //取两位整数和三位小数，整数不足部分以0填补。
        System.out.println(new DecimalFormat("00.000").format(pi));// 03.142
        //取所有整数部分
        System.out.println(new DecimalFormat("#").format(pi)); //3
        //以百分比方式计数，并取两位小数
        System.out.println(new DecimalFormat("#.##%").format(pi)); //314.16%  先乘以100 再岁小数点后两位四舍五入
        //基金的收益率保留两位小数点，并四舍五入
        long c = 299792458; //光速
        //显示为科学计数法，并取五位小数
        System.out.println(new DecimalFormat("#.#####E0").format(c)); //2.99792E8
        //显示为两位整数的科学计数法，并取四位小数
        System.out.println(new DecimalFormat("00.####E0").format(c)); //29.9792E7
        //每三位以逗号进行分隔。
        System.out.println(new DecimalFormat(",###").format(c));  //299,792,458
        //将格式嵌入文本
        System.out.println(new DecimalFormat("光速大小为每秒,###米。").format(c));

        double pk =3433451.0002323;//###,##0.00    3,433,451.00
        double pm =0.1002323;//#0.00   整数部分的0不会丢失，保留两位小数，四舍五入
        System.out.println(new DecimalFormat("#0.##").format(pm));
        //# 占位符，有数字展示，没有不显示。 0 占位符，有数字展示 ，没有数字用0展位
    }
}
