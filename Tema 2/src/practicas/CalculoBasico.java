package ejercicios;
import java.util.Scanner;
public class CalculoBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		
		float n1, n2;
		char opc;
		
		System.out.println("Teclea un n�mero");
		n1=teclado.nextFloat();
		System.out.println("Teclea otro n�mero");
		n2=teclado.nextFloat();
		System.out.println("Men� de operaciones");
		System.out.println("s sumar");
		System.out.println("r restar");
		System.out.println("m multiplicar");
		System.out.println("d dividir");
		System.out.println("Elija una opci�n");
		opc=teclado.next().charAt(0);
		
		//Versi�n switch
		
		switch(opc) {
			case 's':
				System.out.println("La suma es " +(n1+n2));
				break;
			case 'r':
				System.out.println("La resta es " +(n1-n2));
				break;
			case 'm':
				System.out.println("La multiplicaci�n es " +(n1*n2));
				break;
			case 'd':
				System.out.println("La divisi�n es " +(n1/n2));
				break;
			default:
				System.out.println("Debes elegir una de las opciones anteriores");			
		}
		
		//Versi�n if
		
		if(opc=='s') {
			System.out.println("La suma es "+(n1+n2));
					}
		else {
			if(opc=='r') {
				System.out.println("La resta es " +(n1-n2));
			}
			else {
				if(opc=='m') {
					System.out.println("La multiplicaci�n es " +(n1*n2));
				}
				else {
					if(opc=='d') {
						System.out.println("La divisi�n es "+(n1/n2));
					}
					else {
						System.out.println("Debe elegir una de las operaciones");
					}
				}
			}
		}
		
	}

}
