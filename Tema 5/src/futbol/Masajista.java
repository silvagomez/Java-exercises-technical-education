package futbol;

public class Masajista extends SeleccionFutbol{

	private String titulacion;
	private int anhosExperiencia;
	
	Masajista(int i, String n, String a, int e, String t, int an) {
		// TODO Auto-generated constructor stub
		super(i, n, a, e);
		titulacion=t;
		anhosExperiencia=an;
	}
	
	void darMasaje() {
		
	}

	@Override
	public void entrenamiento() {
		// TODO Auto-generated method stub
		
	}
	


}
