import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

        // String car = "Volvo";

            String[] cars = new String[4];
            // many computer programs start counting with zero

            cars[0] = "Volvo";
            cars[1] = "Ford";
            cars[2] = "Toyota";
            cars[3] = "Honda";

            System.out.println(cars[0].toUpperCase());
            System.out.println(Arrays.toString(cars));

            //String[] books = {"Before The Coffee Gets Cold", "Station Eleven", "Yellowface", "The Dance of Anger", "House of Leaves"}
            String[] books = new String[5];

            books[0] = "Before the Coffee Gets Cold";
            books[1] = "Station Eleven";
            books[2] = "Yellowface";
            books[3] = "The Dance of Anger";
            books[4] = "House of Leaves";

            System.out.println(Arrays.toString(books));

        // building a "for each" loop
            for(String book : books) {
                System.out.println(book);
            }

            int [] numbers = new int[3];
            numbers[0] = 20;
            numbers[1] = 30;
            numbers[2] = 50;

            System.out.println(Arrays.toString(numbers));

            for(int number : numbers) {
                System.out.println(number);
            }


            String[] wines = new String[5];
            wines[0] = "Cabernet";
            wines[1] = "Merlot";
            wines[2] = "Syrah";
            wines[3] = "Malbec";
            wines[4] = "Sparkling";

            for(String wine : wines) {
                System.out.println(wine);
                System.out.println(wine.length());
            }

            for(String wine : wines) {
                if(wine.equals("Syrah")) {
                    break;
                    }
                System.out.println(wine);

            }

    }
}
