package persona;
import comportamiento.Hablador;
public class Bedel extends Persona implements Hablador{
	 int turno; //s�lo se puede usar en Bedel
	 int antiguedad; //s�lo se puede usar en Bedel
	public Bedel(String n, String a, int t, int ant){
		//escribe el c�digo
		super(n,a);
		turno=t;
		antiguedad=ant;
	}
	
	// En esta clase falta algo
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}


}
