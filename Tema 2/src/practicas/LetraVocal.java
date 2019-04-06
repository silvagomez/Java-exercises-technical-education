package practicas;
import java.util.Scanner;

public class LetraVocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		char car;
		
		
		System.out.println("Ingrese una letra");
		car=teclado.next().charAt(0);
		
			/*if(car=='a'|| car=='e'|| car=='i' || car=='o' || car=='u') {
				System.out.println("La letra es una vocal");
			}
			else {
				System.out.println("La letra no es una vocal");
			}*/
			
		
		if(car=='a') {
				System.out.println("La letra es una vocal");
			}
		else { 
				if(car=='e'){
					System.out.println("La letra es una vocal");
				}
				else {
					if(car=='i') {
						System.out.println("La letra es una vocal");
					}
					else {
						if(car=='o') {
							System.out.println("La letra es una vocal");
						}
						else {
							if(car=='u') {
								System.out.println("La letra es una vocal");
							}
							else{
								System.out.println("La letra no es una vocal");
							}
						}
					}
				}
			}
		
		
	}

}
