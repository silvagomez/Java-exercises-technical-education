package ejercicios;

import java.util.Scanner;

public class Emplea {
	
	Scanner teclado = new Scanner(System.in);
	
	String nombre;
	int sueldoM, impuesto=20000, sueldoA;
	
	Emplea() {
		System.out.println("Ingrese su nombre");
		nombre=teclado.nextLine();
		System.out.println("Ingrese su sueldo mensual");
		sueldoM=teclado.nextInt();
	}
	
	void pagarImpuestos() {
		sueldoA=sueldoM*12;
		
		if(sueldoA>impuesto) {
			System.out.println("Debe pagar impuestos, su sueldo anual es "+sueldoA);
		}
		else {
			System.out.println("No debe pagar impuestos, su sueldo anual es "+sueldoA);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emplea p1 = new Emplea();
		
		p1.pagarImpuestos();

	}

}
