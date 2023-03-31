package control_structures;

import java.util.Scanner;

public class Ex210_gradeSGS {
    // EXERCISE 10
    /*------------------------------------------------
     * The program first displays a table of grades with their equivalents in the Standard Grading System ,
     * the system used in the United States that goes from A through F.
     * The program will ask the user for his grade
     * The program will ask the user for his grade and transform that result to the Standard Grading System equivalent.
     * The program will also give a small but valuable recommendation to the user regarding his level of study and his
     * regarding his or her level of study and quality as a student.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float grade;
        char next;
        boolean anotherGrade = true;

        System.out.println("          GRADES          EQUIVALENTS");
        System.out.println("        9.0 - 10.0             A     ");
        System.out.println("        8.5 - 8.9              B+    ");
        System.out.println("        8.0 - 8.4              B     ");
        System.out.println("        7.5 - 7.9              C+    ");
        System.out.println("        7.0 - 7.4              C     ");
        System.out.println("        6.0 - 6.9              D     ");
        System.out.println("        0.0 - 5.9              F     ");

        System.out.println("Enter your grade:");
        grade = keyboard.nextFloat();
        while (anotherGrade) {
            if (grade > 9.0f) {
                System.out.println("Grade equivalent in Standard Grading System A");
                System.out.println("You are on fire");
            } else if (grade > 8.5f) {
                System.out.println("Grade equivalent in Standard Grading System B+");
                System.out.println("Your level is awesome");
            } else if (grade > 8f) {
                System.out.println("Grade equivalent in Standard Grading System B");
                System.out.println("Your level is good");
            } else if (grade > 7.5f) {
                System.out.println("Grade equivalent in Standard Grading System C+");
                System.out.println("Your level is normal");
            } else if (grade > 7f) {
                System.out.println("Grade equivalent in Standard Grading System C");
                System.out.println("Your level is regular");
            } else if (grade > 6f) {
                System.out.println("Grade equivalent in Standard Grading System D");
                System.out.println("Your level is low");
            } else if (grade > 0) {
                System.out.println("Grade equivalent in Standard Grading System F");
                System.out.println("... see you next year again");
            }
            System.out.println("Do you have another grade? (y/n):");
            next = keyboard.next().charAt(0);
            if (next == 'n') {
                anotherGrade = false;
            } else {
                System.out.println("Enter your grade:");
                grade = keyboard.nextFloat();
            }
        }
    }
}
