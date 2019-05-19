package programas;
import empleados.Empleado;
import programadores.Programador;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear instancias de la clase Empleado y de la clase Programador y acceder a los métodos de una forma lógica.
		
		Empleado emp1 = new Empleado("Diego", "Silva", 8106658, (byte) 15, false, 100);
		Programador pro1 = new Programador("Camilo", "Gómez", 2162885, (byte)24, true, 500, "JAVA", "bIZKAIA");
		
		emp1.visualizarDatosEmpleado();
		pro1.visualizarDatosEmpleado();
		pro1.posiblesDestinos();
		
		
		Empleado[] pro2 = {new Programador("Alicia", "Gómez", 6272103, (byte)58, true, 300, "sql", "Araba"),
				new Empleado("Camilo", "Motta", 1234567, (byte)31, true, 200),
				new Programador("Carlos", "Gómez", 2474900, (byte)38, false, 300, "sql", "Bizkaia"),
				new Empleado("Vicky", "Port", 7654321, (byte)30, true, 200)};
		for (int i = 0; i < pro2.length; i++) {
			pro2[i].visualizarDatosEmpleado();
		}

	}

}
