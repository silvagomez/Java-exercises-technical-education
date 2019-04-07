package mathematics;

import java.util.Scanner;

public class AdivinaPilar {
	char oculto1='a', oculto2='7', oculto3='.', car, tecla;
	final int NUMOCUL=3;
	int aux, cont=0;
	boolean sw=false;
	
	Scanner t = new Scanner(System.in);
	
	void primerFallo() {
		System.out.println("Primer fallo. Te quedan 2 intentos");
	}
	
	void segundoFallo() {
		System.out.println("Segundo fallo. Te queda 1 intento");
	}
	
	void tercerFallo() {
		System.out.println("Tercer fallo");
	}
	
	void fallos(){
		if(cont==1) primerFallo();
		else if(cont==2) segundoFallo();
		else tercerFallo();
	}
	
	void generarNumeroAleatorio() {
		aux=1+(int)(Math.random()*NUMOCUL);
		if(aux==1) car=oculto1;
		else if (aux==2) car=oculto2;
		else car=oculto3;
	}
	
	void adivinar() {
		System.out.println("     ________________________________");
		System.out.println("     ||                            ||");
		System.out.println("     || Adivina el caracter oculto ||");
		System.out.println("     ||    Teclea un carácter      ||");
		System.out.println("     ||                            ||");
		System.out.println("     ||____________________________||");
		
		do {
			tecla=t.next().charAt(0);
			if(tecla==car) {
				System.out.println("Correcto");
				sw=true;
			}
			else {
				cont++;
				fallos();
				if(cont==3) 
					System.out.println("Se acabó el juego. El carácter oculto ha sido: "+car);
				else
					System.out.println("Intentalo otra vez");
				
			}
		}
		while(cont<3 && sw==false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdivinaPilar obj= new AdivinaPilar();
		obj.generarNumeroAleatorio();
		obj.adivinar();

	}

}
