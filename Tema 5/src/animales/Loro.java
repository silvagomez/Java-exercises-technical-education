package animales;

import java.util.Scanner;

class Animal{
	
	private String nombre;
	private byte edad;
	
	Scanner sc = new Scanner(System.in);
	
	public Animal() {
		
	}

	public Animal(String nombre, byte edad) {
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public void hablar(){
		System.out.println("Mi nombre es "+nombre+" tengo "+edad+" años.");
	}
	
	public void pedirDatos() {
		System.out.print("Ingrese el nombre: ");
		nombre=sc.next();
		System.out.print("Ingrese la edad: ");
		edad=sc.nextByte();	
	}
}

class Gato extends Animal{
	private byte vidas;
	public Gato() {
		
	}
	public Gato(String nombre, byte edad, byte vidas) {
		super(nombre,edad);
		this.vidas=vidas;
	}
	public void hablar() {
		super.hablar();
		System.out.println("Me quedan "+vidas+" vidas.");
	}
	public void pedirDatos() {
		super.pedirDatos();
		System.out.print("Ingrese las vidas que le quedan al gato: ");
		vidas=sc.nextByte();
	}
}

class Pajaro extends Animal{
	
	private String clima;
	
	public Pajaro(){
		
	}
	
	public Pajaro(String nombre, byte edad, String clima){
		super(nombre,edad);
		this.clima=clima;
	}
	/*
	public void hablar() {
		
	}
	*/
	public void hablar() {
		super.hablar();
		System.out.println("El clima en el que vivo es: "+clima);
	}
	 public void pedirDatos() {
		 super.pedirDatos();
		 System.out.print("Ingrese el clima: ");
		 clima=sc.next();
	 }
}

public class Loro extends Pajaro {
	private String color;
	
	public Loro(){
		
	}
	public Loro(String nombre, byte edad, String clima, String color){
		super(nombre,edad,clima);
		this.color=color;
	}
	
	public void hablar() {
		super.hablar();
		System.out.println("Mi color es: "+color);
	}
	
	public void pedirDatos() {
		super.pedirDatos();
		System.out.print("Ingrese el color: ");
		color=sc.next();
	}
	
	
}
