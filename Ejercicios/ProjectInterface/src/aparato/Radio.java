package aparato;

public class Radio extends Aparato{ //Escribe bien
	private boolean casete;
	private int potencia;
	
	public Radio(int c, int p, boolean ca, int po){
		super(c,p);
		casete=ca;
		potencia=po;
	//implementar este Constructor
	}

	void visualizarMarca() {
		System.out.println(marca);
		
	}
}
