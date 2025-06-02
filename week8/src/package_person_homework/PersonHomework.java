package package_person_homework;

import java.time.Year;

public class PersonHomework {
    // this file does not have a main method
    // we start with fields (variables)

    int year = (int) Year.now().getValue();

    String name;
    char gender;
    int age;
    String carMakeModel;
    int carYear;
    boolean violations;
    int creditScore;

    int monthlyRate;
    int adjustedRateViolations;
    int adjustedRateGender;
    int adjustedRateAge;
    int adjustedRateCredit;
    int adjustedRateCarAge;

    public void display() {

        System.out.println("Customer: "+name+", "+age+", "+gender);
//        System.out.println(age);
//        System.out.println(gender);
        System.out.println("Customer vehicle: "+carYear +" "+ carMakeModel);
        System.out.println("Violations: "+violations);
        System.out.println("Credit score: "+creditScore);
        System.out.println();
        System.out.println("Preliminary Rate: $"+getRate(monthlyRate));
        System.out.println("Adjustments: age $"+ageFactor(adjustedRateAge));
        System.out.println("             gender $"+assumeGender(adjustedRateGender));
        System.out.println("             age of vehicle $"+carAge(adjustedRateCarAge));
        System.out.println("             credit rating $"+creditFactor(adjustedRateCredit));
        System.out.println("Total Adjustments: $"+(ageFactor(adjustedRateAge)+assumeGender(adjustedRateGender)+carAge(adjustedRateCarAge)+creditFactor(adjustedRateCredit)));
        System.out.println("Total Monthly Premium for "+name+": $"+(getRate(monthlyRate)+(ageFactor(adjustedRateAge)+assumeGender(adjustedRateGender)+carAge(adjustedRateCarAge)+creditFactor(adjustedRateCredit))));
        System.out.println();
    }

    public int ageFactor(int adjustedRateAge) {
        if(age <= 25 || age >=65) {
            adjustedRateAge = 100;
        }
        return adjustedRateAge;
    }

    public int assumeGender(int adjustedRateGender) {
        if(gender == 'M') {
            adjustedRateGender = 100;
        }
        return adjustedRateGender;
    }

    public int carAge(int adjustedRateCarAge) {
        adjustedRateCarAge = 100 + ((year - carYear) * (year - carYear) * -5);
        if(adjustedRateCarAge <= -200) {
            adjustedRateCarAge = -200;
        }
        return adjustedRateCarAge;
    }

    public int getRate(int monthlyRate) {
        if(violations == true) {
            monthlyRate = 500;
        } else {
            monthlyRate = 100;
        }
        return monthlyRate;
    }

    public int creditFactor(int adjustedRateCredit) {

        if(creditScore <=650) {
            adjustedRateCredit = 100;
        } else if(creditScore >= 651 && creditScore <= 720) {
            adjustedRateCredit = 0;
        } else if(creditScore > 720){
            adjustedRateCredit -= 50;
        }
        return adjustedRateCredit;

    }
}
