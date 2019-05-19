package arrays;
import java.util.*;

public class LoteriaPrimitiva {
	
	Random r = new Random();
	
	/*obtener 6numeros del 1 al 9 para jugar la loteria primitiva
	2 metodos obtenernumeros() visualizar()*/
	
	int [] number = new int[6];
	int[] num = new int [6];
	int n, no;
	
	LoteriaPrimitiva(){
		
	}
	
	void numbers() {
		/*
		for (int i = 0; i < 6; i++) {			
			do {
				no=(int)(Math.random()*10)+1;	
				System.out.println(no);
			} while (num[i]==no);

			num[i]=no;
		}*/
		// PILAR 
		
		for(int x=0;x<6;x++) {
			do {
				n=((int)(Math.random()*49))+1;
				for (int i =0; number[i] != n && i<x; i++ );
			} while (number[x]==n);
			number[x]=n;
		}
		
	}
	
	void view() {
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoteriaPrimitiva lote = new LoteriaPrimitiva();
		lote.numbers();
		lote.view();
	}

}
