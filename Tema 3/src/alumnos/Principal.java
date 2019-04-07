package alumnos;

import alumnos.Colegio;
import alumnos.Alumnos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Colegio col1= new Colegio((short) 123, "Ceinmark", "www.ceinmark.com",58462);
		Colegio col2= new Colegio((short) 312, "Iturri", "www.iturri.com",98714);
		Alumnos a1=new Alumnos((byte) 01, "Diego", 2162885, col1);
		Alumnos a2=new Alumnos((byte) 02, "Camilo", 8106658, col1);
		Alumnos a3=new Alumnos((byte) 03, "Carlos", 1234567, col2);
		Alumnos a4=new Alumnos((byte) 04, "Andres", 7654321, col2);
		Alumnos a5=new Alumnos((byte) 05, "Pedro", 1345278, col1);
		a1.view();
		a2.view();
		a3.view();
		a4.view();
		a5.view();	

	}

}
