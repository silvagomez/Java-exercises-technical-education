package ventas;

import ventas.*;

public class Vendedor {
	
	/*package ventas.vendedor
	 * clase ventas atriculo, nombrearticulo, cantidad y precio, contructor recibe los tres parametros
	 * metodo ver, visualiza el nombre articulo cantidad e importe
	 * metodo ganancia retorna, precio * cantidad
	 * clase vendedor, atributos, nombre y un array de ventas
	 * contructor recibe nombre y el maximo de ventas que puede realizar dicho vendedor
	 * metono nuevasVentas recibe un array de nuevas ventas, por ejemplo tuerca cantidad 10 precio 2
	 * tornillos cantidad 100 precio 8
	 * cuidado no exceder el tamaño del array si es el caso mensaje y finalizar el programa
	 * el metodo retornara false si es este caso
	 * metodo ver, visualiza el nombre del vendero y llamara el metodo de venta, para obtener el nombre del articulo vendido
	 * cantidad y el importe.
	 * clase principal, crear una instancia de vendedor, llamar al metodo de nuevas ventas, y llamar al metodo ver de vendedor
*/
	String nameSaleMan;
	Ventas[] sales;
	
	Vendedor(){
		
	}
	
	Vendedor(String name, int maxSales){
		nameSaleMan=name;
		sales = new Ventas[maxSales];
		
	}
	
	boolean nuevasVentas(Ventas[] newSales) { /*recibe un array
	en el main del principal  venta [] venta = {new venta ("tuercas",4,10), new venta ()...
	bol = obj.nuevasventas(venta)*/
		boolean fin = true;
		/*if(sales<newSales) {
			fin=false;
		}
		else {
			fin=true;
		}*/
		return fin;
	}

}
