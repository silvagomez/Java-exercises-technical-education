package ejercicios;
import java.util.Scanner;
public class Ejercicio1_15 {

	public static void main(String[] args) {
		
		// EJERCICIO 15
		/*------------------------------------------------
		 * Hallar  el per�metro y el �rea del rect�ngulo
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
				
		 int lado1, lado2, perimetro, area;
		 System.out.println("Ingrese el lado de un rect�gulo");
		 lado1=teclado.nextInt();
		 System.out.println("Ingrese el segundo lado del rect�ngulo");
		 lado2=teclado.nextInt(); 
		 perimetro=lado1+lado2+lado1+lado2;
		 area=lado1*lado2;
		 System.out.println("El per�metro del rect�ngulo es " +perimetro+" y el �rea es "+area);		 

	}

}
