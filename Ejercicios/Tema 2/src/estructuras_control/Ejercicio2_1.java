package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1
		/*------------------------------------------------
		 * Teclear un n�mero, 
		 * queremos que el programa visualice: 
		 * nulo, negativo o positivo, seg�n el n�mero tecleado.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingrese un n�mero");
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
