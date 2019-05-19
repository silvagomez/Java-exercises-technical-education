package arrays;
import java.util.Scanner;

public class Temperatura {
	
	Scanner sc = new Scanner(System.in);
	
	String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
	float[][] data = {{8f, 10f, 4f, 8f}, {9f, 7f, 13f, 13f}, {11f, 15f, 15f, 16f},{14f, 16f, 20f, 13f}, {17f, 15f, 18f, 19f},
				{19f, 20f, 25f, 22f}, {23f, 33f, 28f, 29f}, {28f, 25f, 27f, 23f}, {22f, 25f, 20f, 21f,}, {20f, 18f, 20f, 19f},
				{17f, 13f, 15f, 12f}, {12f, 11f, 8f, 9f}};
	float[] dataMes = new float[12];
	float dataAno;
	
	int filas = data.length; //12
	int columnas = data[0].length; //4
	
	Temperatura() {
		System.out.println(filas +" "+columnas);
	}
	
	void viewData() {
		int semana = 0;
		
		System.out.println("\t\t TEMPERATURA");
		
			for (int i = 0; i <data.length; i++) {
				System.out.println("Temperaturas de "+mes[i]);
				semana=1;
				for (int j = 0; j < data[0].length; j++) {
					System.out.print("Temperatura media de la semana "+semana+" del mes de "+mes[i]+" : "+data[i][j]+"\n");
					semana++;
				}
				System.out.println();
			}
			

		}
	void opData2() {
		float aux=0;
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				aux +=data[i][j];
			}
			dataMes[i]=aux/4;
		}
	}
	
	void viewData2() {
		opData2();
		System.out.println("\t\t TEMPERATURA PROMEDIO DE CADA MES");
		for (int i = 0; i < data.length; i++) {
			System.out.print("Temperatura promedio del mes de "+mes[i]+" es: "+dataMes[i]+"\n");
		}
	}
	
	void opData3() {
		float aux=0;
		for (int i = 0; i < data.length; i++) {
			aux+=dataMes[i];
		}
		dataAno=aux/12;
	}
	
	void viewData3() {
		opData3();
		System.out.println("\t\t TEMPERATURA PROMEDIO DEL AÑO");
		System.out.println("La temperatura es: "+dataAno);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperatura t = new Temperatura();
		t.viewData();
		t.viewData2();
		t.viewData3();

	}

}
