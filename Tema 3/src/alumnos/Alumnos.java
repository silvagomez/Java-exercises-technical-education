package alumnos;

public class Alumnos {
	
	byte n;
	String nombre;
	int tel;
	Colegio cole;
	
	Alumnos(){
		
	}
	
	Alumnos(byte n, String nombre, int tel, Colegio cole){
		this.n=n;
		this.nombre=nombre;
		this.tel=tel;
		this.cole=cole;
		
	}
	
	void view() {
		System.out.println("El alumno: "+nombre+" con teléfono: "+tel);
		System.out.println("Estudia en el colegio: "+cole.getNombre());
		System.out.println("Telefono colegio: "+cole.getTelefono());	
		
	}

}
