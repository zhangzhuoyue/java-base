import java.beans.beancontext.BeanContext;

/**
 * @author zhangyue666
 * @description  switch  匹配枚举
 * @date 2020/11/15 21:08
 */
public class SwitchTest {
    public static void main(String[] args) {
        MyEnum address = MyEnum.ADDRESS;
        switch (address){
            case NAME:
                System.out.println("NAME");
                break;
            case ADDRESS:
                System.out.println("ADDRESS");
                break;
        }
    }
}
