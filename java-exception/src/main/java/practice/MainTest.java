package practice;

/**
 * MainTest
 *
 * @author Administrator
 * @desc
 * @time 2020/9/15 12:32
 **/
public class MainTest {
    public static void main(String[] args) {
        testEcxeption();
    }

    private static void testEcxeption(){
        try {
            int[] arr = new int[1];
            int b = arr[2];
            System.out.println("3333333333333333");
        }catch (Exception e){
            System.out.println("dsfsaf");
            throw new RuntimeException();

        }
    }
}
