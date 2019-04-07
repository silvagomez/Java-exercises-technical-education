package coches.facturacion;

public class Coche {
	
	String matricula, marca;
	Short modelo;
	float precioBase;
	
	Coche(){
		
	}
	
	Coche(String matricula, String marca, Short modelo, float precioBase){
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		this.precioBase=precioBase;
	}
	
	Coche(String matricula, String marca, Short modelo){
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
		
	}
	
	void setMatricula(String matricula) {
		this.matricula=matricula;
	}
	
	String getMatricula() {
		return matricula;
	}
	
	void setMarca(String marca) {
		this.marca=marca;
	}
	
	String getMarca() {
		return marca;
	}
	
	void setModelo(short modelo) {
		
	}
	
	short getModelo() {
		return modelo;
	}
	
	void setPrecioBase(float precioBase) {
		this.precioBase=precioBase;
	}
	
	float getPrecioBase() {
		return precioBase;
	}
	
	float precioColor(String color, float precioBase) {
		//this.precioBase=precioBase;
		
		switch (color) {
		case "blanco":
			precioBase=precioBase*1;
			break;
		case "rojo":
			precioBase=precioBase*1.05f;
			break;
		case "verde":
			precioBase=precioBase*1.05f;
			break;
		case "azul":
			precioBase=precioBase*1.05f;
			break;
		case "naranja":
			precioBase=precioBase*1.10f;
			break;
		case "marron":
			precioBase=precioBase*1.10f;
			break;
		default:
			precioBase=precioBase*1.15f;
			break;
		}
		
		return this.precioBase=precioBase;
	}
	void view() {
		System.out.println("El precio total del coche "+precioBase);
	}

}
