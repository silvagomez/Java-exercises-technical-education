package maxMin;

import java.util.Scanner;

public class MayorMenor {
	
	Scanner teclado= new Scanner(System.in);
	
	byte n1, n2, n3;
	
	MayorMenor(){
		System.out.println("A continuación ingresará 3 números diferentes");
		System.out.println("Ingrese el primer valor");
		n1=teclado.nextByte();
		do{
			System.out.println("Ingrese el segundo valor");
			n2=teclado.nextByte();
		}
		while(n1==n2);
		
		do {
			System.out.println("Ingrese el tercer valor");
			n3=teclado.nextByte();
		}
		while(n3==n2 || n3==n1);
		
	}
	
	void calculoMayor() {
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" es el mayor");
		}
		else {
			if(n2>n1 && n2>n3) {
				System.out.println(n2+ " es el mayor");
			}
			else {
				if(n3>n1 && n3>n2) {
					System.out.println(n3+" es el mayor");
				}
				else {
					
				}
			}
		}
	}
	
	void calculoMenor() {
		if(n1<n2 && n1<n3) {
			System.out.println(n1+" es el menor");
		}
		else {
			if(n2<n1 && n2<n3) {
				System.out.println(n2+ " es el menor");
			}
			else {
				if(n3<n1 && n3<n2) {
					System.out.println(n3+" es el menor");
				}
				else {
					
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MayorMenor n1= new MayorMenor();
		n1.calculoMayor();
		n1.calculoMenor();

	}

}
