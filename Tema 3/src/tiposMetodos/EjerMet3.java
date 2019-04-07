package tiposMetodos;

import java.util.Scanner;

public class EjerMet3 {
	
	Scanner teclado = new Scanner(System.in);
	
	double n1, n2, r;
	
	EjerMet3(){
		System.out.println("Ingrese el valor de a");
		n1=teclado.nextDouble();
		System.out.println("Ingrese el valor de b");
		n2=teclado.nextDouble();
	}
	
	void restar() {
		r=n1-n2;
	}
	
	void view() {
		System.out.println("El resutaldo de la resta es "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet3 n = new EjerMet3();
		n.restar();
		n.view();

	}

}
