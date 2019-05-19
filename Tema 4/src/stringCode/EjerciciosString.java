package stringCode;

import java.util.*;

public class EjerciciosString {
	
	Scanner sc = new Scanner(System.in);
	String mail;
	String animal;
	
	EjerciciosString(){
		
		//System.out.println("Ingrese su mail");
		//mail=sc.next();
		
	}
	
	void atSign() {		
		
		if(mail.indexOf("@")==-1) {					// siempre es así y en el if va en no tiene 
			System.out.println(mail+" no tiene el @");
		}
		else {
			System.out.println(mail+" tiene el @ en la posición "+mail.indexOf("@"));
		}
	}
	
	void setVarString() {
		System.out.println("Ingrese un animal");
		animal=sc.nextLine(); // con .next() no toma los espacios, es decir, el espacio es como un enter
		
	}
	
	void half() {
		animal.length();
		//animal.lenght()/2;
		System.out.println(animal.length()/2);
		System.out.println(animal.substring(0, animal.length()/2));
	}
	
	void lastLetter() {
		System.out.println(animal.charAt(animal.length()-1));
	}
	
	void reverse() {
		for (int i = animal.length()-1; i >=0; i--) {
			System.out.print(animal.charAt(i));
		}
		System.out.println();
	}
	
	void hyphen() {
		for (int i = 0; i < animal.length()-1; i++) {
			System.out.print(animal.charAt(i)+"-");
		}
		lastLetter();
	}
	
	void qVocals() {
		int vocales=0;
		
		for (int i = 0; i < animal.length(); i++) {
			if(animal.charAt(i)=='a'||animal.charAt(i)=='e'||animal.charAt(i)=='i'||animal.charAt(i)=='o'||animal.charAt(i)=='u') {
				vocales++;
			}
		}
		System.out.println("Cantidad de vocales: "+vocales);
		
	}
	
	void palindromo() {
		int cant=0;
		for (int i=0 , y=animal.length()-1; i<=animal.length()/2; i++,y--) {
			if(animal.charAt(i)==' ')i++;
			if(animal.charAt(y)==' ')y--;
			if(animal.charAt(i)==animal.charAt(y))cant++;
		}
		if(cant==animal.length()/2)	System.out.println("Si");
		else System.out.println("No");
		
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EjerciciosString eje = new EjerciciosString();
		//eje.atSign();
		eje.setVarString();
		eje.half();
		eje.lastLetter();
		eje.reverse();
		eje.hyphen();
		eje.qVocals();
		eje.palindromo();
		
		

	}

}
