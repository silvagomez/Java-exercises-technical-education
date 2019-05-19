package aves.pajaros;

import aves.*;

public class Canario extends Ave{
	private float size;
	
	protected Canario(char sexo, byte edad) {
		super(sexo, edad);
	}
	public Canario(char sexo, byte edad, float size) {
		super(sexo, edad);
		this.setSize(size);
	}
	
	public void altura() {
		if(getSize()>30) {
			System.out.println("Tama�o alto");
		}
		else {
			if(getSize()>15) {
				System.out.println("Tama�o mediano");
			}
			else {
				System.out.println("Tama�o Bajo");
			}
		}
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
}
