/**
 * @author ze666
 * @description 位运算符
 * @date 2021/1/15 15:34
 */
public class a_4_BitOperation {

    public static void main(String[] args) {
        int i = 121;
        int j = 129;
        System.out.println("与 &:" + (i & j));//两个操作数中位都为1，结果才为1，否则结果为0
        System.out.println("或 |:" + (i | j));//两个位只要有一个为1，那么结果就是1，否则就为0
        System.out.println("异或 ^:" + (i ^ j));//两个操作数的位中，相同则结果为0，不同则结果为1
        System.out.println("非 ~:" + (~j));//如果位为0，结果是1，如果位为1，结果是0   只有一个操作数
        //3 << 2 左移2位，既3乘以2的2次方    ； 3 >> 2 右移2位，既3乘以2的-2次方
        System.out.println(64 >> 3);
    }

}
