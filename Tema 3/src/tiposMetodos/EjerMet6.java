package tiposMetodos;

public class EjerMet6 {
	
	float r;
	
	void restar(float n1, float n2) {
		r=n1-n2;
		
	}
	void view() {
		System.out.println("El resultado de la resta es "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet6 n = new EjerMet6();
		n.restar(24.01f, 21.02f);
		n.view();

	}

}
