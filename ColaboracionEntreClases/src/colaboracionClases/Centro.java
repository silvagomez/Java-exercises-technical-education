package colaboracionClases;
import colaboracionClases.*;

public class Centro {

	public Centro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ciclos c1 = new Ciclos("web", "desarrollo de aplicaciones web", 2000);
		Estudiantes e1 = new Estudiantes("12345MIR", "Miren", "Perez", "Badiola", "15/02/2000", 50.4f, 1.7f, 'M', "Iturribide", c1);
		c1.viewEstudios();
		System.out.println();
		e1.viewEstudiantes();
		

	}

}
