package assertTest;

/**
 * @author zhangyue666
 * @description 断言测试
 * @date 2020/11/15 20:32
 */
public class AssertTest {

    public static void main(String[] args) {
        AssertTest.class.getClassLoader().setClassAssertionStatus("assertTest.AssertTest" ,true);
        try {
            int kk = 4;
            assert  kk == 0;
            System.out.println("wefwef");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 * 断言默认不开启的，程序的中的断言默认都忽略，-enableassertions 加入启动参数后断言生效
 */
