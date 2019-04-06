package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 11
		/*------------------------------------------------
		 * Este programa muestra los pagos que recibirá un trabajador 
		 * por cada hora laboral en base a la hora del día en que trabaja. 
		 * El usuario deberá escribir el número de horas trabajadas en cada uno de los horarios 
		 * y el programa determinará el total de dinero a recibir por el trabajador 
		 * y también dirá si ganó más dinero por horas extras que por horas de oficina trabajadas 
		 * o viceversa, o si el trabajador ganó exáctamente lo mismo por horas extras que por horas de oficina.
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
		System.out.println("Ingrese a continuación las horas trabajadas en los respectivos horarios");
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
		System.out.println("El pago total que recibirá es: " +sueldoFinal);
		System.out.println();
		
		sueldoOf=(hor1*sueldoBase);
		System.out.println("El pago por las horas trabajadas en oficina es: " +sueldoOf);
		
		sueldoEx=((hor2*sueldoBase*1.25f)+(hor3*sueldoBase*1.50f)+(hor4*sueldoBase*2));
		System.out.println("El pago por las horas extras es: " +sueldoEx);
		
		System.out.println();
		
		if(sueldoOf>sueldoEx) {
			System.out.println("Ha ganado más dinero por horas de oficina");
		}
		else {
			if(sueldoOf==sueldoEx) {
				System.out.println("Ha ganado el mismo dinero por horas de oficina y  por horas extras");
			}
			else {
				System.out.println("Ha ganado más dinero por horas extras");
			}
		}

	}

}
