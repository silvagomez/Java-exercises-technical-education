package tiposMetodos;

public class VoidVoid {
	short n1=6, n2=4;
	int acum;
	
	void sumar () {
		acum=n1+n2;
	}
	
	void visualizar() {
		System.out.println(acum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VoidVoid obj = new VoidVoid();
		obj.sumar();
		obj.visualizar();

	}

}
