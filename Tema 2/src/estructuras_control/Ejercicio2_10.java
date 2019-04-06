package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 10
		/*------------------------------------------------
		 * El programa muestra primero una tabla de notas con sus equivalentes en el Standard Grading System , 
		 * el sistema utilizado en los Estados Unidos que va desde la A hasta la F. 
		 * El programa preguntará al usuario su nota 
		 * y transformará ese resultado al equivalente en el Standard Grading System. 
		 * También el programa dará una pequeña pero valiosa recomendación al usuario 
		 * respecto a su nivel de estudio y calidad como estudiante.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		float nota;
		
		System.out.println("          NOTAS          EQUIVALENCIA");
		System.out.println("        9.0 - 10.0            A      ");
		System.out.println("        8.5 - 8.9             B+     ");
		System.out.println("        8.0 - 8.4             B      ");
		System.out.println("        7.5 - 7.9             C+     ");
		System.out.println("        7.0 - 7.4             C      ");
		System.out.println("        6.0 - 6.9             D      ");
		System.out.println("        0.0 - 5.9             F      ");
		
		System.out.println("Ingrese su nota");
		nota=teclado.nextFloat();
		while(nota<0 || nota>10){
			System.out.println("Ingrese su nota");
			nota=teclado.nextFloat();
		}
		
		if(nota>9.0f) {
			System.out.println("Nota equivalente en Standar Grading System A");
			System.out.println("El estudiante está on fire!!!!");
		}
		else {
			if(nota>8.5f) {
				System.out.println("Nota equivalente en Standar Grading System B+");
				System.out.println("El nivel del estudiante es asombroso");
			}
			else {
				if(nota>8f) {
					System.out.println("Nota equivalente en Standar Grading System B");
					System.out.println("El nivel del estudiante es muy bueno");
				}
				else {
					if(nota>7.5f) {
						System.out.println("Nota equivalente en Standar Grading System C+");
						System.out.println("El nivel del estudiante es bueno, puede mejorar");
					}
					else {
						if(nota>7f) {
							System.out.println("Nota equivalente en Standar Grading System C");
							System.out.println("El nivel del estudiante es regular, debe estudiar más");
						}
						else {
							if(nota>6f) {
								System.out.println("Nota equivalente en Standar Grading System D");
								System.out.println("El nivel del estudiante es bajo, necesita clases extras");
							}
							else {
								if(nota>0) {
									System.out.println("Nota equivalente en Standar Grading System F");
									System.out.println("Nos vemos el próximo año, siguelo intentando");
								}
							}
						}
					}
				}
			}
		}
	}

}
