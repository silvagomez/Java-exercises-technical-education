package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 8
		/*------------------------------------------------
		 * Mostrar el signo del zod�aco de una persona.
		 * Para ello el usuario debe introducir el d�a y el mes de nacimiento.
		 * Realizar el ejercicio con switch.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		byte dia, mes;
		
		System.out.println("Signo del zodiaco");
		System.out.println("Ingrese su d�a de nacimiento");
		dia=teclado.nextByte();
		System.out.println("Ingrese el mes de nacimiento");
		mes=teclado.nextByte();
		
		switch (mes) {
		case 1:
			if(dia>=20) {
				System.out.println("Acuario");
			}
			else {
				System.out.println("Capricornio");
			}
			break;
		case 2:
			if(dia>=19) {
				System.out.println("Piscis");
			}
			else {
				System.out.println("Acuario");
			}
			break;
		case 3:
			if(dia>=21) {
				System.out.println("Aries");
			}
			else {
				System.out.println("Piscis");
			}
			break;
		case 4:
			if(dia>=20) {
				System.out.println("Tauro");
			}
			else {
				System.out.println("Aries");
			}
			break;
		case 5:
			if(dia>=21) {
				System.out.println("G�minis");
			}
			else {
				System.out.println("Tauro");
			}
			break;
		case 6:
			if(dia>=21) {
				System.out.println("C�ncer");
			}
			else {
				System.out.println("G�minis");
			}
			break;
		case 7:
			if(dia>=23) {
				System.out.println("Leo");
			}
			else {
				System.out.println("C�ncer");
			}
			break;
		case 8:
			if(dia>=23) {
				System.out.println("Virgo");
			}
			else {
				System.out.println("Leo");
			}
			break;
		case 9:
			if(dia>=23) {
				System.out.println("Libra");
			}
			else {
				System.out.println("Virgo");
			}
			break;
		case 10:
			if(dia>=20) {
				System.out.println("Escorpio");
			}
			else {
				System.out.println("Libra");
			}
			break;
		case 11:
			if(dia>=22) {
				System.out.println("Sagitario");
			}
			else {
				System.out.println("Escorpio");
			}
			break;
		case 12:
			if(dia>=22) {
				System.out.println("Capricornio");
			}
			else {
				System.out.println("Sagitario");
			}
			break;

		default:
			break;
		}

	}

}
