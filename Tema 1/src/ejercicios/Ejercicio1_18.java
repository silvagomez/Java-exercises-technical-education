package ejercicios;
import java.util.Scanner;
public class Ejercicio1_18 {

	public static void main(String[] args) {
		
		// EJERCICIO 18
		/*------------------------------------------------
		 * Decrementar  valores a una variable utilizando operadores unitarios
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
				
		 int numero;
		 System.out.println("Ingrese un número");
		 numero=teclado.nextInt();
		 System.out.println(numero--);
		 System.out.println(numero);
		 System.out.println(--numero);		 

	}

}
