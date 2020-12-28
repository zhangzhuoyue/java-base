import com.sun.istack.internal.NotNull;

public class Test {
    public static void main(String[] args) {
        String nn = null;


        test1(nn);
    }

    public static void test1(@NotNull String kk) {
        System.out.println("234567");
    }
}
