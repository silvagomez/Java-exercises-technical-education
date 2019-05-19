package execptions;


public class Ejer1 {

	public Ejer1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = new int[4];
		
		try {			
			for (int i = 0; i < num.length; i++) {
				num[i]= (int) (Math.random()+2*2) / (int) (Math.random()*8);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Error matemático");
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		

	}

}
