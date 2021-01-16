import java.util.Arrays;
import java.util.Comparator;
import java.util.zip.ZipEntry;

/**
 * @author ze666
 * @description  数组拷贝，数组初始化。
 * @date 2021/1/15 18:56
 */
public class a_10_ArrayAndArrayCopy {

    public static void main(String[] args) {
        /**
         * 数组初始化
         */
        int[] arr;//  只是声明数组，并没有初始化真正数组
        //数组初始化，必须制定数组长度。即使指定数组长度是0,
        int[] arr1 = new int[0];//,生成一个没有长度的数组，同时返回null数组不是好的选择，即使返回一个数组长度=0也会对算法有很大的帮助。

        /**
         *    数组拷贝 Arrays.copy(),将数组复制到一个新的数组中,这个方法一般给数组扩容
         */
        String[] strArray = new String[5];
        String[] strings = Arrays.copyOf(strArray, 2*strArray.length);

        /**
         *Arrays.sort(   ,   )  优化的快速排序算法，对大多数数据集合效率比较高
         */
        Arrays.sort(strArray, (o1, o2) -> {
            if (o1 == null && o2 == null) return 0;
            if (o2 == null ) return  -1;
            if (o1 == null) return 1;
            return o1.compareTo(o2);
        });
        for (int i = 0 ;i < strArray.length ; i++){
            strArray[i] = "kk";
        }

        /**
         * 数组查找功能
         */
        int zhong = Arrays.binarySearch(strArray, "中");

        /**
         * 数组所有元素设置相同值
         */
        Arrays.fill(strArray,"zhongwen");

        String[] strings1 = Arrays.copyOf(strArray, strArray.length);
        //比较两个数组完全相等
        boolean equals = Arrays.equals(strings1, strArray);

    }

}
