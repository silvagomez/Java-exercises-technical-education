package futbol;
import futbol.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
		
		SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		//List <SeleccionFutbol> clase = new ArrayList <SeleccionFutbol>();
		
		
		
		for (SeleccionFutbol x:integrantes) {
			System.out.println(x.getNombre()+" "+x.getApellido());
		}
		
		for (SeleccionFutbol y:integrantes) {
			System.out.println();
			y.viajar();
		}

	}
	
	  

}
