package execptions;

public class Ejer2 {
	
	private int[] num1=new int[5];
	private int[] num2=new int [5];
	private int[] result=new int [5];

	public Ejer2() {
		// TODO Auto-generated constructor stub
	}
	
	void asignar() {
		for (int i = 0; i < num1.length; i++) {
			num1[i]=(int)(Math.random()+2*2);
			num2[i]=(int)(Math.random()*8);
		}
	}
	
	void operacion() {
		for (int i = 0; i < num1.length; i++) {
			result[i]=num1[i]/num2[i];
		}
	}
	
	void resultado() {
		for (int i = 0; i < 1; i++) {
			
			System.out.print("Primer número:\t"+num1[i]+"\tSegundo número:\t"+num2[i]);
			try {
				result[i]=num1[i]/num2[i];
				System.out.println("\tResultado de la division:\t"+result[i]);
			}
			catch(ArithmeticException x) {
				System.out.println("\tResultado de la division:\tError division por 0");
				//i--;
				
			}
		}
		for (int i = 1; i < num1.length; i++) {
			System.out.print("\t\t"+num1[i]+"\t\t\t"+num2[i]);
			try {
				result[i]=num1[i]/num2[i];
				System.out.println("\t\t\t\t\t"+result[i]);
			}
			catch(ArithmeticException y){
				System.out.println("\t\t\t\t\tError division por 0");
				//i--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ejer2 obj =new Ejer2();
		obj.asignar();
		//obj.operacion();
		obj.resultado();

	}

}
