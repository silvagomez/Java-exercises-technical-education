package coches;

public class CocheGasolina extends Coche{

	public CocheGasolina(String m, String c, int p, float a) {
		// TODO Auto-generated constructor stub
		super(m,c,p,a);
	}
	
	public void verDatos() {
		// TODO Auto-generated method stub
		System.out.println("Coche Gasolina "+modelo+" "+color+" "+potencia+" "+anchura);
		
	}

}
