package tiposMetodos;

public class EjerMet7 {
	
	byte n1,n2,r;
	
	EjerMet7( float numero1, float numero2){
		n1=(byte) numero1;
		n2=(byte) numero2;
		
	}
	void restar() {
		r=(byte) (n1-n2);
	}
	void view() {
		System.out.println("El resultado de la resta es "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet7 n = new EjerMet7(24.01f,21.02f);
		n.restar();
		n.view();

	}

}
