package annocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FruitColor
 *
 * @author Administrator
 * @desc
 * @time 2020/12/16 12:00
 **/
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/**
 * 每个注解都必须通过一个注解接口进行定义
 */
public @interface FruitColor {

    public enum Color {BLUE, GREEN};

    /**
     * 接口中的方法与注解中的元素相对应
     * @FruitColor(fruitColor=Color.Blue)
     *
     * @return
     */
    Color fruitColor() default Color.GREEN;

}
