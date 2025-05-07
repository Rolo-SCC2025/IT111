import java.util.Scanner;

public class MyInput {
    public static void main(String[]args) {

        String name, message;
        int age;
        double salary;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your first name, please.");

        name = myObj.next();

        System.out.println(name+ ", please enter your age.");

        age = myObj.nextInt();

        System.out.println(name+ ", please tell us your annual salary.");

        salary = myObj.nextDouble();

        if(salary < 50000) {
            message = "I know you like [service job] but you know capitalism doesn't place value on taking care of others.";
        } else if (salary >= 50000 && salary < 60000) {
            message = "Not bad, but hard to live in Seattle";
        } else if (salary >= 60000 && salary < 70000) {
            message = "Almost manageable";
        } else if (salary >= 70000 && salary < 80000) {
            message = "Getting better!";
        } else {
            message = "Life is good";
        }

        System.out.println("First Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +salary);
        System.out.println(message);
    }
}
