package ejercicios;

public class Personas {
	
	String nombre;
	int edad;
	String direccion;
	
	Personas(){
		nombre= null;
		edad=0;
		direccion= null;
	}
	
	Personas(String nombre, int edad, String direccion){
		// si las variables se llaman igual se utiliza this.
		this.nombre=nombre; 
		this.edad=edad;
		this.direccion=direccion;
	}
	
	//Dentro de los paréntesis podemos recibir tipos de variable (primitivo) o clase
	Personas(Personas usr){		
		nombre=usr.getNombre();
		edad=usr.getEdad();
		direccion=usr.getDireccion();		
	}
	
	void setNombre(String n) {
		nombre=n;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setEdad(int e) {
		edad=e;
	}
	
	void setEdad(float e) {
		edad=(int)e;
	}
	
	int getEdad() {
		return edad;
	}
	
	void setDireccion(String d) {
		direccion=d;
	}
	
	String getDireccion() {
		return direccion;
	}
	
	void view() {
		System.out.println(nombre);
		System.out.println(edad);
		System.out.println(direccion);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String no, dir;
		int ed;
		
		Personas per1 = new Personas();
		per1.view();
		
		Personas per2 = new Personas("Diego", 24, "Urizar");
		per2.view();
		
		//Se coloca una instancia creada en la clase Personas ejemplo per1 o per2
		Personas per3 = new Personas(per2);				
		per3.view();
		
		Personas per4= new Personas();
		per4.setNombre("Camilo");
		per4.setEdad(21);
		per4.setDireccion("Irala");
		per4.view();
		
		Personas per5 = new Personas();
		//per5.setNombre("Carlos");
		//per5.setEdad(36);
		//per5.setDireccion("Av. Boyacá");
		no=per5.getNombre();
		ed=per5.getEdad();
		dir=per5.getDireccion();
		per5.view();
		
		Personas per6 = new Personas();
		per6.setNombre("Felipe");
		per6.setEdad(27.4f);
		per6.setDireccion("Chapinero");
		per6.view();
		

	}

}
