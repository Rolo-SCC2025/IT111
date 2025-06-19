package package_daily_specials_final;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class customerOrder {

    LocalDate today = LocalDate.now();
    DayOfWeek dayOfWeek = today.getDayOfWeek();


    String[] coffee = new String[] {"Latte", "Mocha", "Espresso", "Classic Drip", "Americano"}; // array? hurray~!
    String[] specials = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    double[] price = new double[] {3.5, 4.5, 2, 1, 2.5};

    String orderDay;
    int dayChoice;

    int orderAmount;            // this will be how many beverages
    boolean tipQuestion;        // leave a tip?
    boolean tipType;            // how?
    int tipPercentage;          // if the customer wants to tip by %
    double tipAmount;           // or by flat amount
    double total;

    public void displaySpecials() {

        // just like from the insurance, may have to make two files like it too. doesn't seem like it works here and also doesn't outside the static void main method.

        if (dayChoice == 4 || dayChoice == 2) {
            System.out.print(specials[dayChoice] + "'s coffee of the day is an " + coffee[dayChoice] + " and the price is ");
        } else {
            System.out.print(specials[dayChoice] + "'s coffee of the day is a " + coffee[dayChoice] + " and the price is ");
        }
        System.out.printf("$%.2f", price[dayChoice]);
        System.out.println(".");

    }

    public boolean weekend() {

        return (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);

    }


}
