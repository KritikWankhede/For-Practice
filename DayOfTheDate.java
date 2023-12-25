import java.util.Calendar;
import java.util.GregorianCalendar;
// import java.util.Scanner;
// import java.util.Locale;
public class DayOfTheDate {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        int month = 8; // Example: August
        int day = 30;
        int year = 2023;

        Calendar cal = new GregorianCalendar(year, month-1, day);
        String[] days ={" ","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int dayOftheWeek=cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(days[dayOftheWeek] );
        
    }
}
