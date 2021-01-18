package a_1_ExtendsRelation;

/**
 * @author ze666
 * @desc
 * @date 2021/1/18 9:09
 */
public class Persion {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                '}';
    }
}
