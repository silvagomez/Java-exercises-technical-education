package aparato;

public class Lavadora extends Aparato { //Lavadora es subclase de Aparato.Escribe bien lavadora
	private int alto;
	private int ancho;
	
	public Lavadora(int c, int p, int a, int an){//recibe los 4 par�metros)
	super(c,p);//aqu� falta algo
	alto=a;
	ancho=an;
	}
	
	// escribir un m�todo para visualizar el consumo.
	void visualizarConsumo() {
		System.out.println(consumo);
	}
	
	//por qu� no se puede escribir un c�digo para visualizar precio?. Por que es una variable private.
	//escribir el m�todo para visualizar la marca
	void visualizarMarca() {
		System.out.println(marca);
		
	}


}
