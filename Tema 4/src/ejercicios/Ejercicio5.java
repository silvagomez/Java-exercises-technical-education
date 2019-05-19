package ejercicios;

import java.util.*;

public class Ejercicio5 {
	
	/*En el centro de estudios Ceinmark existen 2 turnos de clases (mañana y tarde).
	 * El turno de mañana tiene 8 alumnos y el turno de tarde 5.
	 * Realizar un programa que permita almacenar la nota media de cada alumno,
	 * visualizando la nota media del grupo de mañana y del grupo de tarde
	 * y la nota media de todos los alumnos de Ceinmark.*/
	
	Scanner sc = new Scanner(System.in);
	
	String[] morning = new String[8];
	String[] afternoon = new String [5];
	int[] noteM = new int[8];
	int[] noteA = new int [5];
	int mediaM=0, mediaA=0;
	
	Ejercicio5() {
		
	}
	
	void setName() {
		System.out.println("INGRESE NOMBRE DE ALUMNO DE MAÑANA");
		for (int i = 0; i < morning.length; i++) {
			morning[i]=sc.nextLine();			
		}
		System.out.println("INGRESE NOMBRE DE ALUMNO DE NOCHE");
		for (int i = 0; i < afternoon.length; i++) {
			afternoon[i]=sc.nextLine();	
		}
	}
	
	void setNote() {
		System.out.println("INGRESE LA NOTA DE LOS ALUMNO DE MAÑANA");
		for (int i = 0; i < noteM.length; i++) {
			System.out.print("Ingresa la nota de "+morning[i]+" :");
			noteM[i]=sc.nextInt();			
		}
		System.out.println("INGRESE LA NOTA DE LOS ALUMNO DE NOCHE");
		for (int i = 0; i < noteA.length; i++) {
			System.out.print("Ingresa la nota de "+afternoon[i]+" :");
			noteA[i]=sc.nextInt();	
		}
	}
	
	void view() {
		System.out.println("NOTA MEDIA CURSO MAÑANA CEINMARK");
		for (int i = 0; i < noteM.length; i++) {
			mediaM=mediaM+noteM[i];	
		}
		System.out.println(mediaM/8);
		System.out.println();
		System.out.println("NOTA MEDIA CURSO NOCHE CEINMARK");
		for (int i = 0; i < noteA.length; i++) {
			mediaA=mediaA+noteA[i];
		}
		System.out.println(mediaA/8);
		System.out.println();
		System.out.println("NOTA MEDIA ALUMNOS DE MAÑANA");
		for (int i = 0; i < morning.length; i++) {
			System.out.println(morning[i]+" su nota es: "+noteM[i]);
		}
		System.out.println("INOTA MEDIA ALUMNOS DE NOCHE");
		for (int i = 0; i < afternoon.length; i++) {
			System.out.println(afternoon[i]+" su nota es: "+noteA[i]);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio5 obj= new Ejercicio5();
		obj.setName();
		obj.setNote();
		obj.view();

	}

}
/*package ventas.vendedor
 * clase ventas atriculo, nombrearticulo, cantidad y precio, contructor recibe los tres parametros
 * metodo ver, visualiza el nombre articulo cantidad e importe
 * metodo ganancia retorna, precio * cantidad
 * clase vendedor, atributos, nombre y un array de ventas
 * contructor recibe nombre y el maximo de ventas que puede realizar dicho vendedor
 * metono nuevasVentas recibe un array de nuevas ventas, por ejemplo tuerca cantidad 10 precio 2
 * tornillos cantidad 100 precio 8
 * cuidado no exceder el tamaño del array si es el caso mensaje y finalizar el programa
 * el metodo retornara false si es este caso
 * metodo ver, visualiza el nombre del vendero y llamara el metodo de venta, para obtener el nombre del articulo vendido
 * cantidad y el importe.
 * clase principal, crear una instancia de vendedor, llamar al metodo de nuevas ventas, y llamar al metodo ver de vendedor
*/