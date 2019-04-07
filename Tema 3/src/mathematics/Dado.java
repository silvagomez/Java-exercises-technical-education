package mathematics;

public class Dado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que simule 20 lanzaminetos de un dado de 6 caras y visualice el valor de cada tirada
		
		int n=1;
		while(n<=20){
			
			System.out.println(((int) ((Math.random()*6)+1))); //Corrección la suma 1 va antes del casting
			n++;
		}

	}

}
