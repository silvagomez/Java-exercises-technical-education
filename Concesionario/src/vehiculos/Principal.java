package vehiculos;
import vehiculos.*;
import coches.*;
import motos.*;
import java.util.ArrayList;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		ArrayList<Vehiculo> carros = new ArrayList<Vehiculo>();
		
		Vehiculo motoNija = new MotoGasolina ("Ninja","Blanco",900);
		Vehiculo ecoMt = new MotoElectrica ("Eco","Verde",500);
		Vehiculo bmw = new CocheElectrico ("Z6","Azul",9000,230.5f);
		Vehiculo mustang = new CocheGasolina ("Horse","Rojo",15000,278.5f);
		
		carros.add(motoNija);
		carros.add(mustang);
		carros.add(ecoMt);
		carros.add(bmw);
		carros.add(nuevoCoche());
		
		for(Vehiculo x: carros) {
			x.verDatos();
		}
	*/
		TipoVehiculo c1 = new VehiculoElectrico();
		TipoVehiculo c2 = new VehiculoElectrico();
		
		//c2.nuevoCoche("Z4","Rojo",1500,20.5f).verDatos();
		
		MotoGasolina motoNija = new MotoGasolina ("Ninja","Blanco",900);
		MotoElectrica ecoMt = new MotoElectrica ("Eco","Verde",500);
		CocheElectrico bmw = new CocheElectrico ("Z6","Azul",9000,230.5f);
		CocheGasolina mustang = new CocheGasolina ("Horse","Rojo",15000,278.5f);
		
		ArrayList<Moto> motorun = new ArrayList<Moto>();
		ArrayList<Coche> carrorun = new ArrayList<Coche>();
		
		//ArrayList<TipoVehiculo> v1 = new ArrayList<TipoVehiculo>();
		
		//motorun.add((TipoVehiculo) motoNija);
		//motorun.add((TipoVehiculo) ecoMt);
		
		carrorun.add(c1.nuevoCoche("Z6","Azul",9000,230.5f));
		carrorun.add(mustang);
		
		
		for(Coche x: carrorun) {
			x.verDatos();
		}

	}

}
