/**
 * @author ze666
 * @description
 * @date 2021/1/15 16:38
 */
public class a_7_switch {

    public static void main(String[] args) {
        caseEnum("001");
    }
    public static void caseString(String sw){
        switch (sw){
            case "1":
                System.out.println(1);
                break;
            case "2":
                System.out.println(2);
                break;
            case "3":
                System.out.println(3);
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void caseInt(int sw){
        switch (sw){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public static void caseEnum(String sw){
        switch (Enum1.selectByCode(sw)){
            case SUCCESS:
                System.out.println("SUCCESS");
                break;
            case FAILE:
                System.out.println("FAILE");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

}
