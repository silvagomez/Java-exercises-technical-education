package practicas;
import java.util.Scanner;

public class ParMayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		 byte n;
		 byte resto;
		 
		 System.out.println("Teclea un n�mero");
		 n=teclado.nextByte();
		 resto=(byte)(n%2);
		 
		 if(resto==0) {
			 System.out.println("El n�mero es par");
		 }
		 else {
			 System.out.println("El n�mero es impar");
		 }
		 
		 if(n>30) {
			 System.out.println("El n�mero es mayor a 30");
		 }
		 else {
			 System.out.println("El n�mero es menor a 30");
		 }
	}

}
