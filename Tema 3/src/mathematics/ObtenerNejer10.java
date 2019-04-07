package mathematics;

import java.util.Scanner;

public class ObtenerNejer10 {
	
	float n,m,t;
	Scanner teclado= new Scanner(System.in);
	
	ObtenerNejer10(){
		System.out.println("Ingrese el valor de n");
		n=teclado.nextFloat();
		System.out.println("Ingrese el valor de m");
		m=teclado.nextFloat();
		
	}
	
	void potencia() {
		t=(float)Math.pow(n, m);
		view();
	}
	void view() {
		System.out.println(t);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObtenerNejer10 obj= new ObtenerNejer10();
		obj.potencia();

	}

}
