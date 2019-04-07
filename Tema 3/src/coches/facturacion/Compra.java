package coches.facturacion;

public class Compra {
	
	Vendedor vendedor;
	Coche coche;
	Cliente cliente;
	byte dia, mes;
	short ano;
	
	Compra(){
		
	}
	
	Compra(Vendedor vendedor, Coche coche, Cliente cliente, byte dia, byte mes, short ano){
		this.vendedor=vendedor;
		this.coche=coche;
		this.cliente=cliente;
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	void view() {
		System.out.println("El día "+dia+" del mes "+mes+" del año "+ano);
		System.out.println("El cliente "+cliente.getNombre());
		System.out.println("Ha comprado el coche "+coche.getMatricula()+" de la marca "+coche.getMarca()+" modelo "+coche.getModelo());
		System.out.println("y su vendedor es "+vendedor.getNombre());
	}

}
