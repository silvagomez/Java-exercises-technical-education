package ejercicios;
import java.util.Scanner;

public class FloatMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		
		float numero;
		
		System.out.println("Ingrese n�mero");
		numero=teclado.nextFloat();
		
			if(numero>100.50f) {
				System.out.println("El n�mero es mayor");
			}
			else {
				System.out.println("El n�mero no es mayor");
			}
	}

}
