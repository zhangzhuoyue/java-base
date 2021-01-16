/**
 * @author ze666
 * @description
 * @date 2021/1/15 16:22
 */
public class a_6_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("rtdrxdr");
        sb.insert(4,8);//指定位置插入数字
        System.out.println(sb.toString());
        sb.insert(4,"*****");//指定位置插入字符串
        System.out.println(sb.toString());
        sb.delete(4,7);//删除指定范围的字符
        System.out.println(sb.toString());
    }
}
