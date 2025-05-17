import java.util.Scanner;

public class testwhileLoop {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        String choice;
        int number;

        while (true) {
            System.out.println("Input one or two");
            choice = input.next();

            switch (choice) {
                case "one":
                    System.out.println("Good choice");
                    break;
                case "two":
                    System.out.println("Another good choice");
                    break;

                default:
                    System.out.println("Choose again");
                    continue;
            }
            break;
        }
            System.out.println("Input a number");
            number = input.nextInt();

        System.out.println("You chose " + choice + " and " + number + " for example code");
    }
}
