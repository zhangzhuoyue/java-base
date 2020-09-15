package Genericclass.method;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/**
 * @author zzy
 * @date 2020/7/11 23:55
 */
public class genericMethod<T> {

    //从集合中获取数据，修改数据，重新进行封装
    public <T> void copy(List<? super T> dest, List<? extends T> src){
        int srcSize = src.size();
        int destSize = dest.size();
        if (destSize < srcSize){
            throw new IndexOutOfBoundsException("src 无法放到dest中");
        }
        if (srcSize < 100 || (src instanceof RandomAccess && dest instanceof RandomAccess )){
                for (int i= 0;i < srcSize ;i++){
                    dest.set(i,src.get(i));
                }
        }else {
            ListIterator<? super T> destIterator = dest.listIterator();
            ListIterator<? extends T> srcIterator1 = src.listIterator();
            for (int i = 0;i < src.size() ;i++){
                destIterator.next();
                destIterator.set(srcIterator1.next());
            }
        }
    }

    public <T extends Persion> void  mmm(T y){

    }

}
