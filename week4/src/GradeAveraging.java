import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[]args) {

        // ask end user to input their numerical grades
        int counter = 1;
        int grade;
        double total = 0;
        double average;

        Scanner input = new Scanner(System.in);

        // our while loop will count how many times we are asking the end user to input a grade

        while (counter <= 5) {
            System.out.println("Please enter your " + counter + " numerical grade.");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        } // end of while loop
        String message;
        char letterGrade = 0;
//        String highestGrade = "A+";

        counter -= 1;
        average = total / counter;

        System.out.println("Your average grade is " +average+ " after providing us with " +counter+ " grades.");

//        if (average == 100) {
//            highestGrade = "A+";
//            message = "Perfect.";
//            } else
                if (average >= 90 && average <= 100) {
                letterGrade = 'A';
                message = "Excellent work!";
            } else if (average >= 80 && average < 90) {
                letterGrade = 'B';
                message = "Solid with room for improvement.";
            } else if (average >= 70 && average < 80) {
                letterGrade = 'C';
                message = "Passable.";
            } else if (average >= 60 && average < 70) {
                letterGrade = 'D';
                message = "Must study harder";
            } else {
                letterGrade = 'F';
                message = "We need to talk.";
            }

        System.out.println("You have earned the following letter grade " +letterGrade+ ", and here is the message: " +message);

//        if (average == 100) {
//            System.out.println("You have earned the following letter grade " +highestGrade+ ", and here is the message: " +message);
//        } else {
//            System.out.println("You have earned the following letter grade " +letterGrade+ ", and here is the message: " +message);
//        }


        }

    }

