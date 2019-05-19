package arrays;
import java.util.*;
public class Vector {
	
	/*inicializar un vector con 10 números,
	 * metodo verificar orden: comprobar si los números están ordenados de menor a mayor y 
	 * visualizar el vector está ordenado o no*/
	
	int [] v = {1,2,3,4,5,6,7,8,9,10};
	boolean siNo = false;
	Vector(){
		
	}
	
	void verificar(){
		for (int i = 0; i < v.length-1 && siNo==false; i++) { //le restamos por que el último no tiene con quien comparar
			if(v[i] >= v[i+1]) {
				siNo = true;
			}
			else {
				
			}
		}
	}
	
	void view(){
		verificar();
		if(siNo == true) {
			System.out.println("No están ordenados");
		}
		else {
			System.out.println("Están ordenados");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector obj = new Vector();
		obj.view();

	}

}
