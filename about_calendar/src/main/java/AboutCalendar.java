import java.util.Calendar;
import java.util.TimeZone;

public class AboutCalendar {
    public static void main(String args[]) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,1);
        System.out.println(calendar.getTime());
    }
}
