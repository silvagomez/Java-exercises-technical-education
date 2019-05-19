package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 5
		/*------------------------------------------------
		 * Teclear 5 datos: n1, n2, n3, n4, n5. 
		 * El programa debe visualizar:
		 * Si los 5 datos son iguales debe visualizar la suma de los 5 datos.
		 * Si n1 es igual a n2 y n2es distinto a n3 debe visualizar: n2 no es igual a n3.
		 * Si n1 es distinto de n2 y n3 es igual a n4 debe visualizar la suma de n3 y n4.
		 * Si n1 es distinto de n2 y n4 es igual a n5 debe visualizar la suma de n4 y n5.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3,n4,n5;
		
		System.out.println("A continuación ingresará 5 datos");
		System.out.println("Ingrese dato 1");
		n1=teclado.nextInt();
		System.out.println("Ingrese dato 2");
		n2=teclado.nextInt();
		System.out.println("Ingrese dato 3");
		n3=teclado.nextInt();
		System.out.println("Ingrese dato 4");
		n4=teclado.nextInt();
		System.out.println("Ingrese dato 5");
		n5=teclado.nextInt();
		
		if(n1==n2 && n1==n3 && n1==n4 && n1==n5 
		&& n2==n3 && n2==n4 && n2==n5 
		&& n3==n4 && n3==n5 && n4==n5) {
			System.out.println(n1+"+"+n2+"+"+n3+"+"+n4+"+"+n5+"="+(n1+n2+n3+n4+n5));
		}
		else {
			if(n1==n2 && n2!=n3) {
				System.out.println(n2+" es distinto de "+n3);
			}
			else {
				if(n1!=n2 && n3==n4) {
					System.out.println(n3+"+"+n4+"="+(n3+n4));
				}
				else {
					if(n1!=n2 && n4==n5) {
						System.out.println(n4+"+"+n5+"="+(n4+n5));
					}
					else {
						System.out.println("FIN");
					}
				}
			}
		}

	}

}
