import java.util.Scanner;

public class MyEnum {

enum WhoWins {HOME, VISTOR, NEITHER}

    public static void main(String[]args){
//declaring a variable
        WhoWins who;

        int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

        // if the seahawks score is greater than the broncos -
        if(seahawks > broncos) {
            who = WhoWins.HOME; // WhoWins.HOME is an object of the WhoWins type
            System.out.println(who+ " team won!");
            System.out.print("Seahawks win by ");
            System.out.println(seahawks - broncos+ " points!");
        } else if(broncos > seahawks) {
            who = WhoWins.VISTOR;
            System.out.println(who+ " team won!");
            System.out.println("Broncos win!");
            System.out.println(broncos - seahawks+ " points!");
        } else {
            who = WhoWins.NEITHER;
            System.out.println(who+ " team won.");
            System.out.println("It's a tie!");
        }



    }
}
