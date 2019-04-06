package estructuras_control;
public class Ejercicio2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 16
		/*------------------------------------------------
		 * Programa que visualice los números perfectos menores de 100.
		 * Un número es perfecto cuando la suma de sus divisores excepto él mismo 
		 * es igual al propio número.
		 *------------------------------------------------*/
		
		int dividendo=1, divisor, perfecto, suma;
		
		System.out.println("NÚMEROS PERFECTOS");
		System.out.println();
		
		while(dividendo<=100) {
			suma=0;
			divisor=1;
			while(divisor<dividendo){
				if(dividendo%divisor==0){
						suma=suma+divisor;
				}	
				divisor++;
			}
			perfecto=suma;
			if (suma==dividendo) {
				System.out.print(perfecto + " ");
			}
			dividendo++;
		}

	}

}
