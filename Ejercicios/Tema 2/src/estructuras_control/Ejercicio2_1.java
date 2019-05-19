package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1
		/*------------------------------------------------
		 * Teclear un número, 
		 * queremos que el programa visualice: 
		 * nulo, negativo o positivo, según el número tecleado.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese un número");
		numero=teclado.nextInt();
		
		if(numero==0) {
			System.out.println(numero + " es nulo");
		}
		else {
			if(numero>0) {
				System.out.println(numero + " es positivo");
			}
			else {
				System.out.println(numero + " es negativo");
			}
		}

	}

}
