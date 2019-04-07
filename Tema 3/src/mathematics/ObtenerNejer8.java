package mathematics;

import java.util.Scanner;

public class ObtenerNejer8 {
	
Scanner teclado= new Scanner(System.in);
	
	ObtenerNejer8(){
		System.out.println("Cálculo de n^m");
		
	}
	
	void potencia(float n, float m) {
		System.out.println(Math.pow(n, m));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObtenerNejer8 obj = new ObtenerNejer8();
		obj.potencia(4, 2);
		

	}

}
