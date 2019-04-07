package maxMin;

import java.util.Scanner;

public class MayorMenorEjer4 {
	
	Scanner teclado = new Scanner(System.in);
		
	MayorMenorEjer4(){
		System.out.println("NÚMERO MAYOR MENOR");
	}
	
	void calculoMayor(byte n1, byte n2, byte n3) {
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
	}
	
	void calculoMenor(byte n1, byte n2, byte n3) {
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
		
		MayorMenorEjer4 num = new MayorMenorEjer4();
		num.calculoMayor((byte)2, (byte)4,(byte) 6);
		num.calculoMenor((byte)6, (byte)2, (byte)4);
		

	}

}
