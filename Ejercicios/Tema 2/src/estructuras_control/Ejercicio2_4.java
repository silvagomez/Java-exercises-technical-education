package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 4
		/*------------------------------------------------
		 * Programa que le diga al usuario si el año tecleado es o no bisiesto.
		 * Para que un año sea bisiesto tiene que ser múltiplo de 4, 
		 * existe una excepción: si además de ser múltiplo de 4 es también múltiplo de 100 
		 * y no es múltiplo de 400 no es bisiesto.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int año;
		
		System.out.println("Ingrese un año");
		año=teclado.nextInt();
		
		if(año%4==0) {
			System.out.println("Año bisisesto");
		}
		else {
			if(año%4==0 && año%100==0 && año%400==0) {
				System.out.println("Año no es bisiesto");
			}
		}

	}

}
