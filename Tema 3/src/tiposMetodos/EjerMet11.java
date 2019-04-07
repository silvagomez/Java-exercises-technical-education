package tiposMetodos;

public class EjerMet11 {
	
	int resta;
	
	int restar(short n1, short n2) {
		resta=n1-n2;
		return resta;
	}
	void view() {
		System.out.println(resta);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resul;
		EjerMet11 n = new EjerMet11();
		resul=n.restar((short)4, (short)6);
		n.view();

	}

}
