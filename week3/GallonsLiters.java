public class GallonsLiters {

    public static void main(String[]args) {

        // one gallon = 3.78541 liters
        // gal = (lit / 3.78541f)
        System.out.println("Starting conversions:");
        float gal, lit;
        for(gal = 1; gal <= 4; gal = gal +1) { //
            lit = (gal * 3.78541f);
            boolean amountGallon = (gal == 1); // if the amount of gallons is one, use the sout without the plural
            if(amountGallon == true) {
                System.out.printf("%.2f", lit);
                System.out.print(" liters is equal to ");
                System.out.printf("%.0f", gal);
                System.out.print(" gallon.\n");
            } else {
                 System.out.printf("%.2f", lit);
                 System.out.print(" liters is equal to ");
                 System.out.printf("%.0f", gal);
                 System.out.print(" gallons.\n");
            }
        } // end for loop
        System.out.println();
        for(gal = 0; gal <= 100; gal = gal +5) { //
            lit = (gal * 3.78541f);
            boolean amountGallon = (gal == 0); // if the amount of gallons is zero, do nothing
            boolean amountLiter = !((gal % 25) > 0); // if the amount of gallons has a remainer after being divided by 25, then print the next block of sout with the added line break
            if(amountGallon == true) {

            } else {
                if (amountLiter == false) {
                    System.out.printf("%.2f", lit);
                    System.out.print(" liters is equal to ");
                    System.out.printf("%.0f", gal);
                    System.out.print(" gallons.\n");
                } else {
                    System.out.printf("%.2f", lit);
                    System.out.print(" liters is equal to ");
                    System.out.printf("%.0f", gal);
                    System.out.print(" gallons.");
                    System.out.println("\n");
                }
            }
        } // end for loop
        System.out.println("All done!");
    }
}
