package stringCode;
import java.util.*;
public class ClaseString {

	Scanner teclado=new Scanner(System.in);
    String cad1;
    String cad2;

    void teclear2String(){
		
    }
    
    void metodoEquals(){
    	System.out.println("equals");
    	String cadena1="Hola que tal";
    	String cadena2="Buenos días";
		
    	if(cadena1.equals(cadena2)){
    		System.out.println(cadena1+ "   es exactamente igual a    "+ cadena2);
    	}
    	else{
    		System.out.println(cadena1+ "  no es exactamente igual a  "+ cadena2);
    	}
    	
    	System.out.println(cadena1.equals(cadena2));
    	System.out.println();
    }
    
    void metodoEqualsIgnore(){
    	System.out.println("equalsIgnore");
    	String c1 = "Diego";
    	String c2 = "diego";
    	
    	if(c1.equalsIgnoreCase(c2)) {
    		System.out.println(c1+" es igual a "+c2);
    	}
    	else {
    		System.out.println(c1+" no es igual a "+c2);
    	}
    	System.out.println();
    }
    
    void metodoCompareTo(){
    	System.out.println("compareTo");
    	String a1 = "Silva";
    	String b1 = "Gómez";
    	String c1 = "a";
    	String d1 = "b";
    	
    	System.out.println(a1.compareTo(b1));
    	System.out.println(c1.compareTo(d1));
    	System.out.println();
    }        
    
    void metodoCharAt(){
    	System.out.println("charAt");
    	
    	String perro = "Labrador";
    	
    	System.out.println(perro.charAt(2)+" "+perro.charAt(6));
    	
    	System.out.println();
    }
    
    void metodoLength(){
    	System.out.println("length()");
    	String pajaro = "Guacamaya";
    	System.out.println(pajaro.length());
    	System.out.println();
	}
	
    void metodoSubstring(){
    	System.out.println("subString");
    	String animal = "Murcielago";
    	System.out.println(animal.substring(6, 10));
    	System.out.println();
	}
	
    void metodoIndexOf(){	
    	System.out.println("indexOf");
    	String animal="serpiente";
    	String ciudad="Cartegena";
    	String diego = "Diego Camilo Silva";
    	System.out.println(animal.indexOf("s"));
    	System.out.println(ciudad.indexOf("y"));
    	System.out.println(diego.indexOf("i"));
    	System.out.println(diego.indexOf("a"));
    	System.out.println();
	}
	
    void metodoUpperCase(){
    	System.out.println("upperCase");
    	String nombre =  "diego";
    	System.out.println(nombre.toUpperCase());
    	System.out.println();
	}
	
    void metodoLowerCase(){	
    	System.out.println("lowerCase");
    	String apellido = "SILVA";
    	System.out.println(apellido.toLowerCase());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseString s=new ClaseString();
		s.teclear2String();
		s.metodoEquals();
		s.metodoEqualsIgnore();
		s.metodoCompareTo();
		s.metodoCharAt();
		s.metodoLength();
		s.metodoSubstring();
		s.metodoIndexOf();
		s.metodoUpperCase();
		s.metodoLowerCase();	
		
	}

}
