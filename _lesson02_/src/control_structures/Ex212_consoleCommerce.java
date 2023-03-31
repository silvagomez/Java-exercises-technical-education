package control_structures;

import java.util.Scanner;

public class Ex212_consoleCommerce {
    // EXERCISE 12
    /*------------------------------------------------
     * From the product gallery, the user will enter the code
     * and the number of units of the product he/she wants to buy.
     * The program will determine the total to be paid, as an invoice.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int shirt = 20, belt = 8, shoes = 25, pant = 30, socks = 5, skirt = 20,
                cap = 15, sweater = 18, necktie = 10, jacket = 35;
        int code, quantity;


        System.out.println("-----CHOOSE WHAT YOU WANT-----");
        System.out.println("     PRODUCT          CODE");
        System.out.println("     shirt...............1");
        System.out.println("     belt................2");
        System.out.println("     shoes...............3");
        System.out.println("     pant................4");
        System.out.println("     socks...............5");
        System.out.println("     skirt...............6");
        System.out.println("     cap.................7");
        System.out.println("     sweater.............8");
        System.out.println("     necktie.............9");
        System.out.println("     jacket.............10");
        System.out.println();
        System.out.println("Enter the code product:");
        code = keyboard.nextInt();

        while (code <= 0 || code > 10) {
            System.out.println("Incorrect input try again...");
            System.out.println("Enter the code product:");
            code = keyboard.nextInt();
        }

        switch (code) {
            case 1:
                System.out.println("The shirt price is: " + shirt);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (shirt * quantity));
                break;
            case 2:
                System.out.println("The belt price is : " + belt);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (belt * quantity));
                break;
            case 3:
                System.out.println("The shoes price is : " + shoes);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (shoes * quantity));
                break;
            case 4:
                System.out.println("The pant price is : " + pant);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (pant * quantity));
                break;
            case 5:
                System.out.println("The socks price is : " + socks);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (socks * quantity));
                break;
            case 6:
                System.out.println("The skirt price is : " + skirt);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (skirt * quantity));
                break;
            case 7:
                System.out.println("The cap price is : " + cap);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (cap * quantity));
                break;
            case 8:
                System.out.println("The sweater price is : " + sweater);
                System.out.println("Enter the quantity you want to buy:");

                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (sweater * quantity));
                break;
            case 9:
                System.out.println("The necktie price is : " + necktie);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (necktie * quantity));
                break;
            case 10:
                System.out.println("The jacket price is : " + jacket);
                System.out.println("Enter the quantity you want to buy:");
                quantity = keyboard.nextInt();
                System.out.println();
                System.out.println("Total to pay: " + (jacket * quantity));
                break;
            default:
                break;
        }
    }
}