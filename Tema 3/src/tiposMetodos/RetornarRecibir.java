package tiposMetodos;

public class RetornarRecibir {
	
	int acum;
	
	int sumar(short n1 , short n2) {
		acum=n1+n2;
		return acum;
	}
	
	void visualizar() {
		System.out.println(acum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado;
		RetornarRecibir obj = new RetornarRecibir();
		resultado=obj.sumar((short)4,(short) 6);
		obj.visualizar();

	}

}
