package vehiculos;
import coches.*;
import motos.*;

public interface TipoVehiculo{
	
	public abstract Coche nuevoCoche(String m, String c, int p, float a);
	
	
	public abstract  Moto nuevaMoto(String m, String c, int p);

	

}
