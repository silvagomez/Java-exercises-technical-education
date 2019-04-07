package ejercicios;

import java.util.Scanner;

public class Empleados {
	
	Scanner teclado = new Scanner(System.in);
	
	String nombre;
	int sueldoM, impuesto=20000, sueldoA;
	
	void inicializar() {
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
		
		Empleados p1 = new Empleados();
		p1.inicializar();
		p1.pagarImpuestos();

	}

}
