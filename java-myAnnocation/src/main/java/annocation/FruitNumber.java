package annocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FruitNumber
 *
 * @author Administrator
 * @desc
 * @time 2020/12/16 12:01
 **/
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitNumber {
   int number() default 0;
}

/**
 *注解声明位置：
 *包
 * 类（包括enum）
 * 接口（包括注解接口）
 * 方法
 * 构造器
 * 实例域（包含enum常量）
 * 局部变量
 * 参数变量
 * 类型参数
 */

/**
 * 注解类型用法
 * 声明注解提供了正在被声明的项的相关信息。例如，在下面的声明中
 * public User getUser(@NonNull String userId)
 *
 * 类型用法注解可以出现在下面的位置：
 *
 * 与泛化类型引元一起使用
 * 数组中的任何位置
 * 与超类和实现接口一起使用
 * 与构造器调用一起使用：

 * new @Localized String(...)
 * 与强制转型和instanceof检查一起使用
 *

 * (@Localized String)text, if(text instanceof @Localized String)
 * 与异常规约一起使用
 *
 * 与通配符和类型边界一起使用
 * 与方法和构造器引用一起使用
 *
 *
 * 注解this
 * public class Point{
 *     public boolean equals(@ReadOnly Point this, @ReadOnly Object other){...}
 * }
 * 第一个参数被称为接收器参数，它必须被命名为this，而它的类型就是要构建的类。
 */
