package ejercicios;

import java.util.Scanner;

public class Impresoras {
	
	Scanner teclado = new Scanner(System.in);
	String marca, conect;
	int velPrint, bufferMemoria;
	float peso;
	char col;
	
	Impresoras() {
		System.out.println("DATOS DE SU IMPRESORA");
		System.out.println("Ingrese la marca");
		marca=teclado.nextLine();
		System.out.println("Ingrese la velocidad de impresión (Páginas por minuto)");
		velPrint=teclado.nextInt();
		System.out.println("Ingrese el peso");
		peso=teclado.nextFloat();
		System.out.println("Ingrese el buffer de la memoria (MB)");
		bufferMemoria=teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese la interfaz de conexión");
		conect=teclado.nextLine();
	}
	
	void setColor() {
		/*System.out.println("Eliga un color");
		System.out.println("Rojo       r");
		System.out.println("Verde      v");
		System.out.println("Azul       a");
		System.out.println("Blanco     b");
		System.out.println("Negro      n");
		col=teclado.next().charAt(0);*/
		while(col!='r' && col!='v'&& col!='a' && col!='b' && col!='n') {
			System.out.println("Ingrese correctamente el color");
			System.out.println("Rojo       r");
			System.out.println("Verde      v");
			System.out.println("Azul       a");
			System.out.println("Blanco     b");
			System.out.println("Negro      n");
			col=teclado.next().charAt(0);
		}
		
		
		
	}
	
	void getColor1() {
		System.out.println("La marca de la impresora es " +marca);
		if(col=='r') {
			System.out.println("Color de la impresora es Rojo");
		}
		else {
			if(col=='v') {
				System.out.println("Color de la impresora Verde");
			}
			else {
				if(col=='a') {
					System.out.println("Color de la impresora Azul");
				}
				else {
					if(col=='b') {
						System.out.println("Color de la impresora Blanco");
					}
					else {
						if(col=='n') {
							System.out.println("Color de la impresora Negro");
						}
						else {
							
						}
					}
				}
			}
		}
	}
	
	void getColor2() {
		System.out.println("La marca de la impresora es "+marca);
		System.out.println("El peso de la impresora es "+peso+" gramos");
		switch (col) {
		case 'r':
			System.out.println("Color de la impresora Rojo");
			break;
		case 'v':
			System.out.println("Color de la impresora Verde");
			break;
		case 'a':
			System.out.println("Color de la impresora Azul");
			break;
		case 'b':
			System.out.println("Color de la impresora Blanco");
			break;
		case 'n':
			System.out.println("Color de la impresora Negro");
			break;

		default:
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Impresoras print1 = new Impresoras();
		print1.setColor();
		//print1.getColor1();
		//print1.getColor2();
		System.out.println("");
		/*Impresoras print2 = new Impresoras();
		print2.setColor();
		print2.getColor1();
		print2.getColor2();*/
		

	}

}
