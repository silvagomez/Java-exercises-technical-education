import java.util.Scanner;

public class Ex115_rectangle {
    // EXERCISE 15
    /*------------------------------------------------
     * Find the perimeter and area of the rectangle.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int size1, size2, perimeter, area;

        System.out.println("Enter one size of the rectangle:");
        size1 = keyboard.nextInt();
        System.out.println("Enter the other size:");
        size2 = keyboard.nextInt();
        perimeter = (size1*2) + (size2*2);
        area = size1 * size2;
        System.out.println("The rectangle perimeter is " + perimeter);
        System.out.print("The rectangle area is " + area);
    }
}
