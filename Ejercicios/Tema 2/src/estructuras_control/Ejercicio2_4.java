package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 4
		/*------------------------------------------------
		 * Programa que le diga al usuario si el a�o tecleado es o no bisiesto.
		 * Para que un a�o sea bisiesto tiene que ser m�ltiplo de 4, 
		 * existe una excepci�n: si adem�s de ser m�ltiplo de 4 es tambi�n m�ltiplo de 100 
		 * y no es m�ltiplo de 400 no es bisiesto.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int a�o;
		
		System.out.println("Ingrese un a�o");
		a�o=teclado.nextInt();
		
		if(a�o%4==0) {
			System.out.println("A�o bisisesto");
		}
		else {
			if(a�o%4==0 && a�o%100==0 && a�o%400==0) {
				System.out.println("A�o no es bisiesto");
			}
		}

	}

}
