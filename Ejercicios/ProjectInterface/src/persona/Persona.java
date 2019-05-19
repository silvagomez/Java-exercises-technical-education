package persona;

abstract class Persona { //ésta clase es abstracta
	
	private String nombre;
	private String apellido;
	static int numP;

	public Persona(String n, String a){ //qué falta)

		nombre=n;
		apellido=a;
	//falta algo
		
		numP();
	}
	
	//escribe los métodos getNombre() y getApellido()
	//y dichos métodos lo pueden utilizar sus subclases y otras clases del package persona
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public static void numP() {
		numP++;
	}
	public static void viewNumP() {
		System.out.println("Numero de personas creadas: "+numP);
	}
}

