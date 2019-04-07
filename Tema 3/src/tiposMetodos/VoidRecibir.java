package tiposMetodos;

public class VoidRecibir {
	
	int acum;
	
	void sumar(short n1, short n2) {
		acum=n1+n2;
		
	}
	
	void visualizar() {
		System.out.println(acum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VoidRecibir obj = new VoidRecibir();
		/*The method sumar(short, short) in the type VoidRecibir is not applicable
		for the arguments (int, int)*/
		obj.sumar((short)4,(short)6);		
		obj.visualizar();
		

	}

}
