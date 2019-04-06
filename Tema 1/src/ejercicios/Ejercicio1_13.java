package ejercicios;
import java.util.Scanner;
public class Ejercicio1_13 {

	public static void main(String[] args) {
		
		// EJERCICIO 13
		/*------------------------------------------------
		 * ¿Cuánto pagaré por dos pantalones 
		 * y una camiseta si cada pantalón cuesta 30 euros 
		 * y la camiseta 11 euros?
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
				
		int pantalon=30, camiseta=11,
		cantPantalon, cantCamisa, totalPantalon, totalCamisa;
		System.out.println("Ingrese la cantidad de pantalones a comprar");
		cantPantalon=teclado.nextInt();
		System.out.println("Ingrese la cantidad de camisetas a comprar");
		cantCamisa=teclado.nextInt();
		totalPantalon=pantalon*cantPantalon;
		totalCamisa=camiseta*cantCamisa;
		System.out.println(totalPantalon+"€ y "+totalCamisa+"€");
				 

	}

}
