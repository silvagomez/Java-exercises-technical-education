package ejercicios;
import java.util.Scanner;
public class Ejercicio1_14 {

	public static void main(String[] args) {
		
		// EJERCICIO 14
		/*------------------------------------------------
		 * Hallar el perímetro y el área del cuadrado
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
			
		int lado, perimetro, area;
		System.out.println("Ingrese el lado de un cuadro");
		lado=teclado.nextInt(); 
		perimetro=lado*4;
		System.out.println("El perímetro del cuadro es "+perimetro);
		area=lado*2;
 		System.out.println("El área del cuadro es "+area);
				 

	}

}
