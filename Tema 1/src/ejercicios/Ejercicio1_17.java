package ejercicios;
import java.util.Scanner;
public class Ejercicio1_17 {

	public static void main(String[] args) {
		
		// EJERCICIO 17
		/*------------------------------------------------
		 * Incrementar  valores a una variable utilizando operadores unitarios
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
				
		 int numero;
		 System.out.println("Ingrese un número");
		 numero=teclado.nextInt();
		 System.out.println(numero++);
		 System.out.println(numero);
		 System.out.println(++numero);		 

	}

}
