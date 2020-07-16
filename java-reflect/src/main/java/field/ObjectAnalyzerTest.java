package field;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import javax.smartcardio.CommandAPDU;
import java.util.ArrayList;
import java.util.List;

/**
 * ObjectAnalyzerTest
 *
 * @author Administrator
 * @desc 测试公共toString()
 * @time 2020/7/16 14:12
 **/
public class ObjectAnalyzerTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0;i < 5 ;i++)
            list.add(i);
        Student[] kk = new Student[]{new Student("3423",12)};
        System.out.println(new ObjectAnalyer().toString(kk));
      /*  int[] kk = new int[12];
        Class<? extends int[]> aClass = kk.getClass();
        Class<?> componentType = aClass.getComponentType();*/
        //String name = componentType.getName();
        //componentType.isPrimitive()

    }
}
