package ejercicios;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
	

		/*if(){
			
		}
		else {
			if(){
				
			}
			else {
				
			}
		}*/
		
		/*if(){
			
		}
		else if(){
			
		}
			else if(){
			
			}
				else {
					
				}*/
		
		//Declarar una variable a de tipo byte, inicializar un short (esto significa dar un valor)
		/*byte a;
		short b=8;
		char c='z';
		long d=1234L;
		int e;
		float f=145.3F;
		double g=354.34D;
		boolean h=true;
		String nombre="Diego Silva";
		
				if(d==8) {
					System.out.println("");
				}
				else {
					System.out.println("");
				}
				
				//
				if(c=='f') {
					System.out.println();
				}
				else {
				//
				}
				a=48;
				if(a>5) {
					System.out.println();
				}
				else {
					
				}
				//
				if((a+b)==8 && (a*c)>=30) {
					System.out.println();
				}
				else {
					
				}
				//
				if() {
					
				}
				else {
					
				}
				
				System.out.println();*/
				
		/*byte a=5,b,c;
		//int ;
		System.out.println("Ingresa un número");
		b=teclado.nextByte();
		
		c=(byte) ((byte)a+b);
		System.out.println(c=(byte) ((byte)a+b));*/
		
		byte n1,n2,n3;
		
		System.out.println("Ingrese un número");
		n1=teclado.nextByte();
		System.out.println("Ingrese un número");
		n2=teclado.nextByte();
		System.out.println("Ingrese un número");
		n3=teclado.nextByte();
		
			/*if(n1<10 && n2<10 && n3<10) {
				System.out.println(n1+","+n2+","+n3+" son menores de 10");
							}
			else {
				System.out.println("No todos son menores de 10");
			}*/
			
			/*if(n1<10) {
				System.out.println("Es menor de 10");
			}
			else {
				if(n2<10) {
					System.out.println("Es menor de 10");
				}
				else {
					if(n3<10) {
						System.out.println("Es menor de 10");
					}
					else {
						System.out.println("No son menores de 10");
					}
				}
			}*/
			//Algún valor es menor de 10
			
			/*if(n1<10||n2<10||n3<10){
				System.out.println("Algún valor es menor de 10");	
			}
			else
				System.out.println("No son menores de 10");*/
			
			if(n1<110) {
				if(n2<10) {
					if(n3<10) {
						System.out.println("Algún valor es menor a 10");
					}
				}
			}
			else{
				System.out.println("Son mayores de 10");
			}
		
	}
}
/*Teclear 3 números (Byte), si los valores tecleados son menores a 10, vizualizar todos son menores*/