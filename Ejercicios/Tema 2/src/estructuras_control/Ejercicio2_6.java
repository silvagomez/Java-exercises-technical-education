package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 6
		/*------------------------------------------------
		 * En Eroski se hace un 20% de descuento a los clientes cuya compra supere los 300€. 
		 * ¿Cuál será la cantidad que pagará una persona por su compra?.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		float compra, compraFinal;
		
		System.out.println("Ingrese el precio de su compra");
		compra=teclado.nextFloat();
		
		if(compra>=300) {
			compraFinal=(compra*0.80f);
			System.out.println("Total a pagar " +compraFinal);
			
		}
		else {
			compraFinal=compra;
			System.out.println("Total a pagar " +compraFinal);
		}

	}

}
