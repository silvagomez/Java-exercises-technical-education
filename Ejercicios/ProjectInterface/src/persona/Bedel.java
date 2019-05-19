package persona;
import comportamiento.Hablador;
public class Bedel extends Persona implements Hablador{
	 int turno; //sólo se puede usar en Bedel
	 int antiguedad; //sólo se puede usar en Bedel
	public Bedel(String n, String a, int t, int ant){
		//escribe el código
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
