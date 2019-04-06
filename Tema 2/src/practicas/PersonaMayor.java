package ejercicios;
import java.util.Scanner;

public class PersonaMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		String nombre1, nombre2;
		Byte edad1, edad2;
		
		System.out.println("Ingrese el nombre");
		nombre1=teclado.nextLine();
		System.out.println("Ingrese la edad");
		edad1=teclado.nextByte();
		teclado.nextLine();
		System.out.println("Ingrese el nombre");
		nombre2=teclado.nextLine();
		System.out.println("Ingrese la edad");
		edad2=teclado.nextByte();
		
			/*if(edad1>edad2 || edad1<edad2 || edad1==edad2){
				System.out.println(nombre1);
				System.out.println(nombre2);
				System.out.println(nombre1+nombre2);
			 }*/
	
			if(edad1==edad2) {
				System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad");
				/*if (edad1>edad2) {
					System.out.println(nombre1+nombre2);
				}*/
			}
			else {
					if(edad1>edad2) {
					System.out.println(nombre1 + " es mayor");	
					}
					else {
						System.out.println(nombre2 + " es mayor");
					}
				
			}
			
		
	}

}
