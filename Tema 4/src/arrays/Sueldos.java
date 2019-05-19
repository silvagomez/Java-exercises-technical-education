package arrays;
import java.util.*;

public class Sueldos {
	
	/*crear dos arrays de tipo float que van a contener el sueldo de 4 empleados de turno de mañana, 
	y el sueldo de 4 empleados de turno de tarde
	metodo teclear, teclear los sueldos utilizando for uno para mañana y otro para tarde
	metodo visualiazr con un solo for, visualizar todos los sueldos*/
	
	Scanner sc = new Scanner(System.in);
	
	float[] empDia = new float [4];
	float[] empNoct = new float [4];
	int x, y;
	
	Sueldos(){
		
	}
	
	void setSueldo(){
		for(x=0; x<empDia.length; x++) {
			System.out.print("TECLEAR SUELDOS TURNO DIA:	");
			empDia[x]=sc.nextFloat();
		}
		System.out.println("-------");
		for(y=0; y<empNoct.length; y++) {
			System.out.print("TECLEAR SUELDOS TURNO NOCHE:	");
			empNoct[y]=sc.nextFloat();
		}
		
	}
	
	void view(){
		for(int z=0; z<empDia.length; z++) {
			System.out.println("SUELDOS DIAS "+empDia[z]);
			System.out.println("SUELDOS NOCHE "+empNoct[z]);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sueldos obj = new Sueldos();
		obj.setSueldo();
		obj.view();

	}

}

