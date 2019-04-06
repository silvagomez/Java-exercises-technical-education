package ejercicios;
import java.util.Scanner;
public class Ejercicio1_15 {

	public static void main(String[] args) {
		
		// EJERCICIO 15
		/*------------------------------------------------
		 * Hallar  el perímetro y el área del rectángulo
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
				
		 int lado1, lado2, perimetro, area;
		 System.out.println("Ingrese el lado de un rectágulo");
		 lado1=teclado.nextInt();
		 System.out.println("Ingrese el segundo lado del rectángulo");
		 lado2=teclado.nextInt(); 
		 perimetro=lado1+lado2+lado1+lado2;
		 area=lado1*lado2;
		 System.out.println("El perímetro del rectángulo es " +perimetro+" y el área es "+area);		 

	}

}
