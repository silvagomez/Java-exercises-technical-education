package arrays;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int pos=0, neg=0;
		int[] numeros = new int[10];
		double sumaPos=0, sumaNeg=0;
		
		System.out.println("Lectura de los elementos del array: ");
		for (i=0;i<10;i++) {
			System.out.print("Números["+i+"]= ");
			numeros[i]=sc.nextInt();
		}
		
		for(i=0; i<10; i++) {
			if(numeros[i]>0) {
				sumaPos+= numeros[i];
				pos++;
			}
			else {
				sumaNeg+= numeros[i];
				neg++;
			}
		}
		
		if(pos!=0) {
			System.out.println("Media de los valores positivos: "+sumaPos/pos);
		}
		else {
			System.out.println("No ha introducido números porsitivos");
		}
		if(neg!=0) {
			System.out.println("Media de los valores negativos: "+sumaNeg/neg);
		}
		else {
			System.out.println("No ha introducito números negativos");
		}
	

	}

}
