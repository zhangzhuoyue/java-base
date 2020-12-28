package annocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FruitName
 *
 * @author Administrator
 * @desc
 * @time 2020/12/16 11:58
 **/
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitName {
    /**
     * 注解元素:
     *    格式：type elementName() 没有默认值; 或者 String elementName() default "" 有默认值【常用】

     * @return
     */
    String fruitName() default "";
    /**
     * 注解元素类型：
     * 基本类型（int、short、long、byte、char、double、float或者boolean）
     * String
     * Class（具有一个可选的类型参数，例如Class<? extends MyClass>）
     * enum类型
     * 注解类型
     * 由前面所述类型组成的数组（由数组组成的数组不是合法的元素类型）
     * 下面是一个合法的元素声明的例子：
     * public @interface BugReport{
     *     enum Status { UNCONFIRMED, CONFIRMED, FIXED, NOTABUG};
     *     boolean showStopper() default false;
     *     String assignedTo() default "[none]";
     *     Class<?> testCase() default Void.class;
     *     Status status() default Status.UNCONFIRMED;
     *     Reference ref() default @Reference;
     *     String[] reprotedBy();
     * }
     */

    /**
     * 注解使用格式：
     @BugReport(assignedTo="Harry", severity=10)
     元素的顺序无关紧要。下面这个注解和前面那个一样
     @BugReport(severity=10, assignedTo="Harry")
     */

    /**
     * 标记注解：
     * 如果没有指定元素，要么是因为注解中没有任何元素，要么是因为所有的元素都使用默认值，那么你就不需要用圆括号了
     * 例如：@BugReport
     */

    /** 只有一个元素，却元素名称是value，使用注解给期指定参数时，忽略掉这个元素名以及等号
     *
     可以写成：@ActionListenerFor("yellow") ，而不是@ActionListenerFor(value="yellow")
     */
}
