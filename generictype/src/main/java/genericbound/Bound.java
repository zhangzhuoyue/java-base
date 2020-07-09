package genericbound;

import org.junit.Test;

/**
 * @author zzy
 * @date 2020/7/8 22:11
 */
//类型变量的限定
public class Bound {

    public <T extends Persion> T find(T t){
        t.findNamre("");
        String k = ";";
        return t;
    }

   @Test
    public void test(){
       Student student = find(new Student());
       student.find("");
   }

}
