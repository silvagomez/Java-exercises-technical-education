package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 9
		/*------------------------------------------------
		 * Programa que pida al usuario un número entre el 1 y el 10 
		 * y visualice la serie de números a partir de él hasta 10.
		 * Realizar el ejercicio con switch().
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		byte num;
		
		System.out.println("Ingrese un número del 1 al 10");
		num=teclado.nextByte();
		
		switch (num) {
		case 1:
			System.out.println(num+" 2 3 4 5 6 7 8 9 10");
			break;
		case 2:
			System.out.println(num+" 3 4 5 6 7 8 9 10");
			break;
		case 3:
			System.out.println(num+" 4 5 6 7 8 9 10");
			break;
		case 4:
			System.out.println(num+" 5 6 7 8 9 10");
			break;
		case 5:
			System.out.println(num+" 6 7 8 9 10");
			break;
		case 6:
			System.out.println(num+" 7 8 9 10");
			break;
		case 7:
			System.out.println(num+" 8 9 10");
			break;
		case 8:
			System.out.println(num+" 9 10");
			break;
		case 9:
			System.out.println(num+" 10");
			break;
		case 10:
			System.out.println(num);
			break;

		default:
			break;
		}

	}

}
