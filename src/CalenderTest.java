import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by huangxi on 2016/5/26.

public class CalenderTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int mouth = d.get(Calendar.MONTH);

        // set d to start date of month
        // 将d设置为这个月的第一天，并得到这一天是星期几。
        d.set(Calendar,Calendar.DAY_OF_MONTH,1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);

        //get first of week (Sunday in the U.S)
        //获取当前地区星期的起始日。为了确定所需要的缩进记距离，将日历对象的日减1，直到一个星期的第一天为止。
        int firstDayOfWeek = d.getFirstDayOfWeek();
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            d.add(Calendar,Calendar.DAY_OF_MONTH,-1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        // 输出表示星期几名称的缩写字符串。
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s",weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH,1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }


    }

}
 */