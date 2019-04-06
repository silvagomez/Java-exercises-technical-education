package practicas;
import java.util.Scanner;
public class PlanoCartesiano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Ingrese el valor de x diferente a 0");
		x=teclado.nextInt();
		System.out.println("Ingrese el valor de y diferente a 0");
		y=teclado.nextInt();
		
		if(x>0 && y>0){
			System.out.println("Los valores están ubicados en el cuadrante 1 del plano cartesiano");
		}
		else {
			if(x<0 && y>0) {
				System.out.println("Los valores estan ubicados en el cuadrante 2 del plano cartesiano");
			}
			else {
				if(x<0 && y<0) {
					System.out.println("Los valores estan ubicados en el cuadrante 3 del plano cartesiano");
				}
				else {
					if(x>0 && y<0) {
						System.out.println("Los valores estan ubicados en el cuadrante 4 del plano cartesiano");
					}
					else {
						
					}
				}
			}
		}

	}

}
