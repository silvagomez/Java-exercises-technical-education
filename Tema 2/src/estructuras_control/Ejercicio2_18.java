package estructuras_control;
public class Ejercicio2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 18
		/*------------------------------------------------
		 * Obtener la serie de Fibonacci:1,1,2,3,5,8,13,21,…
		 * Cada número se obtiene sumando los 2 anteriores.
		 *------------------------------------------------*/
		
		int numero=1, aux, resultado=1;
		
		System.out.println("SERIE DE FIBONACHI");
		System.out.print(numero+" ");
		while (numero<100) {
			aux=resultado;
			resultado=numero+resultado;
			numero=aux;
			System.out.print(resultado+" ");
		}

	}

}
