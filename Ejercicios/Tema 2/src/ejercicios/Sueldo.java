package ejercicios;
import java.util.Scanner;
public class Sueldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		float sueldo, sueldoFinal;
		int ant;
		
		System.out.println("Ingrese su sueldo");
		sueldo=teclado.nextFloat();
		
		/*if(sueldo<2000) {
			System.out.println("Ingrese su antiguedad en la empresa");
			ant=teclado.nextInt();
			if(ant>=10) {
				System.out.println("Su sueldo final es " +(sueldoFinal=(sueldo*1.20f)));	
			}
			else {
				System.out.println("Su sueldo final es " +(sueldoFinal=(sueldo*1.05f)));
			}
		}
		else {
			System.out.println("Su sueldo final es " +(sueldoFinal=sueldo));
		}*/
		
		if(sueldo<200) {
			System.out.println("Ingrese su antiguedad en la empresa");
			ant=teclado.nextInt();
					//if(ant>=10)
		}

	}

}
