import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String specials;
        String coffee;
        double price;
        int order;

        while (true) {
            System.out.println("whilestart Please enter a day of the week excluding weekends.");
            specials = input.next();

// in the world of coffee, I need a name of a coffee beverage and a price

            switch (specials) {

            // my cases are the day of the week
            case "Monday":
                coffee = "Latte";
                price = 3.50;
                System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price is ");
                System.out.printf("$%.2f", price);
                System.out.println(".");
                break;
            case "Tuesday":
                coffee = "Mocha";
                price = 4.50;
                System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price is ");
                System.out.printf("$%.2f", price);
                System.out.println(".");
                break;
            case "Wednesday":
                coffee = "Espresso";
                price = 2.00;
                System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price is ");
                System.out.printf("$%.2f", price);
                System.out.println(".");
                break;
            case "Thursday":
                coffee = "Classic Drip";
                price = 1.00;
                System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price is ");
                System.out.printf("$%.2f", price);
                System.out.println(".");
                break;
            case "Friday":
                coffee = "Americano";
                price = 2.50;
                System.out.print(specials + "'s coffee of the day is a " + coffee + " and the price is ");
                System.out.printf("$%.2f", price);
                System.out.println(".");
                break;
            case "Saturday":
                System.out.print("saturday We are closed on the weekends. ");
                continue;
            case "Sunday":
                System.out.print("sunday We are closed on the weekends. ");
                continue;

            default:  // if user inputs anything other than a case specified (including typos or capitalized differently), this is chosen instead
                 continue;
            }
            break;
        }
        System.out.println("How many " + coffee + "s would you like to order?");
        order = input.nextInt();
        input.close();  // closes the input

        if (order == 0) {
            System.out.println("Looks like you don't like " + coffee + "s. Hope you have a nice day.");
        } else {
            if (order == 1) {
                price *= order;
                System.out.print("One " + coffee + " will be ");
                System.out.printf("$%.2f", price);
                System.out.print("! Thank you. Have a nice day.");
            } else if (order >= 2 && order <= 4 ) {
                price *= order;
                System.out.print(order + " " + coffee + "s will be ");
                System.out.printf("$%.2f", price);
                System.out.print("! Thank you! Have a nice day!");
            } else if (order >= 5) {
                price *= order;
                System.out.print("Wow! You really like " + coffee + "s!! " + order + " " + coffee + "s will be ");
                System.out.printf("$%.2f", price);
                System.out.print("! Thank you so much for visiting! Have a great day!");
            }
        }
    }
}
