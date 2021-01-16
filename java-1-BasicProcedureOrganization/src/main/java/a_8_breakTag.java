/**
 * @author ze666
 * @description 中断
 * @date 2021/1/15 17:14
 */
public class a_8_breakTag {

    public static void main(String[] args) {
        breakToTag();
    }

    public static void cotinueTest(){
        for (int i = 0 ; i < 12 ;i++){
            if (i == 7){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void breakTest(){
        for (int i = 0 ; i < 12 ;i++){
            if (i == 7){
                break;
            }
            System.out.println(i);
        }
    }

    public static void breakToTag(){
        for (int k = 0 ; k < 12 ;k++) {
            read_data:   //跳转标签，放在指定循环的外围，并且使用冒号结束。
            for (int j = 0 ; j < 12 ;j++) {
                for (int i = 0 ; i < 12 ;i++){
                    if (i == 7){
                        break read_data;
                    }
                    System.out.println(i);
                }
            }

            System.out.println("over");
        }
    }

}
