package a_1_ExtendsRelation;

/**
 * @author ze666
 * @desc
 * @date 2021/1/18 9:10
 */
public class Student extends Persion {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        String name = super.getName(); //在子类中调用父类方法
        Object obj = this;
        //obj = super; super不是一个对象引用，只是一个调用超类方法的特殊关键字
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
