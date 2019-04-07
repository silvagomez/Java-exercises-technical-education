package coches.facturacion;

public class Cliente {
	
	String dni, nombre, provincia;
	int telefono;
	
	Cliente(){
		
	}
	
	Cliente(String dni, String nombre, int telefono, String provincia){
		this.dni=dni;
		this.nombre=nombre;
		this.telefono=telefono;
		this.provincia=provincia;
	}
	
	Cliente(String dni, String nombre){
		this.dni=dni;
		this.nombre=nombre;
	}
	
	void setDni(String dni) {
		this.dni=dni;
	}
	
	String getDni() {
		return dni;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setTelefono(int telefono) {
		this.telefono=telefono;
	}
	
	int getTelefono() {
		return telefono;
	}
	
	void setProvincia(String provincia) {
		this.provincia=provincia;
	}
	
	String getProvincia() {
		return provincia;
	}

}
