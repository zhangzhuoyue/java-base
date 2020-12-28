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

/**
 * 注解分类：
 * 标准注解
 * 注解接口	应用场合	目的
 * Deprecated	全部	将项标记为过时
 * SuppressWarnings	除了包和注解之外的所有情况	阻止某个给定类型的警告信息
 * SafeVarargs	方法和构造器	断言varargs参数可安全使用
 * Override	方法	检查该方法是否覆盖了某一个超类方法
 * FunctionalInterface	接口	将接口标记为只有一个抽象方法的函数式接口
 * PostConstruct	方法	被标记的方法应该在构造之后立即被调用
 * PreDestroy	方法	被标记的方法应该在移除之前立即被调用
 * Resource	类、接口、方法、域	在类或接口上：标记为在其他地方要用到的资源。在方法或域上：为“注入”而标记
 * Resources	类、接口	一个资源组
 * Generated	全部
 * Target	注解	指明可以应用这个注解的那些项
 * Retention	注解	指明这个注解可以保留多久
 * Documented	注解	指明这个注解应该包含在注解项的文档中
 * Inherited	注解	指明当这个注解应用与一个类的时候，能够自动被它的子类继承
 * Repeatable	注解	指明这个注解可以在同一个项上应用多次
 * 用于编译的注解
 * 用于管理资源的注解
 * 元注解
 * 源码级注解处理
 * 注解处理
 * 1
 * javac -process ProcessorClassName1, ProcessorClassName2, ...sourceFiles
 */
