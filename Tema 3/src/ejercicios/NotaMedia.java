package ejercicios;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class NotaMedia {
	
	/*Clase NotaMedia, teclear en el constructor el nombre del alumno 
	 * y un numero varianle de notas, hay m�s notas si o no;
	 * en un m�todo llamado obtenerNotaMedia visualizar la nota media del alumno;*/
	
	Scanner teclado = new Scanner(System.in);
	String nombre;
	float nota, notaM, acuNota, cantNota=1;
	char opc;
	NotaMedia(){
		System.out.println("Ingrese nombre del alumno");
		nombre=teclado.nextLine();
		do {
			System.out.println("Ingrese la nota");
			nota=teclado.nextFloat();
			acuNota=acuNota+nota;
			System.out.println("Quiere ingresar m�s notas s/n");
			opc=teclado.next().charAt(0);
			if(opc=='s') {
				cantNota++;
			}
				else {
			
					}
		}
		while(opc=='s');
			
		
	}
	
	void obtenerNotaMedia () {
		
			
		notaM=acuNota/cantNota;
		System.out.println("La nota media de "+nombre+" es "+notaM);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotaMedia not= new NotaMedia();
		not.obtenerNotaMedia();

	}

}
