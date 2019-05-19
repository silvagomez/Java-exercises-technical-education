package musica;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guitarra g1=new Guitarra();
		System.out.println(g1.tipoInstrumento());
		g1.tocar();
		InstrumentoViento v1=new InstrumentoViento();
		System.out.println(v1.tipoInstrumento());
		v1.afinar();
		System.out.println("*************");
		InstrumentoMusical inter=new Guitarra();
		inter.tocar();
		//InstrumentoMusical inter1=new InstrumentoMusical(); ERROR

	}

}
