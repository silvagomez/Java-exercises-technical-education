package mathematics;
import java.util.Scanner;
import java.util.Random;

public class Adivinar {
	
	Scanner t = new Scanner(System.in);
	Random r = new Random();
	
	Adivinar(){
		
	}
	
	void opc1() {
		char v1='4', v2=';', v3='d', o, continuar='s';
		double r;
		byte cont;
		String fallo;
		
		while(continuar=='s') {
			cont=3;
			r=(int)(Math.random()*3+1);
			
			System.out.println("ADIVINAR EL CARACTER OCULTO");
			
			switch ((int)r) {
			case 1:
				//System.out.println(r);
				
				do {
					System.out.println("Teclea un caracter1");
					o=t.next().charAt(0);
					if(o==v1) {
						System.out.println("Correcto");
						cont=0;
					}
					else {
						cont--;
						if(cont==2) {
							fallo="Primer";
							System.out.println(fallo+" fallo, te quedan "+cont+" intentos");
						}
						if(cont==1) {
							fallo="Segundo";
							System.out.println(fallo+" fallo, te quedan "+cont+" intentos");
						}
						
						if(cont==0) {
							fallo="Tercer";
							System.out.println(fallo+" fallo");
							System.out.println("El caracter oculto es "+v1);
						}
					}
				}
				while(cont<=3 && cont>=1);
				System.out.println("Desea volver a jugar s/n");
				continuar=t.next().charAt(0);
				break;
			case 2:
				//System.out.println(r);
				do {
					System.out.println("Teclea un caracter2");
					o=t.next().charAt(0);
					if(o==v2) {
						System.out.println("Correcto");
						cont=0;
					}
					else {
						cont--;
						System.out.println("Fallaste, te quedan "+cont+" intentos"); 
						
						if(cont==0) {
							System.out.println("El caracter oculto es "+v2);
						}
					}
				}
				while(cont<=3 && cont>=1);
				System.out.println("Desea volver a jugar s/n");
				continuar=t.next().charAt(0);
				break;
			case 3:
				//System.out.println(r);
				do {
					System.out.println("Teclea un caracter2");
					o=t.next().charAt(0);
					if(o==v2) {
						System.out.println("Correcto");
						cont=0;
					}
					else {
						cont--;
						System.out.println("Fallaste, te quedan "+cont+" intentos"); 
						
						if(cont==0) {
							System.out.println("El caracter oculto es "+v2);
						}
					}
				}
				while(cont<=3 && cont>=1);
				System.out.println("Desea volver a jugar s/n");
				continuar=t.next().charAt(0);
				break;
			default:
				break;
			}		
		}
		System.out.println("Adios");
	}
	
	void opc2() {
		char a, v, continua='s';
		double total;
		byte cont;
		
		total=(int) (Math.random()*3+1);
		System.out.println(total);
		a=(char)(r.nextInt('z' - 'a')+'a');
		System.out.println(a);
		
		while(continua=='s') {
			cont=3;
			System.out.println("ADIVINAR EL CARACTER OCULTO");
			do {
				System.out.println("Ingresa un caracter");
				v=t.next().charAt(0);
				if(v==a) {
					System.out.println("Correcto");
					cont=0;
				}
				else {
					cont--;
					System.out.println("Fallaste, te quedan "+cont+" intentos"); 
					
					if(cont==0) {
						System.out.println("El caracter oculto es "+a);
					}
				}
				
			}
			while(cont>=1 && cont<=3);
			System.out.println("Desea volver a jugar s/n");
			continua=t.next().charAt(0);
			
		}
		System.out.println("See you later");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Adivinar adv = new Adivinar();
		adv.opc1();
		//adv.opc2();
	
		

	}

}
