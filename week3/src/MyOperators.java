public class MyOperators {
    public static void main(String[] args) {

        // Arithmetic operators
        // employee, wage, hours worked, overtime, the whole gelato

//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOvertime;

//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours * wage;
//        overtimePay = overtimeHours * (wage * 1.5);
//        total = regularPay + overtimePay;
//        hourlyWithOvertime = total / (regHours + overtimeHours);

//        System.out.println("Regular pay: $" +regularPay+ " dollars");
//        System.out.println("Overtime pay: $" +overtimePay+ " dollars");
//        System.out.println("Total pay: $" +total+ " dollars");
          // System.out.println("Hourly rate with OT: $" +hourlyWithOvertime+ " dollars per hour");
//        System.out.print("Hourly rate with OT: ");
//        System.out.printf("$%.2f", hourlyWithOvertime);


    // modulus operator

        int number1, number2, number3;
        number1 = 25;
        number2 = 7;
        number3 = number1 % number2;

        // System.out.println(number3);

            if(number3 == 0) {  // do something
                System.out.println(number1 + " is an even number.");
            }
            else {  // do something else
                System.out.println(number1 + " is an odd number.");
            }
        // shopping time
//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .1;
//        priceOfItem = 100;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem + taxOnItem;
//
//        System.out.println("Price of item $" +priceOfItem+ " dollars.");
//        System.out.println("Tax on item $" +taxOnItem+ " dollars.");
//        System.out.println("Price including tax $" +totalPrice+ " dollars.");

//    double priceOfItem = 100;
        double priceOfItem = 100;
            priceOfItem *= 1.10;

        System.out.println("Total price of item is " +priceOfItem+ " dollars.");
        System.out.print("Total price of item is: ");
        System.out.printf("$%.2f", priceOfItem);
        System.out.print(" dollars.");

    }
}
