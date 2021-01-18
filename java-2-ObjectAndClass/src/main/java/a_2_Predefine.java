import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author ze666
 * @desc 预定义类
 * @date 2021/1/16 9:39
 */
public class a_2_Predefine {

    public static void main(String[] args) {
        dateTest();
    }

    //1.8 LocalDateTime  ,线程安全，对日期、时间、星期处理方便 。1.8之前对日期的处理使用Calendar，不方便
    public static  void dateTest(){
        LocalDateTime now = LocalDateTime.now();//获取当前时间
        String s = now.toString();
        LocalDate localDate = now.toLocalDate();//获取日期
        LocalTime localTime = now.toLocalTime();//获取时间
        String format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now);//对时间格式化

        //构造日期 LocalDate
        LocalDate of = LocalDate.of(2021, 2, 3);
        String s1 = of.toString();
        int monthValue = of.getMonthValue();//获取月份
        int dayOfMonth = of.getDayOfMonth();//当月几号
        DayOfWeek dayOfWeek = of.getDayOfWeek();//返回星期几，星期的顺序
        LocalDate localDate1 = of.plusDays(3);//生成当前日期之后几天

        //构造时间LocalDate
        LocalTime now1 = LocalTime.now();//返回当前时间
        int hour = now1.getHour();//获取当前几点


    }
}
