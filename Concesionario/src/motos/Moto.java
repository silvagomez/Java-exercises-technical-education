package motos;
import vehiculos.*;

public abstract class Moto{
	
	/*
	El constructor recibe: modelo, color y potencia.
	Método abstracto verDatos() visualiza los datos de una moto.
	*/
	protected String modelo;
	protected String color;
	protected int potencia;
	

	public Moto(String m, String c, int p) {
		// TODO Auto-generated constructor stub
		modelo=m;
		color=c;
		potencia=p;
	}

	protected abstract void verDatos();

}
