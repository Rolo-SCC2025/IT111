import java.util.Scanner;

public class TryCatchIntegers {

    public static void main(String[]args) {

        // ask end user to enter number
        System.out.println("Enter a number.");

        try {
            int i;
            Scanner input = new Scanner(System.in);
            i = input.nextInt();

            System.out.println("Your integer is: "+i);

        } catch(Exception e) {
            System.out.println("Error: "+e);
        }


    }
}
