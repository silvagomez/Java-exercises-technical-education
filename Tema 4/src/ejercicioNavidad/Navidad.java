package ejercicioNavidad;
import java.util.Scanner;

public class Navidad {
	
	Scanner sc = new Scanner(System.in);
	
	class Alumno{
		int number;
		String name;
		String provincia;
		Alumno next;
	}
	
	Alumno aroot;
	
	class Provincia{
		Alumno nextAlumno;
		Provincia next;
		
	}
	Provincia proot;
	
	public Navidad() {
		aroot=null;
	}
	
	void setInfo(){
		char c;
		do {
			Alumno nd= new Alumno();
			System.out.print("Ingrese el número del alumno: ");
			nd.number=sc.nextInt();
			System.out.print("Ingrese el nombre del alumno: ");
			nd.name=sc.next();
			System.out.print("Ingrese la provincia del alumno: ");
			nd.provincia=sc.next();
			nd.next=aroot;
			aroot=nd;
			System.out.print("Desea ingresar más números (s/n): ");
			c=sc.next().charAt(0);
			
		}
		while(c=='s');
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navidad nvd = new Navidad();
		nvd.setInfo();


	}

}
