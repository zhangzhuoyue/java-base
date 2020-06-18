import org.junit.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class DatesUtil {

    @Test
    public void test(){
        Date dayBegin = getBeginDayOfYesterday();
        //Date dayEnd = getDayEnd();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(dayBegin);
        System.out.println(format1);
    }


    //获取当天开始时间  例如：2020-06-18 00:00:00
    public static Date getDayBegin(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,0);//Calendar.HOUR_OF_DAY是24小时制;Calendar.HOUR是12小时制
        cal.set(Calendar.MINUTE,0);
        cal.set(Calendar.SECOND,0);
        cal.set(Calendar.MILLISECOND,0);//毫秒 1秒=1000毫秒
        return cal.getTime();
    }

    //获取当天结束时间   2020-06-18 23:59:59
    public static Date getDayEnd(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,23);
        cal.set(Calendar.MINUTE,59);
        cal.set(Calendar.SECOND,59);
        return cal.getTime();
    }

    //获取昨天开始时间
    public static Date getBeginDayOfYesterday(){
        /*
        * Calendar的getInstance( )方法返回用默认的地区和时区的当前日期和当前时间所初始化的GregorianCalendar（标准日历）。
        * 默认的GregorianCalendar( )方法用默认的地区和时区的当前日期和当前时间初始化对象
          GregorianCalendar定义了两个域：AD和BC。它们代表由公历定义的两个纪元。对GregorianCalendar对象，也有几个构造函数。
        * */
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH,-1);//对时间加减法
        return cal.getTime();
    }



}
