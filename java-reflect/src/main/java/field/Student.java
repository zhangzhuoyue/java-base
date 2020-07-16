package field;

/**
 * Student
 *
 * @author Administrator
 * @desc
 * @time 2020/7/16 13:48
 **/
public class Student {
    private String name;
    public int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String  testName(String str,int age){
        return "sdf";
    }

    public  double  testName1(String str,int age){
        return 123;
    }
}
