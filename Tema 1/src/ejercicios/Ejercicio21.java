package ejercicios;
import java.util.Scanner;
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// EJERCICIO 21
				
				 float nota1, nota2, nota3, notaP, notaE, notaT, notaF;
				 
				 System.out.println("Notas en %");
				 System.out.println("Ingrese la nota del parcial 1");
				 nota1=teclado.nextFloat();
				 System.out.println("Ingrese la nota del parcial 2");
				 nota2=teclado.nextFloat();
				 System.out.println("Ingrese la nota del parcial 3");
				 nota3=teclado.nextFloat();
				 
				 notaP=(nota1+nota2+nota3)/3; 
				 notaP=(float) (notaP*0.55);
				 
				 System.out.println("Ingrese la nota del examen final");
				 notaE=teclado.nextFloat();
				 
				 notaE=(float) (notaE*0.3);
				 
				 System.out.println("Ingrese la nota del trabajo"); 
				 notaT=teclado.nextFloat();
				 
				 notaT=(float) (notaT*0.15);
				 
				 notaF=notaP+notaE+notaT;
				 
				 System.out.println("La nota final es "+notaF);
				 

	}

}
