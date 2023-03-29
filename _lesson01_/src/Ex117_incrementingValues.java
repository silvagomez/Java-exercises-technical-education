import java.util.Scanner;

public class Ex117_incrementingValues {
    // EXERCISE 17
    /*------------------------------------------------
     * Incrementing values to a variable using unit operators
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = keyboard.nextInt();
        System.out.println(number++);
        System.out.println(number);
        System.out.print(++number);
    }
}
