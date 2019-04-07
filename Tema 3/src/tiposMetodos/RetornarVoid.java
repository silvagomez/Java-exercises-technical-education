package tiposMetodos;

public class RetornarVoid {
	
	short n1=6, n2=4;
	int acum;
	
	int sumar() {
		acum=n1+n2;
		return acum;
	}
	
	void visualizar() {
		System.out.println(acum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultado;
		RetornarVoid obj = new RetornarVoid();
		resultado=obj.sumar();
		obj.visualizar();

	}

}
