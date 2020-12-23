package annocation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FruitProver
 *
 * @author Administrator
 * @desc 水果供应注解
 * @time 2020/12/16 12:12
 **/
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProver {
    public enum Color {BLUE, GREEN};

    //供应商编号
    public int id() default -1;

    //供应商名称
    public String name() default "";

    //供应商地址
    public String address() default "";

}
