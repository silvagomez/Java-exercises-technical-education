package ave;



	class Bird{
		protected char sexo;
		protected byte edad;
		static int num;
		
		public Bird(char sexo, byte edad) {
			this.sexo=sexo;
			this.edad=edad;
			num++;
		}
		
		static void visualizar() {
			System.out.println("El número de aves creadas es: "+num++);
		}
		
		void quienSoy() {
			System.out.println("Soy "+sexo+" y tengo "+edad+" años");
		}
	}
	
	class Canario extends Bird{
		protected float size;
		
		public Canario(char sexo, byte edad) {
			super(sexo, edad);
		}
		public Canario(char sexo, byte edad, float size) {
			super(sexo, edad);
			this.size=size;
		}
		
		public void altura() {
			if(size>30) {
				System.out.println("Tamaño alto");
			}
			else {
				if(size>15) {
					System.out.println("Tamaño mediano");
				}
				else {
					System.out.println("Tamaño Bajo");
				}
			}
		}
		
	}
	
	class Loro extends Bird{
		protected char region;
		protected String color;
		
		public Loro(char sexo, byte edad, char region, String color) {
			super(sexo, edad);
			this.region=region;
			this.color=color;
		}
		
		public void deDondeEres() {
			switch (region) {
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
	}
	
	public class Piolin extends Canario {
		
		protected int numpeli;

		public Piolin(char sexo, byte edad, float size, int numpeli) {
			// TODO Auto-generated constructor stub
			super(sexo, edad, size);
			this.numpeli=numpeli;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Piolin p1 = new Piolin('H', (byte) 12, 5.5f, 50);
			Loro l1 = new Loro('M', (byte) 25, 's', "Rojo" );
			p1.quienSoy();
			l1.quienSoy();
			p1.altura();
			l1.deDondeEres();
			p1.size=18.2f;
			p1.altura();
			l1.region='e';
			l1.deDondeEres();
			
			Piolin.visualizar();

		}

	}