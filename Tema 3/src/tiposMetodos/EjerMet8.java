package tiposMetodos;

public class EjerMet8 {

	float n1,n2,r;
	
	EjerMet8( float n1, float n2){
		this.n1=n1;
		this.n2=n2;
		
	}
	void restar() {
		r=n1-n2;
	}
	void view() {
		System.out.println("El resultado de la resta es "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjerMet8 n = new EjerMet8(24.01f,21.02f);
		n.restar();
		n.view();

	}

}
