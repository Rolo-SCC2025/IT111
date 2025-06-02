package package_person;

public class PersonDetails {
    // this file has a main method

    public static void main(String[]args) {

    Person firstPerson;
    Person secondPerson;
    Person thirdPerson;
    // WIP object from Person class

    firstPerson = new Person();
    secondPerson = new Person();
    thirdPerson = new Person();

    // assigning values to person fields

    firstPerson.name = "Susie";
    firstPerson.gender = 'F';
    firstPerson.age = 35;
    firstPerson.car = "Kia Niro";
    firstPerson.violations = false;
    firstPerson.creditScore = 700;

    secondPerson.name = "Jared";
    secondPerson.gender = 'M';
    secondPerson.age = 24;
    secondPerson.car = "Dodge Charger";
    secondPerson.violations = true;
    secondPerson.creditScore = 650;

    thirdPerson.name = "Joni";
    thirdPerson.gender = 'F';
    thirdPerson.age = 65;
    thirdPerson.car = "Honda HRV";
    thirdPerson.violations = false;
    thirdPerson.creditScore = 730;


        firstPerson.display();
        System.out.println();
        secondPerson.display();
        System.out.println();
        thirdPerson.display();

    }
}
