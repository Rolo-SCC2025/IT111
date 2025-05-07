public class MyOperators2 {

    public static void main(String[]args) {

//        boolean tuna = true;
//        boolean bread = false;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }


        boolean tuna = false;
        boolean bread = true;
        if(tuna == true || bread == true) {
            System.out.println("We are having some food products.");
        } else {
            System.out.println("We will not be eating today");
        }


        // age - drinking age

        int age = 21;
        if(age >= 31) {
            System.out.println("Yay, booze!");
        } else {
            System.out.println("Please garçon, mocktail me. Gracias!");
        }


        // rollercoaster rider height - smaller than 4 feet

        float height = 4f;
        if(height > 4) {
            System.out.println("You are not allowed on this ride.");
        } else {
            System.out.println("Keep arms and legs inside the vehicle at all times!");
        }


    }
}
