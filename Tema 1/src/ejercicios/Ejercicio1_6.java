package ejercicios;
public class Ejercicio1_6 {

	public static void main(String[] args) {
		
		// EJERCICIO 6
		/*------------------------------------------------
		 * Comprobar qué ocurre si introducimos valores
		 * superiores a los permitidos en los tipos de datos.
		 *------------------------------------------------*/
				
		 byte n1=128; //Limit = 127
		 int n2=2147483648; //Limit = 2147483647
		 short n3=32768; //Limit = 32767
		 
		 System.out.println("128 = Type mismatch: cannot convert from int to byte");
		 System.out.println("2147483648 = The literal 2147483648 of type int is out of range");
		 System.out.println("32768 = Type mismatch: cannot convert from int to short");
				 
	}
}
