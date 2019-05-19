package arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SumaBiArraysDW {
	
	Scanner sc = new Scanner(System.in);
	
	int fila,colum, auxf=0, auxc=0;
	String ma1="Matriz A", ma2="Matriz B", ma3="Matriz A+B", ma4="Matriz A-B";
	

	
	
	SumaBiArraysDW(){
		
	}
	
	void setDatosMatriz(int[][]m,  String ma) {
		auxf=1;
		auxc=1;
		
		
			for (int i = 0; i < m.length; i++) {
				
				auxc=1;	
				for (int j = 0; j < m[i].length; j++) {
					m[i][j]=Integer.parseInt(JOptionPane.showInputDialog(ma+": Valor posición ["+auxf+"] ["+auxc+"]"));
					auxc++;
					
				}
				auxf++;
			}
			
	}
	
	void calcularSuma(int[][]m1, int[][]m2, int[][]m3) {
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m3[i][j]=(byte) (m1[i][j]+m2[i][j]);
			}
		}
		
	}
	
	void generarSalida(int[][] m, String titulo) {
		String salida ="";
		salida+=titulo+":\n";
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				salida+= m[i][j]+"\t";
			}
			salida+="\n";
		}
		salida+="\n";
		JTextArea areaSalida= new JTextArea();
		areaSalida.setText(salida);

		JOptionPane.showMessageDialog(null, areaSalida, "Suma de Matrices", JOptionPane.INFORMATION_MESSAGE);
		salida+="\n";
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ma1="Matriz A", ma2="Matriz B", ma3="Matriz A+B", ma4="Matriz A-B";
		
		int fila=0,colum=0;
		
		
		
		fila=Integer.parseInt(JOptionPane.showInputDialog("Número de filas de las matrices"));
		colum=Integer.parseInt(JOptionPane.showInputDialog("Número de columnas de las matrices:"));
		
		int[][] m1= new int[fila][colum];
		int[][] m2= new int[fila][colum];
		int[][] m3= new int[fila][colum];
		int[][] m4= new int[fila][colum];
		
		SumaBiArraysDW obj = new SumaBiArraysDW();
		obj.setDatosMatriz(m1, ma1);
		obj.setDatosMatriz(m2, ma2);
		obj.calcularSuma(m1, m2, m3);
		obj.generarSalida(m1, ma1);
		obj.generarSalida(m2, ma2);
		obj.generarSalida(m3, ma3);
		
		

	}

}
