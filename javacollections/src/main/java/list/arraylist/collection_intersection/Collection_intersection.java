package list.arraylist.collection_intersection;

import java.util.ArrayList;
import java.util.List;

public class Collection_intersection {

    public static void main(String[] args) {
        /**
         * 使用集合工具，获取两个集合的交集
         */
        List<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("1234");
        list1.add("1233");
        List<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("1238");
        list2.add("1235");
        /**
         * retainAll 返回true，表示两个集合有交集。
         * 有两个集合list1和list2，判断这两个集合是否包含相同的对象或元素，
         *
         * 可以使用retainAll方法：list1.retainAll(list2)。
         *
         * 如果存在相同元素，list1中仅保留相同的元素。
         *
         * 如果不存在相同元素，list1会变为空。
         */
        boolean b = list1.retainAll(list2);
        System.out.println(b);
        System.out.println(list1);
    }
}
