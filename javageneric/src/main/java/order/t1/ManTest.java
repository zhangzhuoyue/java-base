package order.t1;

import org.junit.Test;

public class ManTest {

    @Test
    public void test(){
        ManTools<String> kkk = new ManTools<>("kkk");
        String work = kkk.getWork();

        ManTools<Integer> g = new ManTools<>(3);
        g.setWork(90);
        Integer work1 = g.getWork();
        System.out.println(work1);
    }
}
