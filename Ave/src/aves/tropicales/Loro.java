package aves.tropicales;

import aves.*;

public class Loro extends Ave{
	private char region;
	protected String color;
	
	public Loro(char sexo, byte edad, char region, String color) {
		super(sexo, edad);
		this.setRegion(region);
		this.color=color;
	}
	
	public void deDondeEres() {
		switch (getRegion()) {
		case 'n':
			System.out.println("Norte");
			break;
		case 's':
			System.out.println("Sur");
			break;
		case 'e':
			System.out.println("Este");
			break;
		case 'o':
			System.out.println("Oeste");
			break;

		default:
			break;
		}
	}

	public char getRegion() {
		return region;
	}

	public void setRegion(char region) {
		this.region = region;
	}


}
