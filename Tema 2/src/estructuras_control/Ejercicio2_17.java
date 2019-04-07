package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 17
		/*------------------------------------------------
		 * Programa que determine si los dos números enteros que ha tecleado el usuario son amigos.
		 * Dos números son amigos si la suma de los divisores (excepto el propio número ) 
		 * de cada uno de ellos es igual al otro número.
		 * Números amigos son: 220 y 284, 17.296 y 18.416
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2, divisor=1, suma1=0, suma2=0;
		
		System.out.println("Ingrese número 1");
		numero1=teclado.nextInt();
		System.out.println("Ingrese número 2");
		numero2=teclado.nextInt();
		
		while(divisor<numero1){
			if(numero1%divisor==0){
					suma1=suma1+divisor;
			}	
			divisor++;
		}
		divisor=1;
		while(divisor<numero2){
			if(numero2%divisor==0){
					suma2=suma2+divisor;
			}	
			divisor++;
		}

		if (suma1==numero2 && suma2==numero1) {
			System.out.print(numero1+" y "+numero2+" son números amigos");
		}
		else {
			System.out.print(numero1+" y "+numero2+" no son números amigos");
		}

	}

}
