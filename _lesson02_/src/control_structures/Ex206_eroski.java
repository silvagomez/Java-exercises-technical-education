package control_structures;

import java.util.Scanner;

public class Ex206_eroski {
    // EXERCISE 6
    /*------------------------------------------------
     * In Eroski a 20% discount is given to customers whose purchase exceeds 300.
     * What will be the amount that a person will pay for his purchase?
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float purchase, purchaseFinal;

        System.out.println("Enter the price of your purchase:");
        purchase = keyboard.nextFloat();
        if (purchase >= 300) {
            purchaseFinal = (purchase * 0.80f);
            System.out.print("Total to pay " + purchaseFinal);
        } else {
            purchaseFinal = purchase;
            System.out.print("Total to pay " + purchaseFinal);
        }
    }
}
