package practicas;
import java.util.Scanner;

public class EjerciciosPractica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		/*int N = 5;
		double A = 4.56;
		char C = 'a';
		System.out.println("Variable N =" + N);
		System.out.println("Variable A =" + A);
		System.out.println("Variable C =" + C);
		//System.out.println(N+A); // En consola el mensaje a ver es: 19.119999999999997
		System.out.println(N+"+"+A+"="+(N+A));
		System.out.println(A + "-" +N+ "=" + (A-N));
		System.out.println("Valor numérico del caracter" +C+ "=" + (int)C);
		System.out.println((int)C); //En consola el mensaje a ver es: 97*/
		
		
		/*int x=1;
		System.out.println("Variable x = " +x);
		System.out.println(+x); //En consola el mensaje a ver es: 1
		//System.out.println(x++); //En consola el mensaje a ver es:1
		System.out.println(++x); /* En consola el mensaje a ver es: 2, pero si antes hay (x++)
		se realizará una operación de suma +1 además de ++x, es decir vemos 3*/
		//System.out.println(x++); //En consola el mensaje a ver si va después de (++x) es el mismo valor de +xx */

		
		/*int x=1, y=2;
		System.out.println("Variable x =" +x);
		System.out.println("Variable y =" +y);
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"%"+y+"="+(x%y));*/
		
		
		/*int n1, n2;		
		System.out.println("Ingrese un número");
		n1=teclado.nextInt();
		System.out.println("Ingrese otro número");
		n2=teclado.nextInt();
		System.out.println("Los numero ingresado al sistema son " +n1+ " y " +n2);*/
		
		/*String nombre1;
		System.out.println("Ingrese el nombre de su pareja");
		nombre1=teclado.nextLine();
		System.out.println("El nombre de su pareja es " +nombre1);*/
		
		int number;
		System.out.println("Ingrese un número");
		number=teclado.nextInt();
		System.out.println("El doble de " +number+ " es " +(number*2));
		System.out.println("El triple de " +number+ " es " +3*number );
		
		 
		
		
	}

}
