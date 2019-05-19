package herencia.operacion;
import java.util.Scanner;
public abstract class Operacion {
	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	public Operacion() {
		teclado=new Scanner(System.in);
	}

	public void cargar1() {
		System.out.print("Ingrese el primer valor:");
		valor1=teclado.nextInt();
	}
	
	public void cargar2() {
		System.out.print("Ingrese el segundo valor:");
		valor2=teclado.nextInt();
	}
	
	public void mostrarResultado() {
		System.out.println(resultado);
	}
	public abstract void operar(); //método abstracto
	}//fin clase Operacion
	
	class Suma extends Operacion{
		public void operar() {
			resultado=valor1+valor2;
			
		}
	}
	
	class Resta extends Operacion {
		public void operar(){
			resultado=valor1-valor2;
		}
	}