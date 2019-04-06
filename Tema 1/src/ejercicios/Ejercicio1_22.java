package ejercicios;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		// EJERCICIO 23
				
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
