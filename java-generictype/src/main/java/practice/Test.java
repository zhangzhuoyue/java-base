package practice;

import java.util.List;

/**
 * Test
 *
 * @author Administrator
 * @desc
 * @time 2020/9/14 14:34
 **/
public class Test {

    @org.junit.Test
    public void test1(){
        SimpleGenericClass<Integer> simpleGenericClass = new SimpleGenericClass<>();
        simpleGenericClass.setX(12);
        Integer x = simpleGenericClass.getX();
        List<String> string = simpleGenericClass.test1("string");

    }
}
