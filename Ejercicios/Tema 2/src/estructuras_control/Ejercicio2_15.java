package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 15
		/*------------------------------------------------
		 * Visualizar las tablas de multiplicar del 1 al 5 con el siguiente diseño:
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
		
		Scanner teclado = new Scanner(System.in);
		
		int num=1, num1=1, num2=2, num3=3, num4=4, num5=5, resul1, resul2, resul3, resul4, resul5 ;
		
		do {
			resul1=num1*num;
			resul2=num2*num;
			resul3=num3*num;
			resul4=num4*num;
			resul5=num5*num;
			
			System.out.println(num1+"*"+num+"="+resul1+"   "+num2+"*"+num+"="+resul2+"   "+num3+"*"+num+"="+resul3+"   "+num4+"*"+num+"="+resul4+"   "+num5+"*"+num+"="+resul5);
			num++;
			
		}
		while (num<=10);
		
		// Versión optimizada
		
		System.out.println("--------------------------------------");
		
		int n1=1, n2=1;
		while(n2<=10) {
			while(n1<=5) {
				System.out.print(n1+"*"+n2+"=" +(n1*n2)+'\t'+'\t');
				n1++;
			}
			System.out.println();
			n1=1;
			n2++;
		}

	}

}
