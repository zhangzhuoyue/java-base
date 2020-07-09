package genericmethod;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author zzy
 * @date 2020/7/8 21:20
 */
//泛型方法提供处理一类问题的通用模板
public class GenericMethod {

    public <T> List<T> product(List<T> list, T[] array){
        for (T t : array){
            list.add(t);
        }
        return list;
    }
}
