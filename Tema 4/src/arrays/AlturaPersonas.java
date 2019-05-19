package arrays;
import java.util.Scanner;

public class AlturaPersonas {
	
	Scanner teclado= new Scanner(System.in);
	
	float[] a =new float [5];
	
	void teclear() {
		byte cont=5;
		for(int x=0; x<5; x++) {
			System.out.print("Teclea la altura " + cont+":  ");
			a[x]=teclado.nextFloat();
			cont--;
		}
	}
	
	float calcularPromedio() {
		float suma=0, promedio;
		for(int x=0; x<a.length; x++) {
			suma = suma + a[x]; 
		}
		promedio = suma/5;
		
		//System.out.println("La suma de las alturas es: "+suma);
		//System.out.println("El promedio de las alturas es: "+promedio);
		
		return promedio;
	}
	
	void mayoresMenores() {
		/*Visualizar la cantidad de personas mas altas de la media y visualizar la cantidad de personas más bajas de la media*/
		byte mayor=0, menor=0;
		for(int y= 0; y<a.length; y++ ) {
			if(a[y]>calcularPromedio()) {
				mayor++;
				System.out.println("Alturas mayores: " +a[y]);
				
			}
			else {
				menor++;
				System.out.println("Alturas menores: " +a[y]);
				
			}
		}
		System.out.println("Total de alturas mayores: "+mayor);
		System.out.println("Total de alturas menores: "+menor);
	}
	
	void view() {
		System.out.println("La altura promedio es: "+calcularPromedio());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlturaPersonas obj = new AlturaPersonas();
		obj.teclear();
		//obj.calcularPromedio();
		obj.view();
		obj.mayoresMenores();

	}

}


