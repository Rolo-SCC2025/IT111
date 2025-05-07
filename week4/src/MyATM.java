public class MyATM {
    public static void main(String[]args) {

        int withdrawal, amount;
        withdrawal = 25;
        amount = 200;

        while (amount != 0) { // while amount is NOT zero, money will be withdrawn
            amount -= withdrawal;
//            System.out.println("Your present amount after the withdrawl is $" +amount+ ".");
            if(amount <= 0) {
                System.out.println("You have no money! :(");
            } else {
                System.out.println("Your present amount after the withdrawl is $" +amount+ ".");
            }
        } // end while loop
    }
}
