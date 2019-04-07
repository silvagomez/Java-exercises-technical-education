package tiposMetodos;

public class EjerMet13 {
	
	int r;
	
	int restar(int n1, int n2) {
	r=n1-n2;
	return r;
		
	}
	
	void view() {
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resul;
		EjerMet13 n = new EjerMet13();
		resul=n.restar(24, 21);
		n.view();

	}

}
