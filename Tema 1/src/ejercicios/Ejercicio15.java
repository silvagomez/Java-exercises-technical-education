package ejercicios;
import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// EJERCICIO 15
				
				 int l1, l2, perimetro, area;
				 System.out.println("Ingrese el lado de un rect�gulo");
				 l1=teclado.nextInt();
				 System.out.println("Ingrese el segundo lado del rect�ngulo");
				 l2=teclado.nextInt(); 
				 perimetro=l1+l2+l1+l2;
				 area=l1*l2;
				 System.out.println("El per�metro del rect�ngulo es " +perimetro+" y el �rea es "+area);
				 

	}

}
