package tiposMetodos;

public class EjerMet14 {
	
	int r1, r2;
	int multiplicar (int n1, int n2) {
		r1=n1*n2;
		return r1;
	}
	
	int dividir(float n1, float n2) {
		r2=(int) (n1/n2);
		return r2;
		
	}
	
	void view() {
		System.out.println(r1);
		System.out.println(r2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resul;
		
		EjerMet14 r = new EjerMet14();
		resul=r.multiplicar(24, 21);
		resul=r.dividir(24.2f, 6f);
		r.view();

	}

}
