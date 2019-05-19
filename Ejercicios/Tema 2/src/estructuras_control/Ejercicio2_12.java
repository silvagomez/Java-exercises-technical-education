package estructuras_control;
import java.util.Scanner;
public class Ejercicio2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 12
		/*------------------------------------------------
		 * De la galería de productos, el usuario introducirá el código 
		 * y el número de unidades del producto que desea comprar. 
		 * El programa determinará el total a pagar, como una factura.
		 *------------------------------------------------*/
		
		Scanner teclado = new Scanner(System.in);
		
		int camisa=20, cinturon=8, zapatos=25, pantalon=30, calcetines=5, falda=20,
			gorra=15, sueter=18, corbata=10, chaqueta=35;
		int codigo, cantidad;
		
		
		System.out.println("    ELIJA EL PRODUCTO DESEADO:");
		System.out.println();
		System.out.println("     PRODUCTO          CÓDIGO");
		System.out.println("     Camisa...............1");
		System.out.println("     Cinturon.............2");
		System.out.println("     Zapatos..............3");
		System.out.println("     Pantalón.............4");
		System.out.println("     Calcetines...........5");
		System.out.println("     Falda................6");
		System.out.println("     Gora.................7");
		System.out.println("     Sueter...............8");
		System.out.println("     Corbata..............9");
		System.out.println("     Chaqueta............10");
		System.out.println();
		
		System.out.println("Ingrese el código");
		codigo=teclado.nextInt();
		
		while(codigo<=0 || codigo>10) {
			System.out.println("Ingrese el código");
			codigo=teclado.nextInt();
		}
		
		switch (codigo) {
		case 1:
			System.out.println("El precio de la camisa es: " +camisa);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(camisa*cantidad));
			break;
		case 2:
			System.out.println("El precio del cinturon es: " +cinturon);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(cinturon*cantidad));
			break;
		case 3:
			System.out.println("El precio de la zapatos es: " +zapatos);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(zapatos*cantidad));
			break;
		case 4:
			System.out.println("El precio de la pantalon es: " +pantalon);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(pantalon*cantidad));
			break;
		case 5:
			System.out.println("El precio de la calcetines es: " +calcetines);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(calcetines*cantidad));
			break;
		case 6:
			System.out.println("El precio de la falda es: " +falda);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(falda*cantidad));
			break;
		case 7:
			System.out.println("El precio de la gorra es: " +gorra);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(gorra*cantidad));
			break;
		case 8:
			System.out.println("El precio de la sueter es: " +sueter);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(sueter*cantidad));
			break;
		case 9:
			System.out.println("El precio de la corbata es: " +corbata);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(corbata*cantidad));
			break;
		case 10:
			System.out.println("El precio de la chaqueta es: " +chaqueta);
			System.out.println("Ingrese la cantidad a comprar");
			cantidad=teclado.nextInt();
			System.out.println();
			System.out.println("Total a pagar es: " +(chaqueta*cantidad));
			break;

		default:
			break;
		}

	}

}
