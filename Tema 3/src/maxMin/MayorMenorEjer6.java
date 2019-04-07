package maxMin;

import java.util.Scanner;

public class MayorMenorEjer6 {
	
Scanner teclado= new Scanner(System.in);
	
	byte n1, n2, n3;
	
	MayorMenorEjer6(){
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
	
	int calculoMayor() {
		int mayor=0;
		if(n1>n2 && n1>n3) {
			//System.out.println(n1+" es el mayor");
			mayor=n1;
		}
		else {
			if(n2>n1 && n2>n3) {
				//System.out.println(n2+ " es el mayor");
				mayor=n2;
			}
			else {
				if(n3>n1 && n3>n2) {
					//System.out.println(n3+" es el mayor");
					mayor=n3;
				}
				else {
					
				}
			}
		}
		
		return mayor;
	}
	
	int  calculoMenor() {
		int menor=0;
		if(n1<n2 && n1<n3) {
			//System.out.println(n1+" es el menor");
			menor=n1;
		}
		else {
			if(n2<n1 && n2<n3) {
				//System.out.println(n2+ " es el menor");
				menor=n2;
			}
			else {
				if(n3<n1 && n3<n2) {
					//System.out.println(n3+" es el menor");
					menor=n3;
				}
				else {
					
				}
			}
		}
		return menor;
	}
	
	void visualizar() {
		System.out.println("El número mayor es "+calculoMayor());
		System.out.println("El númrero menor es "+calculoMenor());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MayorMenorEjer6 n = new MayorMenorEjer6();
		n.visualizar();

	}

}
