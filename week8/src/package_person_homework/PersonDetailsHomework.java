package package_person_homework;

public class PersonDetailsHomework {
    // this file has a main method

    public static void main(String[]args) {

    PersonHomework firstPerson;
    PersonHomework secondPerson;
    PersonHomework thirdPerson;
    // WIP object from Person class

    firstPerson = new PersonHomework();
    secondPerson = new PersonHomework();
    thirdPerson = new PersonHomework();

    // assigning values to person fields

    firstPerson.name = "Susie";
    firstPerson.gender = 'F';
    firstPerson.age = 35;
    firstPerson.carMakeModel = "Kia Niro";
    firstPerson.carYear = 2022;
    firstPerson.violations = false;
    firstPerson.creditScore = 700;

    secondPerson.name = "Jared";
    secondPerson.gender = 'M';
    secondPerson.age = 24;
    secondPerson.carMakeModel = "Dodge Charger";
    secondPerson.carYear = 2025;
    secondPerson.violations = true;
    secondPerson.creditScore = 650;

    thirdPerson.name = "Joni";
    thirdPerson.gender = 'F';
    thirdPerson.age = 65;
    thirdPerson.carMakeModel = "Honda CR-V";
    thirdPerson.carYear = 2014;
    thirdPerson.violations = true;
    thirdPerson.creditScore = 730;

        firstPerson.display();
        System.out.println();
        secondPerson.display();
        System.out.println();
        thirdPerson.display();

    }
}
