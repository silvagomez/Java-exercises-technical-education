package ejercicios;

import java.util.Scanner;

public class Operaciones {
	
	Scanner teclado = new Scanner(System.in);
	
	float n1, n2;
	
	void inicializar () {
		System.out.println("OPERACIONES");
		System.out.println("Ingrese el un número");
		n1=teclado.nextFloat();
		System.out.println("Ingrese otro número");
		n2=teclado.nextFloat();
	}
	
	void sumar() {
		System.out.println(n1+"+"+n2+"="+(n1+n2));
	}
	
	void restar() {
		System.out.println(n1+"-"+n2+"="+(n1-n2));
	}
	
	void multiplicar() {
		System.out.println(n1+"*"+n2+"="+(n1*n2));
	}
	
	void dividir() {
		System.out.println(n1+"/"+n2+"="+(n1/n2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Operaciones op = new Operaciones();
		op.inicializar();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();

	}

}
