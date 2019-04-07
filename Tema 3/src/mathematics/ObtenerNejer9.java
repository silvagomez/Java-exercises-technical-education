package mathematics;

import java.util.Scanner;

public class ObtenerNejer9 {
	
Scanner teclado= new Scanner(System.in);

	float n,m,t;
	
	ObtenerNejer9(){
		System.out.println("Ingrese el valor de n");
		n=teclado.nextFloat();
		System.out.println("Ingrese el valor de m");
		m=teclado.nextFloat();
		
	}
	
	void potencia() {
		t=(float)Math.pow(n, m);
	}
	void view() {
		System.out.println(t);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObtenerNejer9 obj = new ObtenerNejer9();
		obj.potencia();
		obj.view();

	}

}
