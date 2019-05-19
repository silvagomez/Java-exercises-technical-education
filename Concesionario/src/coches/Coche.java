package coches;
import vehiculos.*;

public abstract class Coche{
	
	/*
	El constructor recibe: modelo, color, potencia y anchura(float).
	Método abstracto verDatos() visualiza los datos de un coche.
	*/
	protected String modelo;
	protected String color;
	protected int potencia;
	protected float anchura;

	public Coche(String m, String c, int p, float a) {
		// TODO Auto-generated constructor stub
		
		modelo=m;
		color=c;
		potencia=p;
		anchura=a;
		
	}
	public abstract void verDatos();
	

	

}
