package ejercicios;
import java.util.Scanner;

public class FloatMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		float numero;
		
		System.out.println("Ingrese número");
		numero=teclado.nextFloat();
		
			if(numero>100.50f) {
				System.out.println("El número es mayor");
			}
			else {
				System.out.println("El número no es mayor");
			}
	}

}
