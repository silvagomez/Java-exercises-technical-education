package packExcepciones;

public class Ejer3_3 {

	public Ejer3_3() {
		// TODO Auto-generated constructor stub
	}
	
	String[] alumnos={"Marta","José","Fátima","Ane"};
	
	String getMessage() {
		
		return null;
	}
	
	void visualizar(){
		try{
			for(int x=0;x<=4;x++){
				System.out.println(alumnos[x]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("no hay más alumnos");
			System.out.println(getMessage());
			
			
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejer3_3 obj=new Ejer3_3();
		obj.visualizar();

	}

}
