package coches;

public class CocheElectrico extends Coche{

	public CocheElectrico(String m, String c, int p, float a) {
		// TODO Auto-generated constructor stub
		super(m,c,p,a);
	}
	
	public void verDatos() {
		// TODO Auto-generated method stub
		System.out.println("Coche Electrico "+modelo+" "+color+" "+potencia+" "+anchura);
		
	}

}
