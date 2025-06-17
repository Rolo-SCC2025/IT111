package package_daily_specials_final;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class dailySpecialsFinal {

    LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();


    int dayChoice;
    String[] coffee = new String[] {"Latte", "Mocha", "Espresso", "Classic Drip", "Americano"}; // array? hurray~!
    String[] specials = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    double[] price = new double[] {3.5, 4.5, 2, 1, 2.5};



        public void displaySpecials() {

        // just like from the insurance, may have to make two files like it too. doesn't seem like it works here and also doesn't outside the static void main method.

            System.out.print(specials[dayChoice] + "'s coffee of the day is a " + coffee[dayChoice] + " and the price is ");
            System.out.printf("$%.2f", price[dayChoice]);
            System.out.println(".");

        }

        public boolean weekend(boolean weClosed) {

            if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                weClosed = true;
            } else {
                weClosed = false;
            }
            return weClosed;

        }



}
