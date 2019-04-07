package mathematics;

import java.util.Scanner;

public class Calculo {
	
	Scanner teclado = new Scanner(System.in);
	
	float n1, n2, total;
	char opc, pass='s';
	
	Calculo(){
		System.out.println("Calculadora de raíz cuadrada y potencias");
	}
	
	void calculoIf() {
		while(pass=='s') {
		do{
			System.out.println();
			System.out.println("Elija una opción");
			System.out.println("1. Raíz");
			System.out.println("2. Potencia");
			System.out.println("3. Salir");
			opc=teclado.next().charAt(0);
			
			if(opc=='1') {
				System.out.println("Ingrese el valor del n");
				n1=teclado.nextFloat();
				total=(float)Math.sqrt(n1);
				System.out.println("La raíz cuadrada de "+n1+" es "+total);
			}
			else {
				if(opc=='2') {
					System.out.println("Ingrese el valor de n");
					n1=teclado.nextFloat();
					System.out.println("Ingrese el valor de ^m");
					n2=teclado.nextFloat();
					total=(float)Math.pow(n1, n2);
					System.out.println("La potencia de "+n1+"^"+n2+" es "+total);
					
				}
				else {
					if(opc=='3') {
						System.out.println("Adios");
						pass='n';
					}
					else {
						
						System.out.println("ERROR!!! Ingrese un número de 1 a 3");
						
					}
					
				}
		
			}	
			
		}
		while(opc=='1' || opc=='2' ); /*|| opc!='1'||opc!='2'|| opc!='3'*/
		}
	}
	
	void calculoSwicth() {
		while(pass=='s') {
			do {
				System.out.println();
				System.out.println("Elija una opción");
				System.out.println("1. Raíz");
				System.out.println("2. Potencia");
				System.out.println("3 Salir");
				opc=teclado.next().charAt(0);
				switch (opc) {
				case '1':
					System.out.println("Ingrese el valor del n");
					n1=teclado.nextFloat();
					total=(float)Math.sqrt(n1);
					System.out.println("La raíz cuadrada de "+n1+" es "+total);
					break;
				case '2':
					System.out.println("Ingrese el valor de n");
					n1=teclado.nextFloat();
					System.out.println("Ingrese el valor de ^m");
					n2=teclado.nextFloat();
					total=(float)Math.pow(n1, n2);
					System.out.println("La potencia de "+n1+"^"+n2+" es "+total);
					break;
				case '3':
					System.out.println("Adios");
					pass='n';
					break;

				default:
					System.out.println("ERROR!!! Ingrese un número de 1 a 3");
					break;
					
				}
			}
			while(opc=='1' || opc=='2');
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculo obj = new Calculo();
		//obj.calculoIf();
		obj.calculoSwicth();

	}

}
