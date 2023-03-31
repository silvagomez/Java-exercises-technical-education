package control_structures;

public class Ex218_fibonacci {
    // EXERCISE 18
    /*------------------------------------------------
     * Obtain the Fibonacci series: 1,1,2,3,5,8,13,21,
     * Each number is obtained by adding the previous 2.
     *------------------------------------------------*/
    public static void main(String[] args) {

        int num = 1, aux, result = 1;

        System.out.println("FIBONACCI SERIES");
        do {
            System.out.print(result + " ");
            aux = result;
            result = num + result;
            num = aux;
        } while (num <= 100);
    }
}
