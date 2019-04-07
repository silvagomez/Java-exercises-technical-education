package ejercicios;
import java.util.Scanner;

public class Triangulo {
	
	/*Codificar una clase llamada tri�ngulo, con los siguientes m�todos: 
	 * setDatos donde se teclean los valores de los lados de
	 * un tri�ngulo (para simplificar el ejercicio los 3 n�meros son iguales o distintos); 
	 * ladoMayor examina cual es el lado mayor y lo visualiza; 
	 * equilatero muestra un mensaje indicando si el tri�ngulo es equilatero o no*/
	
	int n1, n2, n3;
	Scanner teclado = new Scanner(System.in);
	
	void setDatos() {
		System.out.println("Ejercicio Tri�ngulo");
		System.out.println("Ingrese el valor del primer lado del tri�ngulo");
		n1=teclado.nextInt();
		System.out.println("Ingrese el valor del segundo lado del tri�ngulo");
		n2=teclado.nextInt();
		System.out.println("Ingrese el valor del tecer lado del tri�ngulo ");
		n3=teclado.nextInt();
	}
	
	void ladoMayor() {
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" es el lado mayor");
		}
		else {
			if(n2>n1 && n2>n3) {
				System.out.println(n2+" es el lado mayor");
			}
			else {
				if(n3>n1 && n3>n2) {
					System.out.println(n3+" es el lado mayor");
				}
				else {
					
				}
			}
		}
	}
	
	void equilatero() {
		if(n1==n2 && n1==n3) {
			System.out.println("Es un tri�ngulo equil�tero");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo t1 = new Triangulo();
		t1.setDatos();
		t1.equilatero();
		t1.ladoMayor();

	}

}


 