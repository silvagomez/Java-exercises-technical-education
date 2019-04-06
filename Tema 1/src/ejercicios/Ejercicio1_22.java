package ejercicios;
import java.util.Scanner;
public class Ejercicio1_22 {

	public static void main(String[] args) {
		
		// EJERCICIO 22
		/*------------------------------------------------
		 * Programa que convierta una cantidad entera
		 * de segundos en horas, minutos y segundos.
		 *------------------------------------------------*/
		Scanner teclado = new Scanner(System.in);
				
		 int n; double segundo=1, segundoM=0.0166f, segundoH=0.000277f;
		 
		 System.out.println("Ingrese unos segundos");
		 n=teclado.nextInt();
		 
		 segundo=segundo*n; 
		 System.out.println("Segundos: "+segundo);
		 
		 segundoM=segundoM*n; 
		 System.out.println("Segundos en minutos: "+segundoM);
		 
		 segundoH=segundoH*n; 
		 System.out.println("Segundo en horas: "+segundoH);
				 

	}

}
