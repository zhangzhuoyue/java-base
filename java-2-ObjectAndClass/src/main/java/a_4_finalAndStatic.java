/**
 * @author ze666
 * @desc  final  static
 * @date 2021/1/16 10:59
 */
public class a_4_finalAndStatic {

    /**
     * final  对象初始化后不会再修改，并且对象创建必须初始化final域。
     * 使用：如果不是多个类共同使用该final变量，则不需要设置static
     * 经验：平时编码中经常将final变量设置为static，不合理。
     *
     * static 类域，所有对象公用。
     * 使用：1.方法不需要访问对象状态，所需参数都是通过显示参数提供；2. 一个方法需要访问类的静态域
     * 3. 常见一种用途，静态工厂方法 工厂方法：LocalDate.new和 LocalDate.of
     * LocalDateTime now = LocalDateTime.now();//获取当前时间
     * LocalDate of = LocalDate.of(2021, 2, 3);
     * @param args
     */
    public static void main(String[] args) {

    }

}
