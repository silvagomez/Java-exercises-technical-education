package tiposMetodos;

public class EjerMet1 {
	
	float n1=24.01f, n2=21.02f, r;
	
	void restar() {
		r=n1-n2;
	}
	void view() {
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjerMet1 n = new EjerMet1();
		n.restar();
		n.view();

	}

}
