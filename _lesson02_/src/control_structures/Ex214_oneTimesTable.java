package control_structures;

public class Ex214_oneTimesTable {
    // EXERCISE 14
    /*------------------------------------------------
     * Display the table of 1.
     *------------------------------------------------*/
    public static void main(String[] args) {

        int num = 0, result;
        System.out.println("1 TIMES TABLE");
        do {
            result = (1 * num);
            System.out.println("1x" + num + "=" + result);
            num++;
        }
        while (num <= 10);
    }
}
