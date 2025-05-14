import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

specials = input.next();

// input.close();  // closes the input
// in the world of coffee, I need a name of a coffee beverage and a price

        String coffee;
        double price;

boolean saturday = specials.equals("Saturday");
boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a day of the week excluding weekends.");
            specials = input.next();
        }

        switch (specials) {

        // my cases are the day of the week
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a "+coffee+" and the price is $"+price);
                break;
            case "Tuesday":
                coffee = "Mocha";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a "+coffee+" and the price is $"+price);
                break;
            case "Wednesday":
                coffee = "Espresso";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a "+coffee+" and the price is $"+price);
                break;
            case "Thursday":
                coffee = "Classic Drip";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a "+coffee+" and the price is $"+price);
                break;
            case "Friday":
                coffee = "Americano";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a "+coffee+" and the price is $"+price);
                break;

//            default:  // if user inputs anything other than a case specified (including typos or capitalized differently), this is chosen instead
//                System.out.println("Please enter a day of the week excluding weekends.");
        }
    }

}
