package ejercicios;
import java.util.Scanner;
public class Ejercicio1_14 {

	public static void main(String[] args) {
		
		// EJERCICIO 14
		/*------------------------------------------------
		 * Hallar el per�metro y el �rea del cuadrado
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
			
		int lado, perimetro, area;
		System.out.println("Ingrese el lado de un cuadro");
		lado=teclado.nextInt(); 
		perimetro=lado*4;
		System.out.println("El per�metro del cuadro es "+perimetro);
		area=lado*2;
 		System.out.println("El �rea del cuadro es "+area);
				 

	}

}
