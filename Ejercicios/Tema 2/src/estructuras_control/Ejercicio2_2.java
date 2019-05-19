package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 2
		/*------------------------------------------------
		 * Teclear 3 cantidades. 
		 * Si la primera es mayor que la segunda. 
		 * Visualizar el resultado de la suma de la primera cantidad con la segunda cantidad.
		 * Si la primera es menor o igual que la segunda. 
		 * Visualizar el resultado de restar dichas cantidades.
		 * Su producto si la segunda es mayor que la tercera.
		 * Su cociente si la segunda es menor o igual que la tercera.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		float n1, n2, n3;
		
		System.out.println("A continuación debe ingresar 3 números");
		System.out.println("Ingrese el primer número");
		n1=teclado.nextFloat();
		System.out.println("Ingrese el segundo número");
		n2=teclado.nextFloat();
		System.out.println("Ingrese el tercer número");
		n3=teclado.nextFloat();
		
		if(n1>n2) {
			System.out.println(n1+"+"+n2+"="+(n1+n2));
		}
		else {
			if(n1<=n2) {
				System.out.println(n1+"-"+n2+"="+(n1-n2));
			}
			else {
				
			}
		}
		
		if(n2>n3) {
			System.out.println(n2+"*"+n3+"="+(n2*n3));
		}
		else {
			if(n2<=n3) {
				System.out.println(n2+"/"+n3+"="+(n2/n3));
			}
			else {
				
			}
		}

	}

}
