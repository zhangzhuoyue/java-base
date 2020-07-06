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
*
* Date1.after(Date2),当Date1大于Date2时，返回TRUE，当小于等于时，返回false；
即Date2比Date1小的true/false，当Date2日期比Date1小的时候为true，否则为false

Date1.before(Date2)，当Date1小于Date2时，返回TRUE，当大于等于时，返回false；

如果业务数据存在相等的时候，而且相等时也需要做相应的业务判断或处理时，请注意。

如果有这样的需求，在某个日期内的业务check，那么你需要使用：！Date1.after(Date2)

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
        Date dayBegin = getEndDayOfYear();
        //Date dayEnd = getDayEnd();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(dayBegin);
        System.out.println(format1);
        //System.out.println(getBeginDayOfMonth());
    }

    //本月开始时间
    public Date getBeginDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(), getNowMonth() - 1, 1);
        return getDayStartTime(cal.getTime());
    }

    //本月结束时间
    public Date getEndDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(), getNowMonth() - 1, 1);
        int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(getNowYear(), getNowMonth() - 1, day);
        return getDayEndTime(cal.getTime());
    }

    //获取上月开始时间
    public Date getBeginDayOfLastMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(), getNowMonth() - 2, 1);
        return getDayStartTime(cal.getTime());
    }

    //获取上月的结束时间
    public Date getEndDayOfLastMonth() {
        Calendar cal = Calendar.getInstance();
        cal.set(getNowYear(), getNowMonth() - 2, 1);
        int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        cal.set(getNowYear(), getNowMonth() - 2, day);
        return getDayEndTime(cal.getTime());
    }

    //获取本年的开始时间
    public Date getBeginDayOfYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, getNowYear());
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DATE, 1);
        return getDayStartTime(cal.getTime());
    }

    //本年的结束时间
    public Date getEndDayOfYear() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, getNowYear());
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DATE, 31);
        return getDayEndTime(cal.getTime());
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

    @Test
    public void test3() {

        Date date = new Date();
        java.sql.Date  d = new java.sql.Date(date.getTime());
        System.out.println(d);

        Date diffDays = min(getBeginDayOfLastWeek(), getEndDayOfNextWeek());
        System.out.println(diffDays);
    }

    //两个日期相减得到天数
    public static int getDiffDays(Date beginDate, Date endDate) {
        if (beginDate == null || endDate == null) {
            throw  new  IllegalArgumentException("getDiffDays params is null");
        }

        long diff = (endDate.getTime() - beginDate.getTime()) / (1000 * 60 * 60 * 24);
        int days = new Long(diff).intValue();
        return days;
    }

    //两个日期相减得到的毫秒数
    public long dateDiff(Date beginDate,Date endDate){
        long beginTime = beginDate.getTime();
        long endTime = endDate.getTime();
        return endTime - beginTime;
    }

    //获取两个日期中最大日期

    public Date max(Date beginDate , Date endDate){
        if (beginDate == null){
            return endDate;
        }
        if (endDate == null){
            return beginDate;
        }
        if (beginDate.after(endDate)){
            return beginDate;
        }
        return endDate;
    }

    //获取两个日期最小日期
    public Date min(Date beginDate,Date endDate){
        if (beginDate == null){
            return endDate;
        }
        if (endDate == null){
            return beginDate;
        }
        if (beginDate.after(endDate)){
            return endDate;
        }
        return beginDate;
    }

    //返回某个日期后几天的日期
    public Date getNextDay(Date date ,int i){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE,cal.get(Calendar.DATE)+i);
        return cal.getTime();
    }

    //返回某个日期前几天的日期
    public Date getFrontDay(Date date , int i){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE,cal.get(Calendar.DATE)-i);
        return cal.getTime();
    }


}
