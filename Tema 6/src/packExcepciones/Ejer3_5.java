package packExcepciones;

public class Ejer3_5 {

	public Ejer3_5() {
		// TODO Auto-generated constructor stub
	}
	
	String[] alumnos={"Marta","Jos�","F�tima","Ane"};
	
	void visualizar()throws Exception { // El m�todo visualizar lanza una excepci�n
		for(int x=0;x<=4;x++){
			System.out.println(alumnos[x]);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Ejer3_5 obj=new Ejer3_5();
		obj.visualizar(); //necesita throws o try{}catch()

	}

}
