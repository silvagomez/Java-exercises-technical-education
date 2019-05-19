package aparato;

public class Principal {
	
	public static void main(String[] args){//¿Hay algo mal aquí? a debe ser args
		
		//crea dos objetos Lavadora, 1 objeto Radio y una instancia de Tv
		Lavadora lava1 = new Lavadora(10,10,10,10);
		Lavadora lava2 = new Lavadora(20,20,20,20);
		Radio ra1 = new Radio(10,20,true,15);
		Tv t1 = new Tv(20,10,5,false);
		//comprueba que no puedes crear un objeto de Aparato
		//Aparato apa = new Aparato(10,10);
		//no puedo por que es una clase abstracta
		
		
	}

}
