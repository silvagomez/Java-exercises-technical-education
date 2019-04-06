package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 11
		/*------------------------------------------------
		 * Este programa muestra los pagos que recibir� un trabajador 
		 * por cada hora laboral en base a la hora del d�a en que trabaja. 
		 * El usuario deber� escribir el n�mero de horas trabajadas en cada uno de los horarios 
		 * y el programa determinar� el total de dinero a recibir por el trabajador 
		 * y tambi�n dir� si gan� m�s dinero por horas extras que por horas de oficina trabajadas 
		 * o viceversa, o si el trabajador gan� ex�ctamente lo mismo por horas extras que por horas de oficina.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		float sueldoBase, hor1, hor2, hor3, hor4, sueldoFinal, sueldoOf, sueldoEx;
		
		System.out.println("          HORARIO                PAGO");
		System.out.println("     8:00 am - 4:00 pm        PAGO BASE");
		System.out.println("     4:00 pm - 8:00 pm        25% EXTRA");
		System.out.println("     8:00 pm - 12:00 am       50% EXTRA");
		System.out.println("    12:00 am - 8:00 am        PAGO DOBLE");
		System.out.println();
		
		System.out.println("Ingrese su sueldo base por hora trabajada");
		sueldoBase=teclado.nextFloat();
		while(sueldoBase<=0){
			System.out.println("Ingrese su sueldo base por hora trabajada");
			sueldoBase=teclado.nextFloat();
		}
		
		System.out.println();
		System.out.println("Ingrese a continuaci�n las horas trabajadas en los respectivos horarios");
		System.out.println();
		
		System.out.println("Horas trabajadas de 8:00 am - 4:00 pm:");
		hor1=teclado.nextFloat();
		while(hor1<0 || hor1>8) {
			System.out.println("Horas trabajadas de 8:00 am - 4:00 pm:");
			hor1=teclado.nextFloat();
		}
		
		System.out.println("Horas trabajadas de 4:00 pm - 8:00 pm:");
		hor2=teclado.nextFloat();
		while(hor2<0 || hor2>4) {
			System.out.println("Horas trabajadas de 4:00 pm - 8:00 pm:");
			hor2=teclado.nextFloat();					
		}
		
		System.out.println("Horas trabajadas de 8:00 pm - 12:00 am:");
		hor3=teclado.nextFloat();
		while(hor3<0 || hor3>4) {
			System.out.println("Horas trabajadas de 8:00 pm - 12:00 am:");
			hor3=teclado.nextFloat();			
		}
		
		System.out.println("Horas trabajadas de 12:00 am - 8:00 am:");
		hor4=teclado.nextFloat();
		while(hor4<0 || hor4>8) {
			System.out.println("Horas trabajadas de 12:00 am - 8:00 am:");
			hor4=teclado.nextFloat();
		}
		
		sueldoFinal=((hor1*sueldoBase)+(hor2*sueldoBase*1.25f)+(hor3*sueldoBase*1.50f)+(hor4*sueldoBase*2));
		System.out.println();
		System.out.println("El pago total que recibir� es: " +sueldoFinal);
		System.out.println();
		
		sueldoOf=(hor1*sueldoBase);
		System.out.println("El pago por las horas trabajadas en oficina es: " +sueldoOf);
		
		sueldoEx=((hor2*sueldoBase*1.25f)+(hor3*sueldoBase*1.50f)+(hor4*sueldoBase*2));
		System.out.println("El pago por las horas extras es: " +sueldoEx);
		
		System.out.println();
		
		if(sueldoOf>sueldoEx) {
			System.out.println("Ha ganado m�s dinero por horas de oficina");
		}
		else {
			if(sueldoOf==sueldoEx) {
				System.out.println("Ha ganado el mismo dinero por horas de oficina y  por horas extras");
			}
			else {
				System.out.println("Ha ganado m�s dinero por horas extras");
			}
		}

	}

}
