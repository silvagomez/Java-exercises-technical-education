import java.util.Scanner;

public class Ex111_weight {
    // EXERCISE 11
    /*------------------------------------------------
     * Assign to a variable a weight in kg (with decimals).
     * visualize the cost of that weight in gold.
     * Taking into account that: the price of gold is $400 per ounce,
     * 1kg=32.15 ounces, search the dollar equivalence in euros.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final float OZ = 32.15f;
        final short GOLD_PRICE = 400;
        float weight, gold_weight, euro = 0.86f, dollar, finalPrice;

        System.out.println("Enter the weight of gold in kg");
        weight = keyboard.nextFloat();
        gold_weight = weight * OZ;
        dollar = gold_weight * GOLD_PRICE;
        finalPrice = dollar * euro;
        System.out.print("Final gold price in € is " + finalPrice);
    }
}
