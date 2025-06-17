package package_person_input;

public class Person {
    // no main method
    // creating our fields

    String name;
    char gender;
    int age;
    String zipCode;
    int cityCode;
    double creditScore;

    // main and individual violations
    boolean violations;
    boolean violationsDUI;
    boolean violationsRedLight;
    boolean violationsSpeeding;

    double baselineRate = 300;




    public double getRate(double monthlyRate) {

        if (violations == true || creditScore <= 700) {
            monthlyRate = 300;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    public double ageCategory(double adjustedRate) {

        if (age <= 25 || age >= 65) {
            adjustedRate = 300;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public int identifyRegion(int states) {
        // our method for changing states/zipcodes/strings into integers
        String zip2;
        zip2 = zipCode.substring(0, 2); // this will only use the first two characters (numbers in this case; first number is inclusive, second is exclusive) from the zipcode
        cityCode = Integer.parseInt(zip2);

        if (cityCode >= 90 && cityCode <=96) {
            System.out.print("You have entered " + zipCode + " and you reside in California. ");
            states = 0;
        } else if (cityCode == 97) {
            System.out.println("You have entered " + zipCode + " and you reside in Oregon.");
            states = 1;
        } else if (cityCode == 98) {
            System.out.println("You have entered " + zipCode + " and you reside in Washington.");
            states = 2;
        } else {
            System.out.println("You're place of residence is outside our Pacific Northwest region. Please contact our National Office.");
        }
        return states;
    }

    public double californiaRegion(double surcharge) {
        // our method to charge surcharge for California regions

        if (cityCode >= 90 && cityCode <=96) {
            surcharge = 200;
        } else {
            surcharge = 0;
        }
        return surcharge;
    }
    public void display() {
        System.out.println("This is what you have entered:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Zipcode: " + zipCode);
        System.out.println();
        System.out.println("Your baseline rate: $"+baselineRate);
        System.out.println("Your baseline rate is calculated without taking into consideration of the following: Age, Credit Score, Violations, and Place of Residence.");
        System.out.println();
//        System.out.println("Age: ");
        System.out.println("Credit Score: "+creditScore);
//        System.out.println("Place of Residence: ");
        System.out.println("Violations: "+violations);
        System.out.println("DUI violations: "+violationsDUI);
        System.out.println("Red Light violations: "+violationsRedLight);
        System.out.println("Speeding violations: "+violationsSpeeding);

    }

}
