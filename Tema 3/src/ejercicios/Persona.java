package ejercicios;
import java.util.Scanner;

public class Persona {
	
	/*Codificar una clase llamada persona, con los métodos: 
	 * setDatos para introducir nombre y edad, getDatos para visualizar
	 * dichos datos y mayorEdad para visuzalizar un mensaje indicando 
	 * si es o no mayor de edad.*/

	String nombre;
	int edad;
	Scanner teclado = new Scanner(System.in);
	
	void setDatos() {
		System.out.println("Ejercicio Persona");
		System.out.println("Ingrese la edad");
		edad=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese el nombre");
		nombre=teclado.nextLine();
		
		
	}
	
	void getDatos() {
		System.out.println("El nombre de la persona es " +nombre+ " y su edad es " + edad);
	}
	
	void mayorEdad() {
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		}
		else {
			System.out.println("No es mayor de edad");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1= new Persona();
		p1.setDatos();
		p1.mayorEdad();
		p1.getDatos();
		

	}

}
