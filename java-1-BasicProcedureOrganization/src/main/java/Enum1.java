/**
 * @author ze666
 * @description
 * @date 2021/1/15 16:44
 */
public enum Enum1 {

    SUCCESS("001", "成功"),
    FAILE("002", "失败");

    private String code;
    private String msg;

    Enum1(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Enum1 selectByCode(String code) {
        Enum1[] values = Enum1.values();
        for (Enum1 enum1 : values) {
            if (code != null && enum1.getCode().equals(code)) {
                return enum1;
            }
        }
        return null;
    }


}
