package figuras;

	abstract interface Figura {
		abstract void area();
		abstract void perimetro();
	}
	class Cuadrado implements Figura {
		public void area() {
			System.out.println("Aqui se calcula el area de un cuadrado");
		}
		public void perimetro() {
			System.out.println("aqui se calcula el perimetro de un cuadrado");
		}
	}
	
	class Circulo implements Figura {
		public void area() {
			System.out.println("aqui se puede calcular el area de un circulo");
		}
		public void perimetro() {
			System.out.println("Aqui se calcula el perimetro de un circulo");
		}
	}
	public class Principal {
		public static void main(String[] args) {
			Figura figura1 = new Circulo();
			figura1.area();
			figura1.perimetro();
			figura1 = new Cuadrado();
			figura1.area();
			figura1.perimetro();
		}
}