package ejercicios;
import java.util.Scanner;
public class Ejercicio1_16 {

	public static void main(String[] args) {
		
		// EJERCICIO 16
		/*------------------------------------------------
		 * Obtener el resto de varias divisiones.
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
				
		 int divisor, dividendo, resto;
		 System.out.println("Ingrese divisor");
		 divisor=teclado.nextInt();
		 System.out.println("Ingrese el dividendo");
		 dividendo=teclado.nextInt(); 
		 resto=dividendo%divisor;
		 System.out.println("El resto de la división es: "+resto);		 

	}

}
