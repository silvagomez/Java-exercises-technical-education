package mathematics;

import java.util.Scanner;

public class ObtenerN {
	
	Scanner teclado= new Scanner(System.in);
	
	float n, m;
	
	ObtenerN(){
		System.out.println("Ingrese el valor de n");
		n=teclado.nextFloat();
		System.out.println("Ingrese el valor de m");
		m=teclado.nextFloat();
	}
	
	void potencia() {
		System.out.println(Math.pow(n, m));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObtenerN obj = new ObtenerN();
		obj.potencia();
		


	}

}
