package aparato;

abstract class Aparato { // �sta clase debe ser visible s�lo en el  package aparato y no es instanciable
	protected int consumo; // se puede usar en las subclases de Aparato y en el mismo package
	private int precio; //s�lo se puede usar en la clase Aparato
	public String marca="Standard";//se puede usar en cualquier clase
	
	public Aparato(int c, int p){
	consumo=c;
	precio=p;
	}

	//crear un m�todo abstracto llamado visualizarMarca()
	abstract void visualizarMarca();
	

}
