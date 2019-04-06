package ejercicios;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// EJERCICIO 11
		
		 float onza= 32.15f, p, euro=0.86f, costeOroD=400, pesoOro, valorD, precioF ;
		 System.out.println("Ingrese el peso del oro en kg");
		 p=teclado.nextFloat();
		 pesoOro=p*onza;
		 valorD=pesoOro*costeOroD; 
		 precioF=valorD*euro;
		 System.out.println("Precio final en Euros es "+precioF);

	}

}
