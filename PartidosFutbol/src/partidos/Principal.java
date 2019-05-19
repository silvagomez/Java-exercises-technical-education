package partidos;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();
		
		File fichero = new File("partidos.txt");
		Scanner s = null;
		
		try{
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);
			
			// Obtengo los datos de los partidos de fútbol del fichero
			while (s.hasNextLine()){
				String linea = s.nextLine();// Obtengo una linea del fichero (un partido de fútbol)
				String [] cortarString = linea.split("::"); // Obtengo los datos del partido de futbol
				PartidoFutbol partido = new PartidoFutbol(); // Creo un objeto de la clase "PartidoFutbol"
				
			// Pongo los atributos al objeto "partido"
				partido.setEquipoLocal(cortarString[0]);
				partido.setEquipoVisitante(cortarString[1]);
				partido.setGolesLocal(Integer.parseInt(cortarString[2]));
				partido.setGolesVisitante(Integer.parseInt(cortarString[3]));
				
			// Añadimos el objeto "partido" al ArrayList
				partidos.add(partido);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if (s != null)
					s.close();
		} catch (Exception e2) {
			e2.printStackTrace();
			}
		}
		//codifica el syso para que salga: ... Guardados 50 partidos de fútbol ...
		System.out.println(partidos.size());
		// Imprimimos los elementos del ArrayList
		System.out.println("\n... Resultados de los partidos de Futbol ...");
		
		Iterator<PartidoFutbol> it = partidos.iterator();
		while (it.hasNext()) {
			PartidoFutbol partido=it.next();
			System.out.println(partido.getEquipoLocal()+" "+partido.getGolesLocal()+" "+partido.getGolesVisitante()+" "+partido.getEquipoVisitante());
			
			//System.out.print(it.next().getEquipoLocal()+" ");
			//System.out.print(it.next().getGolesLocal()+" ");
			//System.out.print(it.next().getGolesVisitante()+" ");
			//System.out.println(it.next().getEquipoVisitante());
			//System.out.println(it.next());
			//it.next().visualizarDatos();
			
		}

	}

}
