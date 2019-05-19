package ejercicios;
import java.util.*;
public class Ejercicio1_2_3 {
	
	
	int [] elen = {1,2,3,4,5,6,7,8,9,10};
	int [] punto = new int[10];
	
	Scanner key = new Scanner(System.in);
	
	Ejercicio1_2_3(){
		
	}
	
	void setData(){
		for (char i = 0; i < punto.length; i++) {
			System.out.print("Ingresa un caracter: ");
			punto[i]=key.next().charAt(0);
		}
		
	}
	
	void view() {
		for (int i = 0; i < elen.length; i++) {
			System.out.print(elen[i]+"\t");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio1_2_3 obj = new Ejercicio1_2_3();
		obj.view();
		obj.setData();

	}

}
