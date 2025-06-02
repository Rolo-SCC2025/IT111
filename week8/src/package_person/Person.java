package package_person;

public class Person {
    // this file does not have a main method
    // we start with fields (variables)

    String name;
    char gender;
    int age;
    String car;
    boolean violations;
    int creditScore;

    double monthlyRate;
    double adjustedRate;

    public void display() {

        System.out.println("Customer: "+name+", "+age+", "+gender);
//        System.out.println(age);
//        System.out.println(gender);
        System.out.println("Customer vehicle: "+car);
        System.out.println("Violations: "+violations);
        System.out.println("Credit score: "+creditScore);
        System.out.println("Preliminary Rate: $"+getRate(monthlyRate));
        System.out.println("Adjustments: $"+assumeGender(adjustedRate));
        System.out.println("Total Monthly Premium for "+name+": $"+(getRate(monthlyRate)+assumeGender(adjustedRate)));
    }

    public double getRate(double monthlyRate) {

        if(violations == true && creditScore <= 700) {
            monthlyRate = 500;
        } else {
            monthlyRate = 100;
        }

        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {

        if(gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }

        return adjustedRate;

    }
}
