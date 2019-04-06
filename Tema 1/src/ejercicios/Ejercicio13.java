package ejercicios;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		// EJERCICIO 13
				
				 int pantalon=30, camiseta=11, cantP, cantC, tP,tC;
				 System.out.println("Ingrese la cantidad de pantalones a comprar");
				 cantP=teclado.nextInt();
				 System.out.println("Ingrese la cantidad de camisetas a comprar");
				 cantC=teclado.nextInt(); tP=pantalon*cantP; tC=camiseta*cantC;
				 System.out.println(tP+"€ y "+tC+"€");
				 

	}

}
