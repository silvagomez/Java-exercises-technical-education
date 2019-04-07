package ejercicios;

import javax.swing.JOptionPane;

public class CuadradoApp {
	
	CuadradoApp(){
		
	}
	void ladocudrado() {
		String texto=JOptionPane.showInputDialog("Escribe el lado del cuadrado");
		int lado=Integer.parseInt(texto);
		cuadrado(lado);
		}
	
	void cuadrado(int lado) {
		int numerosastericos=lado;
		
		for (int cont=0; numerosastericos>cont;cont++) {
			System.out.print("*");
			 
		}
		System.out.println("");
		for(int cont=1;(numerosastericos-2)>=cont;cont++) {
			System.out.print("*");
			for(int i=0;(numerosastericos-2)>i;i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		for(int cont=0; numerosastericos>cont;cont++) {
			System.out.print("*");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuadradoApp obj = new CuadradoApp();
		obj.ladocudrado();

	}

}
