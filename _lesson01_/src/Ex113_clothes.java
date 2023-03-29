import java.util.Scanner;

public class Ex113_clothes {
    // EXERCISE 13
    /*------------------------------------------------
     * How much will I pay for two pants
     * and a T-shirt if each pair of pants costs 30 euros?
     * and the T-shirt costs 11 euros?
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        short pantPrice = 30, tshirtPrice = 11,
        pantQty, tshirtQty, pantTotal, tshirtTotal;

        System.out.println("Enter the pants quatity you want to buy:");
        pantQty = keyboard.nextShort();
        System.out.println("Enter the t-shirt quatity you want to buy:");
        tshirtQty = keyboard.nextShort();
        pantTotal = (short) (pantPrice * pantQty);
        tshirtTotal = (short) (tshirtPrice * tshirtQty);
        System.out.print("Total price >>> pants €" + pantTotal + "\n" + "Total price >>> t-shirt €" + tshirtTotal);
    }
}
