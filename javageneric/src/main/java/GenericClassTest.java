import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest {

   @Test
    public void test(){
      /*
      * List<Object>  List<String> 之间没有继承关系 ,他们是独立的
      * */
       List<String> list = new ArrayList<String>();
       //listGeneric(list);



   }

  /*
  * extends通配符上限
  * */
   public void listGeneric1(List<? extends Object> list){

   }

   /*
   * List<Object> 限定了List集合中只能装入Object对象，
   * List<Object> 和List<String> 是两个独立的，，没有联系
   * */
   public void listGeneric2(List<Object> list){

   }

}
