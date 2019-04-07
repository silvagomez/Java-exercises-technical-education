package practicas;
import java.util.Scanner;

public class Notas_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO CON DO WHILE
		Scanner teclado = new Scanner(System.in);
		
		int contMayor7=0, contMenor7=0, contNotas=0, nota;
		
		do {
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
		System.out.println("Notas menores a 7 son: "+contMenor7);
		
	}

}
