package ejercicios;
import java.util.Scanner;
public class Ejercicio1_11 {

	public static void main(String[] args) {
		
		// EJERCICIO 11
		/*------------------------------------------------
		 * Asignar a una variable un peso en Kg (con decimales) 
		 * visualizar el coste en € de ese peso en oro. 
		 * Teniendo en cuenta que: el precio del oro son 400$  la onza,   
		 * 1kg=32,15 onzas, buscar en Internet la equivalencia del dólar en euros.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		 float onza= 32.15f, peso, euro=0.86f, costeOro=400, pesoOro, valorDolar, precioFinal;
		 System.out.println("Ingrese el peso del oro en kg");
		 peso=teclado.nextFloat();
		 pesoOro=peso*onza;
		 valorDolar=pesoOro*costeOro; 
		 precioFinal=valorDolar*euro;
		 System.out.println("Precio final del oro en Euros es "+precioFinal);

	}

}
