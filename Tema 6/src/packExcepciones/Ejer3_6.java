package packExcepciones;

public class Ejer3_6 {
	
	public Ejer3_6() {
		// TODO Auto-generated constructor stub
	}
	
	String[] alumnos={"Marta","Jos�","F�tima","Ane"};
	
	void visualizar()throws Exception{ // El m�todo visualizar lanza una excepci�n
		for(int x=0;x<=4;x++){
			System.out.println(alumnos[x]);
		}
	}


	public static void main(String[] args) {
		Ejer3_6 obj=new Ejer3_6();
		try {
			obj.visualizar();
		}
		catch (Exception e) {
			System.out.println("no hay m�s alumnos");
		}
	}	
}
