package arrays;
import java.util.*;
public class Array2 {
	
	Scanner sc = new Scanner(System.in);
	int i;
	int[] numeros = new int [10];
	double media=0;
	Array2(){
		
	}
	void llenarArray(){
		System.out.println("Lectura de los elementos del array: ");
		for(i=0; i<10; i++) {
			System.out.print("Números ["+i+"]= ");
			numeros[i]=sc.nextInt();
		}
	}
	void recorrerArray() {
		for(i=0; i<10; i++) {
			if(i%2==0) {
				media = media+numeros[i];
			}
		}
	}
	void visualizar() {
		System.out.println("Media de los valores que se encuentran en posiciones pares: "+media/5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 obj = new Array2();
		obj.llenarArray();
		obj.recorrerArray();
		obj.visualizar();

	}

}
