package tiposMetodos;

import java.util.Scanner;

public class EjerMet2 {
	
	Scanner teclado = new Scanner(System.in);
	
	byte n1, n2, r;
	
	void setDatos() {
		System.out.println("Ingrese el valor de a");
		n1=teclado.nextByte();
		System.out.println("Ingrese el valor de b");
		n2=teclado.nextByte();
	}
	 void restar() {
		 r=(byte) (n1-n2);
		 
	 }
	 void view() {
		 System.out.println("La resta ente a y b es "+r);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet2 n = new EjerMet2();
		n.setDatos();
		n.restar();
		n.view();
		

	}

}
