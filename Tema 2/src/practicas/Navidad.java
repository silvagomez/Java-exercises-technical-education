package ejercicios;
import java.util.Scanner;

public class Navidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		byte mes, dia;
				
		System.out.println("Ingrese el mes");
		mes=teclado.nextByte();
		System.out.println("Ingrese el día");
		dia=teclado.nextByte();
		
			if(mes==12){
				if(dia==25) {
					System.out.println("Feliz Navidad");
				}
				else {
					System.out.println("No es navidad");
				}
			}
			else {
				System.out.println("No es navidad");
			}
	}

}
