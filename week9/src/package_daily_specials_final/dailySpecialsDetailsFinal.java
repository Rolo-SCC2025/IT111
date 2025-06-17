package package_daily_specials_final;

import java.util.Scanner;


public class dailySpecialsDetailsFinal {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        dailySpecialsFinal order = new dailySpecialsFinal();
        int orderAmount;
        double total;

        System.out.println("Welcome to the ordering page of Roland's Rocking Cheesecake and Coffeeshop!");
        System.out.println();
        if (order.weekend(true)) {
            System.out.println("We're very happy you found us but we are closed for the weekend!");
            System.out.println("You may continue selecting the day you wish to order and we will");
            System.out.println("confirm your order Monday morning for that week. Enjoy the weekend!");
        } else {
            System.out.println("Please enter the day you wish to place an order.");
        }



    }


}
