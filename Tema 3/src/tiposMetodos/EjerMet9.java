package tiposMetodos;

public class EjerMet9 {
	
	int r;
	
	void restar(int n1, int n2) {
		r=n1-n2;
		
	}
	
	void view() {
		System.out.println("El resultado de la resta es "+r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n1=4, n2=6;
		 EjerMet9 n = new EjerMet9();
		 n.restar(n1,n2);
		 n.view();

	}

}
