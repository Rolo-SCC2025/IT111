package package_daily_specials_final;

import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        customerOrder order;
        order = new customerOrder();


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the ordering page of Roland's Rocking Cheesecake and Coffeeshop!");
        System.out.println();
        if (order.weekend()) {
            System.out.println("We're very happy you found us but we are closed for the weekend!");
            System.out.println("You may continue selecting the day you wish to order and we will");
            System.out.println("confirm your order Monday morning for that week. Enjoy the weekend!");
            System.out.println();
        }

//        System.out.println("Please enter the day you wish to place an order.");

        while (true) {
            System.out.println("Please enter the day you wish to place an order.");

            order.orderDay = input.next().toLowerCase();

            switch (order.orderDay) {
                case "monday":
                    order.dayChoice = 0;
                    break;
                case "tuesday":
                    order.dayChoice = 1;
                    break;
                case "wednesday":
                    order.dayChoice = 2;
                    break;
                case "thursday":
                    order.dayChoice = 3;
                    break;
                case "friday":
                    order.dayChoice = 4;
                    break;
                case "saturday", "sunday":
                    System.out.print("We are closed on the weekends. ");
                    continue;
                default:
                    continue;
            }

            order.displaySpecials();
            break;

        }

        System.out.println("How many " + order.coffee[order.dayChoice] + "s would you like to order?");
        order.orderAmount = input.nextInt();

        if (order.orderAmount == 0) {
            System.out.println("Looks like you don't like " + order.coffee[order.dayChoice] + "s. Have a nice day.");
            System.exit(1);
        } else {
            if (order.orderAmount == 1) {
                order.price[order.dayChoice] *= order.orderAmount;
                System.out.print("One " + order.coffee[order.dayChoice] + " will be ");
                System.out.printf("$%.2f", order.price[order.dayChoice]);
                System.out.println("! Thank you.");
            } else if (order.orderAmount >= 2 && order.orderAmount <= 4) {
                order.price[order.dayChoice] *= order.orderAmount;
                System.out.print(order.orderAmount + " " + order.coffee[order.dayChoice] + "s will be ");
                System.out.printf("$%.2f", order.price[order.dayChoice]);
                System.out.println("! Thank you!");
            } else if (order.orderAmount >= 5 && order.orderAmount <=9) {
                order.price[order.dayChoice] *= (0.9*order.orderAmount);
                System.out.print("Wow! You really like " + order.coffee[order.dayChoice] + "s!! " + order.orderAmount + " " + order.coffee[order.dayChoice] + "s will be ");
                System.out.printf("$%.2f", order.price[order.dayChoice]);
                System.out.println(" with a 10% discount! Thank you so much for choosing us!");
            } else if (order.orderAmount >= 10) {  // ugh, messy below
                order.price[order.dayChoice] *= order.orderAmount;
                System.out.println("You are going to make a lot of people happy with these " + order.coffee[order.dayChoice] + "s! ");
                System.out.print(order.orderAmount + " " + order.coffee[order.dayChoice] + "s will be ");
                System.out.printf("$%.2f", (order.price[order.dayChoice]*0.8));
                System.out.printf(" saving you $%.2f", (order.price[order.dayChoice]*0.2));
                System.out.println(" with our 20% catering discount!");
                order.price[order.dayChoice] *= 0.8;
                System.out.println();
                System.out.println("Thank you for choosing us.");
            }


        }

        System.out.println("If you would like to leave a tip, please type true. If not, type false.");
        order.tipQuestion = input.nextBoolean();

        if (order.tipQuestion && order.orderAmount <=3) { // smaller number of drinks, flat tip first option

            System.out.println("Would you like to leave a flat tip? Type true or false.");
            order.tipType = input.nextBoolean();
            System.out.println("All tips are divided among the baristas and are greatly appreciated. Thank you!");

            if (order.tipType) {
                System.out.println("Please enter the dollar amount you wish to tip.");
                order.tipAmount = Math.abs(input.nextDouble());
            } else {
                System.out.println("Please enter the percentage you wish to tip.");
                order.tipPercentage = Math.abs(input.nextInt());
            }

        } else {
            System.out.println("Would you like to leave a percentage? Type true or false.");
            order.tipType = input.nextBoolean();
            System.out.println("All tips are divided among the baristas and are greatly appreciated. Thank you!");

            if (order.tipType) {
                System.out.println("Please enter the percentage you wish to tip.");
                order.tipPercentage = Math.abs(input.nextInt());
            } else {
                System.out.println("Please enter the dollar amount you wish to tip.");
                order.tipAmount = Math.abs(input.nextDouble());
            }

        }

        System.out.print("Your total is ");

        if (order.tipPercentage > 0) {
            order.price[order.dayChoice] += (order.price[order.dayChoice]*order.tipPercentage)*0.01;
        } else if (order.tipAmount > 0) {
            order.price[order.dayChoice] += order.tipAmount;
        }

        System.out.printf("$%.2f", order.price[order.dayChoice]);



    }
}
