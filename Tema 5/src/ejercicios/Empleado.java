package ejercicios;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	private String nombre;
	private float sueldo;
	private Date fechaAlta;
	private Date fechaBaja;
	
	Empleado(String nombre, float sueldo, int dia, int mes, int anyo){
		this.nombre=nombre;
		this.sueldo=sueldo;
		GregorianCalendar calendario=new GregorianCalendar(anyo, mes-1,dia);
		fechaAlta=calendario.getTime();
		GregorianCalendar cale=new GregorianCalendar();
		cale.set(2020, 02, 21);
		//cale.getDate();
}
	void view() {
		System.out.println(fechaAlta);
		
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Empleado obj=new Empleado("jon",3456.78F,17,2,2000);
	obj.view();
	
	}
}