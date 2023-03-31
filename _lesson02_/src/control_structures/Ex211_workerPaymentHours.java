package control_structures;

import java.util.Scanner;

public class Ex211_workerPaymentHours {
    // EXERCISE 11
    /*------------------------------------------------
     * This program shows the payments that a worker will receive
     * for each working hour based on the time of day he/she works.
     * The user must enter the number of hours worked in each of the schedules
     * and the program will determine the total amount of money to be received by the worker.
     * and it will also tell if he/she earned more money for overtime than for office hours worked
     * or vice versa, or if the worker earned exactly the same for overtime as for office hours.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float hour1, hour2, hour3, hour4, salaryBase, salaryFinal, salaryOf, salaryExtra;

        System.out.println("         SCHEDULE               PAYMENT");
        System.out.println("     8:00 am - 4:00 pm        BASE PAYMENT");
        System.out.println("     4:00 pm - 8:00 pm        25% EXTRA");
        System.out.println("     8:00 pm - 12:00 am       50% EXTRA");
        System.out.println("     12:00 am - 8:00 am       DOUBLE PAYMENT");

        System.out.println("Enter the value of your worked hour:");
        salaryBase = keyboard.nextFloat();
        while (salaryBase <= 0) {
            System.out.println("Incorrect input try again...");
            System.out.println("Enter the value of your worked hour:");
            salaryBase = keyboard.nextFloat();
        }
        System.out.println("Enter below the hours worked in the respective schedules");
        System.out.println("Hours worked from 8:00 am - 4:00 pm:");
        hour1 = keyboard.nextFloat();
        while (hour1 < 0 || hour1 > 8) {
            System.out.println("Incorrect input try again...");
            System.out.println("Hours worked from 8:00 am - 4:00 pm:");
            hour1 = keyboard.nextFloat();
        }
        System.out.println("Hours worked from 4:00 pm - 8:00 pm:");
        hour2 = keyboard.nextFloat();
        while (hour2 < 0 || hour2 > 4) {
            System.out.println("Incorrect input try again...");
            System.out.println("Hours worked from 4:00 pm - 8:00 pm:");
            hour2 = keyboard.nextFloat();
        }
        System.out.println("Hours worked from 8:00 pm - 12:00 am:");
        hour3 = keyboard.nextFloat();
        while (hour3 < 0 || hour3 > 4) {
            System.out.println("Incorrect input try again...");
            System.out.println("Hours worked from 8:00 pm - 12:00 am:");
            hour3 = keyboard.nextFloat();
        }
        System.out.println("Hours worked from 12:00 am - 8:00 am:");
        hour4 = keyboard.nextFloat();
        while (hour4 < 0 || hour4 > 8) {
            System.out.println("Incorrect input try again...");
            System.out.println("Hours worked from 12:00 am - 8:00 am:");
            hour4 = keyboard.nextFloat();
        }

        salaryFinal = ((hour1 * salaryBase) + (hour2 * salaryBase * 1.25f)
                + (hour3 * salaryBase * 1.50f) + (hour4 * salaryBase * 2));
        System.out.println("Your total salary will be: " + salaryFinal);
        salaryOf = (hour1 * salaryBase);
        System.out.println("Total payment for hours worked in normal schedule is: " + salaryOf);
        salaryExtra = ((hour2 * salaryBase * 1.25f) + (hour3 * salaryBase * 1.50f) + (hour4 * salaryBase * 2));
        System.out.println("Total payment for extra hours worked is: " + salaryExtra);
        if (salaryOf > salaryExtra) {
            System.out.println("You earn more working in normal schedule");
        } else if (salaryOf == salaryExtra) {
            System.out.println("You earn the same in normal schedule and overtime");
        } else {
            System.out.println("You earn more working overtime");
        }
    }
}