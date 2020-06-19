import com.sun.xml.internal.bind.v2.WellKnownNamespace;
import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
* cal1.add(Calendar.DAY_OF_MONTH,1);
cal1.add(Calendar.DAY_OF_YEAR,1);
cal1.add(Calendar.DATE,1);
* 就单纯的add操作结果都一样，因为都是将日期+1
* 但是Calendar设置DAY_OF_MONTH和DAY_OF_YEAR的目的不是用来+1
* AY_OF_MONTH的主要作用是cal.get(DAY_OF_MONTH)，用来获得这一天在是这个月的第多少天
Calendar.DAY_OF_YEAR的主要作用是cal.get(DAY_OF_YEAR)，用来获得这一天在是这个年的第多少天。
同样，还有DAY_OF_WEEK，用来获得当前日期是一周的第几天
*
* month是从0开始的，而月份是从1开始的，所以month需要加 1
* 星期： 1表示星期日 ，2表示星期一，依次推断
*
* */
public class DatesUtil {

    @Test
    public void test() {
        Date dayBegin = getEndDayOfNextWeek();
        //Date dayEnd = getDayEnd();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(dayBegin);
        System.out.println(format1);
    }


    /*获取当天开始时间  例如：2020-06-18 00:00:00*/
    public static Date getDayBegin() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);//Calendar.HOUR_OF_DAY是24小时制;Calendar.HOUR是12小时制
        cal.set(Calendar.MINUTE, 0);//set设置时间值。
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);//毫秒 1秒=1000毫秒
        return cal.getTime();
    }

    //获取当天结束时间   2020-06-18 23:59:59
    public static Date getDayEnd() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }

    //获取昨天开始时间
    public static Date getBeginDayOfYesterday() {
        /*
        * Calendar的getInstance( )方法返回用默认的地区和时区的当前日期和当前时间所初始化的GregorianCalendar（标准日历）。
        * 默认的GregorianCalendar( )方法用默认的地区和时区的当前日期和当前时间初始化对象
          GregorianCalendar定义了两个域：AD和BC。它们代表由公历定义的两个纪元。对GregorianCalendar对象，也有几个构造函数。
        * */
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, -1);//add 对日期增减
        return cal.getTime();
    }

    //获取昨天结束时间
    public static Date getEndDayOfYesterday() {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, -1);
        return cal.getTime();
    }

    /* 获取明天的开始时间*/
    public static Date getBeginDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayBegin());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    /*获取明天的结束时间*/
    public static Date getEndDayOfTomorrow() {
        Calendar cal = new GregorianCalendar();
        cal.setTime(getDayEnd());
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();
    }

    //获取本周的开始时间
    public Date getBeginDayOfWeek() {
        Date date = new Date();
        if (date == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        if (week == 1) {
            week = week + 1;
        }
        cal.add(Calendar.DATE, 2 - week);
        return getDayStartTime(cal.getTime());
    }

    //获取本周的结束时间
    public Date getEndDayOfWeek() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        return getDayEndTime(cal.getTime());

    }

    //获取上周开始时间时间
    public Date getBeginDayOfLastWeek() {
        Calendar cal = Calendar.getInstance();
        Date date = new Date();
        cal.setTime(date);
        int weekDay = cal.get(Calendar.DAY_OF_WEEK);
        if (weekDay == 1) weekDay += 1;
        cal.add(Calendar.DAY_OF_WEEK, 2 - weekDay - 7);
        return getDayStartTime(cal.getTime());
    }

    //获取上周结束时间
    public Date getEndDayOfLastWeek() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfLastWeek());
        cal.add(Calendar.DATE, 6);
        return getDayEndTime(cal.getTime());
    }

    //获取下周的开始时间
    public Date getBeginDayOfNextWeek() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        if (week == 1) week += 1;
        cal.add(Calendar.DAY_OF_WEEK, 2 - week + 7);
        return getDayStartTime(cal.getTime());
    }

    //获取下周的结束时间
    public Date getEndDayOfNextWeek() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getBeginDayOfNextWeek());
        cal.add(Calendar.DAY_OF_WEEK, 6);
        return getDayEndTime(cal.getTime());
    }

    @Test
    public void test2() {
        Date dayBegin =  getBeginDayOfMonth();
        //Date dayEnd = getDayEnd();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(dayBegin);
        System.out.println(format1);
        //System.out.println(getBeginDayOfMonth());
    }

    //本月开始时间
    public Date getBeginDayOfMonth(){
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(),getNowMonth()-1,1);
        return getDayStartTime(cal.getTime());
    }
    //本月结束时间
    public Date getEndDayOfMonth(){
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(),getNowMonth()-1,1);
        //cal.getActualMaximum();
        return null;
    }

    //获取今年是哪一年
    public int getNowYear() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    //获取本月是哪一个月
    public int getNowMonth() {
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONDAY);
        return ++month;
    }


    //获取某个日期的开始时间
    public Date getDayStartTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    //获取某个日期的结束时间
    public Date getDayEndTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }


}
