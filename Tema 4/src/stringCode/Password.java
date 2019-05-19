package stringCode;
import java.util.*;
public class Password {
	Scanner sc = new Scanner(System.in);
	
	String setPass(){
		String pass2;
		System.out.println("Ingrese la contraseña");
		pass2=sc.next();
		return pass2;
	}
	
	void comparePass() {
		String pass="123abc";
	
			if(pass.equals(setPass()))System.out.println("Correcto");
			else System.out.println("Incorrecto");
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password p = new Password();
		p.comparePass();

	}

}
