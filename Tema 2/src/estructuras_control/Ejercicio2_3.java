package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 3
		/*------------------------------------------------
		 * Programa que pida al usuario 3 n�meros y visualice el mensaje:
		 * �son iguales� si la suma de dos de ellos es igual al otro n�mero 
		 * y si no se visualizar� �no son iguales�.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("A continuaci�n debe ingresar 3 n�meros");
		System.out.println("Ingrese el primer n�mero");
		n1=teclado.nextInt();
		System.out.println("Ingrese el segundo n�mero");
		n2=teclado.nextInt();
		System.out.println("Ingrese el tercer n�mero");
		n3=teclado.nextInt();
		
		if(n1+n2==n3 || n1+n3==n2 || n2+n3==n1) {
			System.out.println("Son iguales");
			
		}
		else {
			System.out.println("No son iguales");
		}

	}

}
