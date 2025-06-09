package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[]args) {

        Person customer;
        customer = new Person();
        int states = 0;
        double monthlyRate = 0;
        double surcharge = 0;
        double adjustedRate = 0;

        // more variables will be initialized here

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        customer.name = input.next();
        System.out.println("Please enter your age.");
        customer.age = input.nextInt();
        System.out.println("Please enter your gender by entering F, M, or N.");
        customer.gender = input.next().charAt(0);
        System.out.println("Please enter your zipcode (only first five digits).");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, or false for no.");
        customer.violations = input.nextBoolean();
        if (customer.violations) {
            System.out.println("Please enter true if you have had a DUI, or false if you have not.");
            customer.violationsDUI = input.nextBoolean();

            System.out.println("Please enter true if you have had a red light violation, or false if you have not.");
            customer.violationsRedLight = input.nextBoolean();

            System.out.println("Please enter true if you have had a speeding violation, or false if you have not.");
            customer.violationsSpeeding = input.nextBoolean();
        }

        System.out.println("Please enter your credit score");
        customer.creditScore = input.nextDouble();
        customer.display();
        System.out.println();
        if (customer.identifyRegion(states) == 0) {
            System.out.println("Residents of California are subject to a surcharge of $" + customer.californiaRegion(surcharge) + " per California law.");
        }

        System.out.println("Age Category: $" + customer.ageCategory(adjustedRate));
        System.out.println("Violations or credit score adjustment: $" + customer.getRate(customer.getRate(monthlyRate)));
        System.out.println();
        System.out.print("You're total monthly premium: $");
        System.out.print(customer.baselineRate
                + customer.ageCategory(adjustedRate)
                + customer.californiaRegion(surcharge)
                + customer.getRate(monthlyRate) );
        System.out.println(".");


    }

}
