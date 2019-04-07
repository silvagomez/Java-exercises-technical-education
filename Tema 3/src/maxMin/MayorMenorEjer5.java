package maxMin;

public class MayorMenorEjer5 {
	
		
	MayorMenorEjer5(){
		System.out.println("NÚMERO MAYOR MENOR");
	}
	
	void calculoMayor(int n1, int n2, int n3) {
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1+" es el mayor");
		}
		else {
			if(n2>n1 && n2>n3) {
				System.out.println(n2+ " es el mayor");
			}
			else {
				if(n3>n1 && n3>n2) {
					System.out.println(n3+" es el mayor");
				}
				else {
					
				}
			}
		}
		calculoMenor(n1,n2,n3);

	}
	
	void calculoMenor(int n1, int n2, int n3) {
		if(n1<n2 && n1<n3) {
			System.out.println(n1+" es el menor");
		}
		else {
			if(n2<n1 && n2<n3) {
				System.out.println(n2+ " es el menor");
			}
			else {
				if(n3<n1 && n3<n2) {
					System.out.println(n3+" es el menor");
				}
				else {
					
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MayorMenorEjer5 obj = new MayorMenorEjer5();
		obj.calculoMayor(1, 2, 3);

	}

}
