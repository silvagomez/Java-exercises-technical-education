package animales;

import java.util.ArrayList;

import animales.*;

public class MiPrograma {

	public MiPrograma() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Loro l1 = new Loro("Carlos",(byte) 5, "Tropico", "Azúl");
		Pajaro p1 = new Pajaro("Alicia", (byte) 45, "Polar");
		Animal a1 = new Animal("Pepe", (byte) 24);
		
		l1.hablar();
		System.out.println();
		p1.hablar();
		System.out.println();
		a1.hablar();
		System.out.println();
		
		Loro l2 = new Loro();
		Pajaro p2 = new Pajaro();
		Animal a2 = new Animal();
		
		l2.pedirDatos();
		p2.pedirDatos();
		a2.pedirDatos();		
		System.out.println();
		l2.hablar();
		p2.hablar();
		a2.hablar();
		*/
		//ArrayList<Animal>;
		
		Animal p, l, a;
		p= new Pajaro("Alicia", (byte) 45, "Polar");
		l= new Loro("Carlos",(byte) 5, "Tropico", "Azúl");
		a= new Animal("Pepe", (byte) 24);
		p.hablar();
		l.hablar();
		a.hablar();
		
		Animal[] animales = new Animal[4];
		animales[0]=new Pajaro();
		animales[1]=new Loro();
		animales[2]=new Animal();
		animales[3]=new Gato();
		
		for (int i = 0; i < animales.length; i++) {
			animales[i].pedirDatos();
		}
		for(int i = 0; i< animales.length; i++) {
			animales[i].hablar();
		}

	}

}
