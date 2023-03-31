package control_structures;

import java.util.Scanner;

public class Ex205_fiveNumbers {
    // EXERCISE 5
    /*------------------------------------------------
     * Type 5 data: n1, n2, n3, n4, n5.
     * The program should display:
     * If all 5 data are equal it should display the sum of the 5 data.
     * If n1 is equal to n2 and n2 is not equal to n3, it must display: n2 is not equal to n3.
     * If n1 is not equal to n2 and n3 is not equal to n4 you must display the sum of n3 and n4.
     * If n1 is not equal to n2 and n4 is equal to n5, you must visualize the sum of n4 and n5.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int n1, n2, n3, n4, n5;

        System.out.println("Enter num 1");
        n1 = keyboard.nextInt();
        System.out.println("Enter num 2");
        n2 = keyboard.nextInt();
        System.out.println("Enter num 3");
        n3 = keyboard.nextInt();
        System.out.println("Enter num 4");
        n4 = keyboard.nextInt();
        System.out.println("Enter num 5");
        n5 = keyboard.nextInt();

        if ((n1 == n2) && (n1 == n3) && (n1 == n4) && (n1 == n5)
                && (n2 == n3) && (n2 == n4) && (n2 == n5)
                && (n3 == n4) && (n3 == n5) && (n4 == n5)) {
            System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "=" + (n1 + n2 + n3 + n4 + n5));
        } else {
            if (n1 == n2 && n2 != n3) {
                System.out.println(n2 + " is not equal to " + n3);
            } else {
                if (n1 != n2 && n3 == n4) {
                    System.out.println(n3 + "+" + n4 + "=" + (n3 + n4));
                } else {
                    if (n1 != n2 && n4 == n5) {
                        System.out.println(n4 + "+" + n5 + "=" + (n4 + n5));
                    }
                }
            }
        }
    }
}
