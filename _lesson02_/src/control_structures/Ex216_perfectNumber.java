package control_structures;

public class Ex216_perfectNumber {
    // EXERCISE 16
    /*------------------------------------------------
     * Program that visualizes perfect numbers less than 100.
     * A number is perfect when the sum of its divisors except itself
     * is equal to the number itself.
     *------------------------------------------------*/
    public static void main(String[] args) {

        int dividend = 1, divisor, perfect, sum;

        System.out.println("PERFECT NUMBERS");
        while (dividend <= 100) {
            sum = 0;
            divisor = 1;
            while (divisor < dividend) {
                if (dividend % divisor == 0) {
                    sum = sum + divisor;
                }
                divisor++;
            }
            perfect = sum;
            if (sum == dividend) {
                System.out.print(perfect + " ");
            }
            dividend++;
        }
    }
}