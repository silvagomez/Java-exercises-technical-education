package arrays;
import java.util.*;
public class PersonasMail {
	Scanner sc = new Scanner(System.in);
	
	String[] personas = new String[5];
	String[] mail = new String[5];
	
	
	PersonasMail() {
		
	}
	
	void setData() {
		for (int i = 0; i < personas.length; i++) {
			System.out.print("Ingrese el nombre: ");
			personas[i]=sc.nextLine();
			System.out.print("Ingrese el mail: ");
			mail[i]=sc.nextLine();
		}
	}
	
	void getData() {
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]+" su mail es: "+mail[i]);
		}
	}
	
	void name() {
		String nombre;
		System.out.print("Ingrese el nombre a consultar:");
		nombre=sc.nextLine();
		for (int i = 0; i < mail.length; i++) {
			if(nombre.equalsIgnoreCase(personas[i])) {
				System.out.print("El mail es: "+mail[i]);
			}
		}
		System.out.println();
	}
	void atSign() {
		for (int i = 0; i < mail.length; i++) {
			if(mail[i].indexOf("@")==1) {
				System.out.println("El correo de "+personas[i]+" tiene @ en el mail");
			}
			else {
				System.out.println("El correo de "+personas[i]+" no tiene @ en el mail");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonasMail op = new PersonasMail();
		op.setData();
		op.getData();
		op.name();
		op.atSign();
	}

}
