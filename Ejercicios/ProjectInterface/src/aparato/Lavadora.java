package aparato;

public class Lavadora extends Aparato { //Lavadora es subclase de Aparato.Escribe bien lavadora
	private int alto;
	private int ancho;
	
	public Lavadora(int c, int p, int a, int an){//recibe los 4 parámetros)
	super(c,p);//aquí falta algo
	alto=a;
	ancho=an;
	}
	
	// escribir un método para visualizar el consumo.
	void visualizarConsumo() {
		System.out.println(consumo);
	}
	
	//por qué no se puede escribir un código para visualizar precio?. Por que es una variable private.
	//escribir el método para visualizar la marca
	void visualizarMarca() {
		System.out.println(marca);
		
	}


}
