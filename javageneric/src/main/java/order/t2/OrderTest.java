package order.t2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderTest {

    @Test
    public void persionTest() {
        List<Persion> list = new ArrayList<>();
        list.add(new Persion(1, "wang里1"));
        list.add(new Persion(2, "frfa里2"));
        list.add(new Persion(3, "bds里3"));
        Collections.sort(list);
        System.out.println(list);
    }

    @Test
    public void studentTest() {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "wang里1"));
        list.add(new Student(2, "frfa里2"));
        list.add(new Student(3, "bds里3"));
        Collections.sort(list, (o1, o2) -> {
            int age = o1.getAge();
            int age1 = o2.getAge();
            if (age - age1 == 0)
                return 0;
            else
                return (age - age1 > 0) ? 1 : -1;

        });
    }

    @Test
    public void test1(){

    }
}
