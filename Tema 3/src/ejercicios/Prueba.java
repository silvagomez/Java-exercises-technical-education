package ejercicios;

public class Prueba {
	
	String nombre;
	
	Prueba(){
		
		setNombre(nombre);
		
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	void view() {
		System.out.println(nombre);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prueba obj1 = new Prueba();
		obj1.setNombre("Camilo");
		

	}

}
