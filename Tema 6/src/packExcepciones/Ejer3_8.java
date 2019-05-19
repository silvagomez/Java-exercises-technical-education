package packExcepciones;

public class Ejer3_8 {
	
	public Ejer3_8() {
		// TODO Auto-generated constructor stub
	}
	
	String[] alumnos={"Marta","José","Fátima","Ane"};
	
	void visualizar()throws Exception{ // El método visualizar lanza una excepción
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
			System.out.println("no hay más alumnos");
		}
	}	
}
