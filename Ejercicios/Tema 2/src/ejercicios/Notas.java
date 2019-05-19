package ejercicios;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int contMayor7=0, contMenor7=0, contNotas=0, nota;
		
		//EJERCICIO CON DO WHILE
		/*do {
			System.out.println("Ingrese una nota");
			nota=teclado.nextInt();
		
			if(nota<=7){
				contMayor7++;
			}
			else {
				contMenor7++;
			}
		
			contNotas++;
					
		}
		while(contNotas<10);
		System.out.println("Notas mayores a 7 son: "+contMayor7);
		System.out.println("Notas menores a 7 son: "+contMenor7);*/
		
		//EJERCICIO CON WHILE
		/*while(contNotas<10){
			System.out.println("Ingrese una nota");
			nota=teclado.nextInt();
		
			if(nota<=7){
				contMayor7++;
			}
			else {
				contMenor7++;
			}
		
			contNotas++;
		}
		System.out.println("Notas mayores a 7 son: "+contMayor7);
		System.out.println("Notas menores a 7 son: "+contMenor7);*/
		
		//EJERCICIO VISUALIZAR NÚMERO DEL 1 AL 50 CON , Y DO-WHILE INICIALIZADO EN 0 Y VER 1
		int n=0;
		
		do{
			n++;
			System.out.println(n + ",");
			
		}
		while(n<49);
		System.out.println(50);
		
		//EJERCICIO VISUALIZAR NÚMERO DEL 1 AL 50 INICIALIZADO EN 0 Y VER 1
		/*int n=0;
		while(n<=50) {
			n++;
			System.out.println(n);
		}*/

	}

}
