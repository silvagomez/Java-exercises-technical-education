package ejercicios;
import java.util.Scanner;
public class Ejercicio1_21 {

	public static void main(String[] args) {
		
		// EJERCICIO 21
		/*------------------------------------------------
		 * Un alumno desea saber la nota final en una asignatura. 
		 * Dicha nota se obtiene de la siguiente forma:
		 * 55% del promedio de sus 3 calificaciones parciales.
		 * 30% de la calificación del examen final.
		 * 15% de la calificación de un trabajo final.
		 *------------------------------------------------*/

		Scanner teclado = new Scanner(System.in);
		// EJERCICIO 21
				
				 float nota1, nota2, nota3, notaParcial, notaExamen, notaTotal, notaFinal;
				 
				 System.out.println("Notas en %");
				 System.out.println("Ingrese la nota del parcial 1");
				 nota1=teclado.nextFloat();
				 System.out.println("Ingrese la nota del parcial 2");
				 nota2=teclado.nextFloat();
				 System.out.println("Ingrese la nota del parcial 3");
				 nota3=teclado.nextFloat();
				 
				 notaParcial=(nota1+nota2+nota3)/3; 
				 notaParcial=(float) (notaParcial*0.55);
				 
				 System.out.println("Ingrese la nota del examen final");
				 notaExamen=teclado.nextFloat();
				 
				 notaExamen=(float) (notaExamen*0.3);
				 
				 System.out.println("Ingrese la nota del trabajo"); 
				 notaTotal=teclado.nextFloat();
				 
				 notaTotal=(float) (notaTotal*0.15);
				 
				 notaFinal=notaParcial+notaExamen+notaTotal;
				 
				 System.out.println("La nota final es "+notaFinal);
				 

	}

}
