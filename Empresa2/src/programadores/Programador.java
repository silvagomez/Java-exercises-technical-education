package programadores;
import empleados.*;

public class Programador extends Empleado{
	
	/*Clase Programador:
		Atributo: lenguajeDominante (por ejemplo: Java, SQL,PHP,…), provincia donde vive el programador.
		Método posiblesDestinos()
			Si lenguajeDominante es java y provincia Bizkaia el destino es Bizkaia
			Si lenguajeDominante es java y provincia Gipuzkoa el destino es Bizkaia
			Si lenguajeDominante es java y provincia Araba el destino es Bizkaia
			Si lenguajeDominante es SQL y provincia Bizkaia el destino es Bizkaia
			Si lenguajeDominante es SQL y provincia Gipuzkoa el destino es Gipuzkoa
			Si lenguajeDominante es SQL y provincia Araba el destino es Araba*/
	
	private String lenguajeDominante;
	private String provincia;

	protected Programador(String n, String a, int t, byte e, boolean c, float s, String l, String p) {
		// TODO Auto-generated constructor stub
		super(n,a,t,e,c,s);
		lenguajeDominante=l;
		provincia=p;
	}
	
	protected void posiblesDestinos() {
		if(lenguajeDominante.equalsIgnoreCase("Java") && provincia.equalsIgnoreCase("Bizkaia")){
			System.out.print("El destino es Bizkaia");
		}
		else if (lenguajeDominante.equalsIgnoreCase("Java") && provincia.equalsIgnoreCase("Gipuzkoa")){
			System.out.print("El destino es Bizkai");
		}
		else if (lenguajeDominante.equalsIgnoreCase("Java") && provincia.equalsIgnoreCase("Araba")) {
			System.out.print("El destino es Bizkaia");
		}
		else if (lenguajeDominante.equalsIgnoreCase("SQL") && provincia.equalsIgnoreCase("Bizkai")) {
			System.out.println("El destino es Bizkaia");
		}
		else if (lenguajeDominante.equalsIgnoreCase("SQL") && provincia.equalsIgnoreCase("Gipuzkoa")){
			System.out.print("El destino es Gipuzkoa");
		}
		else if (lenguajeDominante.equalsIgnoreCase("SQL") && provincia.equalsIgnoreCase("Araba")) {
			System.out.print("El destino es Araba");
		}
		
	}
	
	public static void main(String[] args) {
		/*Clase Empleado abstracto y en main() está en Programador, Crear 2 packages.
		 * Utilizar los modificadores de acceso más restrictivos en todos los casos*/
		
		//Empleado emp1 = new Empleado("Diego", "Silva", 8106658, (byte) 15, false, 100);
		Programador pro1 = new Programador("Camilo", "Gómez", 2162885, (byte)24, true, 500, "JAVA", "bIZKAIA");
		
		//emp1.visualizarDatosEmpleado();
		pro1.visualizarDatosEmpleado();
		pro1.posiblesDestinos();
	}

}
