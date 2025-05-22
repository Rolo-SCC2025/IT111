import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {

    public static void main(String[]args) {
        // displaying the current date

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // boring. show month, date of the week, and year

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        // the year would have to be an integer

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        // we would like to know the number of the day - if today is the 8th of the month, display 8

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is "+currentDay+", "+currentMonth+" " +currentDayNumber+", "+currentYear);
    }
}
