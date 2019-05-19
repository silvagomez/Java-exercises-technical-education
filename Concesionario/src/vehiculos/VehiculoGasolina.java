package vehiculos;

import coches.*;
import motos.*;

public class VehiculoGasolina implements TipoVehiculo {

	public VehiculoGasolina() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Coche nuevoCoche(String m, String c, int p, float a) {
		// TODO Auto-generated method stub
		
		return new CocheGasolina(m,c,p,a);
	}

	@Override
	public Moto nuevaMoto(String m, String c, int p) {
		// TODO Auto-generated method stub
		return new MotoGasolina(m,c,p);
	}

}
