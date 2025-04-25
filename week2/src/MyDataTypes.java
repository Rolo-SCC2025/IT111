public class MyDataTypes {

    public static void main(String[] args) {

        short number1 = 32_000;
        int number2 = 2_000_000_000;
        long number3 = 3_000_000_000L;
        float number4 = 30.234F;
        double number5 =2942.30485824;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);

        boolean dry = true;

        if(dry == true) {
            System.out.println("Time to hang up those curtains!! Yay!");
        }
        else {
            System.out.println("Wait a few.");
        }

        char best = 'A';
        System.out.println(best);
        System.out.println(++best);

    }
}
