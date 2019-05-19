package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 7
		/*------------------------------------------------
		 * Mostrar el signo del zodíaco de una persona.
		 * Para ello el usuario debe introducir el día y el mes de nacimiento.
		 * Realizar el ejercicio con if.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		byte dia, mes;
		
		System.out.println("Signo del zodiaco");
		System.out.println("Ingrese su día de nacimiento");
		dia=teclado.nextByte();
		System.out.println("Ingrese su mes de nacimiento");
		mes=teclado.nextByte();
		
		
		if(dia>=20 && mes==01 || dia<=18 && mes==02) {
			System.out.println("Acuario");
		}
		else {
			if(dia>=19 && mes==02 || dia<=20 && mes==03) {
				System.out.println("Piscis");
			}
			else {
				if(dia>=21 && mes==03 || dia<=19 && mes==04) {
					System.out.println("Aries");
				}
				else {
					if(dia>=20 && mes==04 || dia<=20 && mes==05) {
						System.out.println("Tauro");
					}
					else {
						if(dia>=21 && mes==05 || dia<=20 && mes==06) {
							System.out.println("Géminis");
						}
						else {
							if(dia>=21 && mes==06 || dia<=22 && mes==07) {
								System.out.println("Cáncer");
							}
							else {
								if(dia>=23 && mes==07 || dia<=22 && mes==8) { //POR QUE 08 ESTÁ FUERA DE RANGO, ES POR QUE ES SISTEMA OCTAL
									System.out.println("Leo");
								}
								else {
									if (dia>=23 && mes==8 || dia<=22 && mes==9) {
										System.out.println("Virgo");
									}
									else {
										if(dia>=23 && mes==9 || dia<=22 && mes==10) {
											System.out.println("Libra");
										}
										else {
											if(dia>=23 && mes==10 || dia<=21 && mes==11) {
												System.out.println("Escorpio");
											}
											else {
												if(dia>=22 && mes==11 || dia<=21 && mes==12) {
													System.out.println("Sagitario");
												}
												else {
													if(dia>=22 && mes==12 || dia<=19 && mes==01) {
														System.out.println("Capricornio");
													}
													else {
														
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

}
