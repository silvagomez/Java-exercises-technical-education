package aparato;

public class Tv extends Aparato{ //la subclase y la superclase no siguen con el convenio de escritura
	private boolean texto;
	private int antiguedad;
	
	public Tv(int c, int p, int a, boolean t){ //aquí hay algo mal
	
	super(c, p);
	texto=t;
	antiguedad=a;
	}

	void visualizarMarca() {
		System.out.println(marca);
		
	}
}
