import java.util.HashMap;
import java.util.Map;

/**
 * @author ze666
 * @description  变量
 * @date 2021/1/15 14:28
 */
public class a_2_Variable {

    private String name;
    private Integer age;
    private String school;
    //成员变量直接初始化，如果对象创建后一定好存在，则直接初始化
    private Map<String,String> map = new HashMap<>();

    //先声明，使用构造器间接初始化
    public a_2_Variable(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void order(){
        long lo = 12l;//变量直接赋值初始化
    }

    public String getSchool() {
        return school;
    }

    //使用方法进行间接初始化
    public void setSchool(String school) {
        this.school = school;
    }
}
