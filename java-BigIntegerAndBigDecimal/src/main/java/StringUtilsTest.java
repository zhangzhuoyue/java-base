import org.apache.commons.lang3.StringUtils;

/**
 * Mini
 *
 * @author Administrator
 * @desc StringUtils  isEmpty  isBlock
 * @time 2020/11/24 9:31
 **/
public class StringUtilsTest {
    public static void main(String[] args) {
        String kk = " ";
        int length = kk.length();
        boolean empty = StringUtils.isEmpty(kk);  //false    空格字符串记不为空
        boolean www = StringUtils.isBlank(kk);    //true     空格字符串也记为空白
    }
}
