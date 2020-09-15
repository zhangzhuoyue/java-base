import Genericclass.method.Persion;
import genericmethod.GenericMethod;
import org.junit.Test;
import sun.security.x509.GeneralName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzy
 * @date 2020/7/8 20:58
 */
public class GenericTest {

    @Test
    public void test(){
        //
        Persion<String> persion = new Persion<>();
        persion.setAddress("北京");
        persion.setName("你好");
    }

    @Test
    public void genericMethod(){
        GenericMethod genericMethod = new GenericMethod();
        List<String> list = new ArrayList<>();
        String[] strings = new String[]{"df","er"};
        List<String> product = genericMethod.product(list, strings);
        System.out.println(product);

        System.out.println("--------------------");
        List<Integer> integerList = new ArrayList<>();
        Integer[] integers = {12,34,56};
        List<Integer> product1 = genericMethod.product(integerList, integers);
        System.out.println(product1);
    }

    @Test
    public void genericArray(){
        Persion<String>[] persions = new Persion[23];


    }
}
