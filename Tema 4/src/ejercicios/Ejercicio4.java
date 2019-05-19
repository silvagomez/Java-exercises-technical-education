package ejercicios;

public class Ejercicio4 {
	
	/*Crear un array de 500 elementos y visualizarlo, para evitar tener que teclear 500 números utilizar la clase Math.*/
	
	int[] num = new int[500];
	
	Ejercicio4(){
		
	}
	
	void view() {
		short cont = 1;
		System.out.println("PRUEB DE 500 NÚMEROS");
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)(Math.random()*3);
			System.out.println(cont+": "+num[i]);
			cont++;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejercicio4 obj = new Ejercicio4();
		obj.view();

	}

}
