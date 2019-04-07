package coches.facturacion;

import coches.facturacion.Vendedor;
import coches.facturacion.Cliente;
import coches.facturacion.Coche;
import coches.facturacion.Compra;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor v1= new Vendedor("Camila", 100f);
		Vendedor v2= new Vendedor("Camilo", 200f);
		//v1.calculoSueldo();
		v1.view();
		//v2.calculoSueldo();
		v2.view();
		
		Coche co1= new Coche("BZL 134","Renault",(short)98);
		Coche co2= new Coche("ABC 123", "Kia",(short)02);
		Coche co3= new Coche("PCV 987", "Volkswagen", (short)04);
		Coche co4= new Coche("QWE 784", "BMW", (short)92);
		Coche co5= new Coche("POI 654", "Subaru", (short)15);
		co1.precioColor("blanco", 105f);
		co1.view();
		co2.precioColor("naranja", 100f);
		co2.view();
		co3.precioColor("azul", 200f);
		co3.view();
		co4.precioColor("marron", 100f);
		co4.view();
		co5.precioColor("rosa", 100f);
		co5.view();
		
		Cliente cl1=new Cliente("1234567", "Diego", 80106658, "Bizkaia");
		Cliente cl2=new Cliente("7654321", "Pedro", 2162885, "Bizkaia");
		Cliente cl3=new Cliente("9876543", "Alicia", 6722103, "Bizkaia");
		
		Compra com1=new Compra(v1, co1, cl1, (byte)24, (byte) 1, (short)2016);
		Compra com2=new Compra(v2, co2, cl2, (byte)21, (byte)2,(short)2017);
		Compra com3=new Compra(v2, co3, cl3, (byte)21, (byte)2,(short)2017);
		Compra com4=new Compra(v1, co4, cl1, (byte)24, (byte) 1, (short)2016);
		Compra com5=new Compra(v1, co5, cl2, (byte)21, (byte)2,(short)2017);
		
		com1.view();
		
		
		
		

	}

}
