package packExcepciones;

public class Ejer3_8 {
	
	public Ejer3_8() {
		// TODO Auto-generated constructor stub
	}
	
	String[] alumnos={"Marta","Jos�","F�tima","Ane"};
	
	void visualizar()throws Exception{ // El m�todo visualizar lanza una excepci�n
		for(int x=0;x<=4;x++){
			System.out.println(alumnos[x]);
		}
	}
	void calcular() throws Exception {
		visualizar();
	}


	public static void main(String[] args) {
		Ejer3_8 obj=new Ejer3_8();
		try {
			obj.calcular();
		}
		catch (Exception e) {
			System.out.println("no hay m�s alumnos");
		}
	}	
}
