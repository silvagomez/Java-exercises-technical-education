package futbol;

public abstract class SeleccionFutbol {
	
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;
	
	SeleccionFutbol(int i, String n, String a, int e){
		id=i;
		nombre=n;
		apellido=a;
		edad=e;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void viajar() {
		System.out.println("Mi nombre es: "+nombre+" "+apellido);
	}
	public void concentrarse() {
		System.out.println(nombre+" tiene "+edad+" debe concentrase");
		
	}
	public abstract void entrenamiento();
	
	public void partidoFutbol() {
		System.out.println(id+" "+nombre+" convocado para partido");
	}

	

}
