/**
 * @author ze666
 * @desc   对象构造
 * @date 2021/1/16 12:46
 */
public class a_6_ObjectConstructor {

    private String name;
    private Integer age;

    /**
     * 构造器重载
     *
     * 重载概念：多个方法有相同的名字，不同参数，就是重载。
     * 方法名和参数类型叫做方法签名，访问类型不是方法签名的一部分。
     * 好处：
     * 1.重载方法只是对原有方法的一种升级，相同功能不同使用场景。java中String.valueOf()
     * 1.重载的最直接作用是方便了程序员可以根据不同的参数个数，顺序，类型，自动匹配方法，减少写过个函数名或方法名的重复步骤
     */

    public a_6_ObjectConstructor(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public a_6_ObjectConstructor() {
    }

    //使用this对调用另外一个构造器。this关键字的调用，使得对公用构造器只需要编写一次。
    public a_6_ObjectConstructor(String name) {
        this(name,null);
    }

    public static void main(String[] args) {

    }

    /**
     * 初始化数据域方式：
     * 1. 在构造器中    2.在声明中   3.初始化块
     *
     * 构造器初始化：
     * 初始化方式 1：隐式初始化，调用无参构造器 ；2.显式初始化，手动编写构造器，可以使用this调用已有的构造器
     *
     * 初始化块：
     * 代码块，只要构造器对象，代码块就会执行
     * 首先运行代码块，然后运行构造器
     *
     */

}


