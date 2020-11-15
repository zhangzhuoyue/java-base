import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * @author zhangyue666
 * @description
 * @date 2020/11/15 21:18
 */
public class BigIntegerTest {

    public static void main(String[] args) {
       /* BigInteger in1 = BigInteger.valueOf(42652);//将普通数值转换为大数值
        BigInteger big1 = new  BigInteger("79798");
        BigInteger big2 = new  BigInteger("23");*/
        //大数值的运算必须使用实例方法，不能使用运算符。
       /* BigInteger add = big1.add(big2);//加法
        System.out.println(add.intValue());//转换不同数值
        System.out.println(big1.multiply(big2).longValue());//乘法运算
        System.out.println(big1.subtract(big2).longValue());//减法，得到整数部分
        System.out.println(big1.divide(big2).longValue());//除法
        System.out.println(big1.compareTo(big2));//比较  ，big1和big2相等，返回0；big1大于big2返回正数，big1小于big2返回负数*/


        BigDecimal decimal1 = BigDecimal.valueOf(1.21);
        BigDecimal decimal2 = BigDecimal.valueOf(-1.1);
        System.out.println(decimal1.add(decimal2).floatValue());
        System.out.println(decimal2.subtract(decimal2).setScale(1,BigDecimal.ROUND_UP));//减法，setScale()设置小数点精度
        System.out.println(decimal1.multiply(decimal2,MathContext.DECIMAL128).doubleValue());
        System.out.println(decimal1.divide(decimal2,2,BigDecimal.ROUND_HALF_UP));

    }

}
