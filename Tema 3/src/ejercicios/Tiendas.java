package ejercicios;
import java.util.Scanner;

public class Tiendas {
	Scanner teclado = new Scanner(System.in);
	int telefono, n, fax ; 
	String cif, dniD, nombreTienda, calle, web, mail, nombre, apellido1, apellido2;
	
	Tiendas() {
		System.out.println("EJERCICIO TIENDAS");
		System.out.println("Ingrese el c�digo de identificaci�n fiscal");
		cif=teclado.nextLine();
		//teclado.nextLine();
		System.out.println("Ingrese el nombre de la tienda");
		nombreTienda=teclado.nextLine();
		System.out.println("Ingrese el tel�fono");
		telefono=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese calle");
		calle=teclado.nextLine();
		System.out.println("Ingrese n�");
		n=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese la web");
		web=teclado.nextLine();
		System.out.println("Ingrese fax");
		fax=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese mail");
		mail=teclado.nextLine();
		System.out.println("Ingrese el DNI del due�o");
		dniD=teclado.nextLine();
		//teclado.nextLine();
		System.out.println("Ingrese el nombre");
		nombre=teclado.nextLine();
		System.out.println("Ingrese el primer apellido");
		apellido1=teclado.nextLine();
		System.out.println("Ingrese el segundo apellido");
		apellido2=teclado.nextLine();
	}
	
	void get1() {
		System.out.println("El tel�fono de " +nombreTienda+ " es: " +telefono);
	}
	
	void get2() {
		System.out.println("El c�digo de identificaci�n fiscal: " +cif+ " pertenece a " +nombre+ " "+apellido1+ " "+apellido2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiendas t1 = new Tiendas();
		t1.get1();
		t1.get2();

	}

}
