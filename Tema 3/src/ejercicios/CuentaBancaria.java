package ejercicios;

public class CuentaBancaria {
	
	long tCuenta;
	String titularC;
	float saldo;
	
	CuentaBancaria(long tCuenta, String titularC, float saldo){
		this.tCuenta=tCuenta;
		this.titularC=titularC;
		this.saldo=saldo;
	}
	
	void ingresar(float ingreso) {
		saldo=saldo+ingreso;
	}
	
	void retirar(float reintegro) {
		if(saldo>=reintegro) {
			saldo=saldo-reintegro;
		}
		else {
			System.out.println("No se puede hace el reintegro por saldo insuficiente");
		}
	}
	
	void view() {
		System.out.println("Tipo de cuenta "+tCuenta);
		System.out.println("Titular de cuenta "+titularC);
		System.out.println("Saldo "+saldo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaBancaria obj1= new CuentaBancaria(12345l, "Diego", 634.25f);
		CuentaBancaria obj2= new CuentaBancaria(54321l, "Camilo", 1028.254f);
		
		obj1.ingresar(10f);
		obj1.ingresar(100f);
		obj1.ingresar(360.128f);
		obj1.retirar(100f);
		obj1.view();
		
		obj2.ingresar(10f);
		obj2.retirar(2048.100f);
		obj2.ingresar(100f);
		obj2.ingresar(100f);
		obj2.ingresar(100f);
		obj2.view();

	}

}
