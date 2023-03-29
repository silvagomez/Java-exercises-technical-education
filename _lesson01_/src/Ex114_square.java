import java.util.Scanner;

public class Ex114_square {
    // EXERCISE 14
    /*------------------------------------------------
     * Find the perimeter and area of the square.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int size, perimeter, area;

        System.out.println("Enter the square size:");
        size = keyboard.nextInt();
        perimeter = size * 4;
        area = size * 2;
        System.out.println("The square perimeter is " + perimeter);
        System.out.print("The square are is " + area);
    }
}
