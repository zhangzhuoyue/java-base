/**
 * @author zhangyue666
 * @description
 * @date 2020/11/15 21:00
 */
public enum MyEnum {
      NAME("张三","12"),
      ADDRESS("lisi","13");

      MyEnum(String name,String age){
          this.name = name;
          this.age = age;
      }
      private String name;
      private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
