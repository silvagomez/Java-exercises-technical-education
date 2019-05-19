package vehiculos;

import coches.*;
import motos.*;

public class VehiculoElectrico implements TipoVehiculo {

	public VehiculoElectrico() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Coche nuevoCoche(String m, String c, int p, float a) {
		// TODO Auto-generated method stub
		
		
		return new CocheElectrico(m,c,p,a);
	}

	@Override
	public Moto nuevaMoto(String m, String c, int p) {
		// TODO Auto-generated method stub
			
		return new MotoElectrica(m,c,p);
	}

}
