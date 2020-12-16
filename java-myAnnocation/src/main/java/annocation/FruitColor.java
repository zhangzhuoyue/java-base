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
public @interface FruitColor {

  public enum Color{BLUE,GREEN}

  Color fruitColor() default Color.GREEN;

}
