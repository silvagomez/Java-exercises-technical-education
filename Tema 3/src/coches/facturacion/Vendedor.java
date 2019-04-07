package coches.facturacion;

public class Vendedor {
	
	String nombre;
	Byte categoria;
	float sueldoBase;
	
	Vendedor(){
		
	}
	Vendedor(String nombre, Byte categoria, float sueldoBase){
		this.nombre=nombre;
		this.categoria=categoria;
		this.sueldoBase=sueldoBase;
	}
	Vendedor(String nombre, float sueldoBase){
		this.nombre=nombre;
		this.sueldoBase=sueldoBase;
	}
	Vendedor(Byte categoria, float sueldoBase){
		this.categoria=categoria;
		this.sueldoBase=sueldoBase;
	}
	void calculoSueldo() {
		if(categoria==1) {
			sueldoBase=sueldoBase*1.02f;
		}
		else {
			sueldoBase=sueldoBase*1.05f;
		}
	}
	
	void view() {
		System.out.println("El empleado "+nombre+" tiene un sueldo de "+sueldoBase);
	}
	
	void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	String getNombre() {
		return nombre;
	}

}
