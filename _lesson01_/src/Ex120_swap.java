public class Ex120_swap {
    // EXERCISE 20
    /*------------------------------------------------
     * Using local variables,
     * make a program that exchanges the values between 2 variables.
     * Show the initial values and the values once exchanged.
     *------------------------------------------------*/
    public static void main(String[] args) {

        int num1 = 24, num2 = 92, swap;

        System.out.println("Value num1=" + num1);
        System.out.println("Value num2=" + num2);
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("New value num1=" + num1);
        System.out.print("New value num2=" + num2);
    }
}
