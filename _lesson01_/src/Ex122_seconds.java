import java.util.Scanner;

public class Ex122_seconds {
    // EXERCISE 22
    /*------------------------------------------------
     * Program that converts an integer number of seconds
     * into hours, minutes and seconds.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number;
        double second = 1, secondM = 0.0166f, secondH = 0.000277f;

        System.out.println("Enter seconds:");
        number = keyboard.nextInt();
        second = second * number;
        System.out.println("Seconds: " + second);
        secondM = secondM * number;
        System.out.println("Seconds in minutes: " + secondM);
        secondH = secondH * number;
        System.out.println("Seconds in hours: " + secondH);
    }
}
