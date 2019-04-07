package alumnos;

public class Colegio {
	short codigo;
	String nombre, web;
	int tel;
	
	Colegio(){
		
	}
	
	Colegio( short codigo, String nombre, String web, int tel){
		this.codigo=codigo;
		this.nombre=nombre;
		this.web=web;
		this.tel=tel;
	}
	
	void altaTelefono(int tel){
		this.tel=tel;
	}
	
	String getNombre() {
		return nombre;
		
	}
	
	int getTelefono() {
		return tel;
	}
	

	
	
	
}

