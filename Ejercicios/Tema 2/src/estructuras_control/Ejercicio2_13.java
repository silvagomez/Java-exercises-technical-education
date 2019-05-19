package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 13
		/*------------------------------------------------
		 * Programa que visualice los divisores del número dado por el usuario.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int dividendo, resto = 0, divisor=1, cociente;
		
		System.out.println("DIVISORES");
		System.out.println();
		System.out.println("Ingrese el número");
		dividendo=teclado.nextInt();
		
		
		cociente=dividendo/divisor;
				
		while(divisor<=dividendo){
			if(dividendo%divisor==resto){
				System.out.println("Los números divisores de "+dividendo+" son: "+divisor);	
			}
			else {
			}	
			divisor++;
		}

	}

}
