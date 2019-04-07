package tiposMetodos;

public class EjerMet10 {
	
	short n1=2, n2=4;
	int resta;
	
	int restar() {
		resta=n1-n2;
		return resta;
	}
	
	void view() {
		System.out.println("El resultado de la resta es "+resta);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet10 n = new EjerMet10();
		n.restar();
		n.view();

	}

}
