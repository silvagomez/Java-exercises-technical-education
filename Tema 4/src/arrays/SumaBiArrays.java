package arrays;
import java.util.Scanner;
public class SumaBiArrays {
	
	Scanner sc = new Scanner(System.in);
	
	byte fila,colum;
	byte[][] m1;
	byte[][] m2;
	byte[][] m3;
	byte[][] m4;
	

	SumaBiArrays() {
		
	}
	SumaBiArrays(byte n1, byte n2){
		fila=n1;
		colum=n2;
		m1= new byte[fila][colum];
		m2= new byte[fila][colum];
		m3= new byte[fila][colum];
		m4= new byte[fila][colum];
	}
	
	void setDataMatriz() {
		byte posFila=1, posColum=1;
		System.out.println("Ingrese la información de la Matriz A");
		for (int i = 0; i < m1.length; i++) {
			
			for (int j = 0; j < m1[i].length; j++) {
				
				System.out.print("Ingrese el dato "+posFila+","+posColum+" : ");
				m1[i][j]=sc.nextByte();
				posColum++;
			
			}
			
			posFila++;
			posColum=1;
		}
		
		System.out.println("Ingrese la información de la Matriz B");
		posFila=1;
		posColum=1;
		for (int i = 0; i < m1.length; i++) {
			
			for (int j = 0; j < m1[0].length; j++) {
				System.out.print("Ingrese el dato "+posFila+","+posColum+" : ");
				m2[i][j]=sc.nextByte();
				posColum++;
			}
			posFila++;
			posColum=1;
		}
	}
	void calcularSuma() {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m3[i][j]=(byte) (m1[i][j]+m2[i][j]);
			}
		}
	}
	void calcularResta() {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				m4[i][j]=(byte) (m1[i][j]-m2[i][j]);
			}
		}
	}
	
	void view() {
		calcularSuma();
		calcularResta();
		System.out.println("\t\t SUMA DE MATRICES");
		System.out.println("Matriz A:");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
					System.out.print(m1[i][j]+"\t");
					if(j==m1[i].length-1) {
						System.out.println();
					}
				}
				
			}
		System.out.println();
		System.out.println("Matriz B:");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[0].length; j++) {
					System.out.print(m2[i][j]+"\t");
					if(j==m1[i].length-1) {
						System.out.println();
					}
				}
				
			}
		System.out.println();
		System.out.println("Matriz A+B:");
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3[0].length; j++) {
					System.out.print(m3[i][j]+"\t");
				}
				
			}
		System.out.println();
		System.out.println("Matriz A-B:");
		for (int i = 0; i < m4.length; i++) {
			for (int j = 0; j < m4[0].length; j++) {
					System.out.print(m4[i][j]+"\t");
				}
				
			}		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		byte fila, colum;
		
		
		System.out.println("\t\t MATRICES");
		System.out.print("Ingrese el número de filas: ");
		fila=sc.nextByte();
		System.out.print("Ingrese el número de columnas: ");
		colum=sc.nextByte();
		
		SumaBiArrays obj = new SumaBiArrays(fila, colum);
		obj.setDataMatriz();
		obj.view();
		
		

	}

}
