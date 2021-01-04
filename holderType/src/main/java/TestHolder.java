import org.omg.CORBA.IntHolder;

/**
 * @author zzy
 * @data 2021/1/4
 * Integer    无法将修改数据传递，因为value属性是 final ，每次修改创建一个新的值
 * IntHolder  可以将修改数据传递，因为value属性非 final ，每次修改共用一个地址
 * DoubleHolder
 * ShortHolder
 */
public class TestHolder {

    public static void main(String[] args) {
        IntHolder intHolder = new IntHolder(12);
        test1(intHolder);

    }


    public static void test1(IntHolder holder) {
        holder.value = 2 + holder.value;
    }

}
