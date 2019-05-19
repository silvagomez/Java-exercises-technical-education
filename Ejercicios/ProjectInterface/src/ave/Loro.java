package ave;
import comportamiento.Hablador;

public class Loro extends Ave implements Hablador{ //Hablador es un interface que est� en el package: comportamiento
	private char region;
	private String color;
	public Loro(char s, int e, char r, String c)
	{
		super(s,e);
		region=r;
		color=c;
	}
	public void hablar(){
		System.out.println("hola soy un Loro y se hablar");
		System.out.println("mi sexo es "+getSexo());
		System.out.println("tengo "+getEdad()+" a�os");
		System.out.println("soy de la region "+ region+ "y mi color es "+color);
	}

}
