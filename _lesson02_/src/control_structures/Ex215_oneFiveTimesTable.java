package control_structures;

public class Ex215_oneFiveTimesTable {
    // EXERCISE 15
    /*------------------------------------------------
     * Display the multiplication tables from 1 to 5 with the following layout:
     *  1*1=1		2*1=2		3*1=3		4*1=4		5*1=5
     *  1*2=2		2*2=4		3*2=6		4*2=8		5*2=10
     *  1*3=3		2*3=6		3*3=9		4*3=12		5*3=15
     *  1*4=4		2*4=8		3*4=12		4*4=16		5*4=20
     *  1*5=5		2*5=10		3*5=15		4*5=20		5*5=25
     *  1*6=6		2*6=12		3*6=18		4*6=24		5*6=30
     *  1*7=7		2*7=14		3*7=21		4*7=28		5*7=35
     *  1*8=8		2*8=16		3*8=24		4*8=32		5*8=40
     *  1*9=9		2*9=18		3*9=27		4*9=36		5*9=45
     *  1*10=10		2*10=20		3*10=30		4*10=40		5*10=50
     *------------------------------------------------*/
    public static void main(String[] args) {

        int num = 1, num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, result1, result2, result3, result4, result5;

        do {
            result1 = num1 * num;
            result2 = num2 * num;
            result3 = num3 * num;
            result4 = num4 * num;
            result5 = num5 * num;

            System.out.print(num1 + "*" + num + "=" + result1 + "\t");
            System.out.print(num2 + "*" + num + "=" + result2 + "\t");
            System.out.print(num3 + "*" + num + "=" + result3 + "\t");
            System.out.print(num4 + "*" + num + "=" + result4 + "\t");
            System.out.println(num5 + "*" + num + "=" + result5);
            num++;
        }
        while (num <= 10);
        System.out.println("-----------------");
        System.out.println("Optimized version");
        System.out.println("-----------------");
        int n1 = 1, n2 = 1;
        while (n2 <= 10) {
            while (n1 <= 5) {
                System.out.print(n1 + "*" + n2 + "=" + (n1 * n2) + "\t" + "\t");
                n1++;
            }
            System.out.println();
            n1 = 1;
            n2++;
        }
    }
}