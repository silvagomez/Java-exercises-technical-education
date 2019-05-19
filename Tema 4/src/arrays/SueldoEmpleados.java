package arrays;
import java.util.*;
public class SueldoEmpleados {
	
	/*Crear dos arrays en el main con los nombres de 5 empleados y otro con los suledos
	 * El constructor recibe los 2 arrays
	 * Metodo view, visualizar el nombre y el sueldo en la misma linea
	 */
	
	String [] nombre;
	String [] apel = new String[2];
	float [] sueldo;
	
	SueldoEmpleados(){
		
	}
	
	SueldoEmpleados(String nom[], float sueldo[]){
		nombre=nom;
		this.sueldo=sueldo;
	}
	
	void setData(String apel[]){
		this.apel=apel;
	}
	
	void view1(){
		for (int i = 0; i < 5; i++) {
			System.out.print("Nombre: "+nombre[i]+" y su sueldo es : "+sueldo[i]+ "\n");
		}
	}
	
	void view2() {
		for (int i = 0; i < apel.length; i++) {
			System.out.println("Apellido: "+apel[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nom = {"AAA", "BBB", "CCC", "DDD", "EEE"};
		float[] sueldo = {10.1f, 5.5f, 8.88f, 0.24f, 1992.01f};
		String[] apellido = {"Silva", "Gómez"};
		
		
		SueldoEmpleados obj = new SueldoEmpleados(nom, sueldo);
		obj.view1();
		obj.setData(apellido);
		obj.view2();
		apellido[0]= "Arias";
		obj.view2();
		

	}

}
