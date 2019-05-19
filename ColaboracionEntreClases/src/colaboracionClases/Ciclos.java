package colaboracionClases;

public class Ciclos {
	
	private String codigo, nomCiclo;
	private int duracion;
	

	public Ciclos() {
		// TODO Auto-generated constructor stub
	}
	
	public Ciclos(String codigo, String nomCiclo, int duracion) {
		this.codigo=codigo;
		this.nomCiclo=nomCiclo;
		this.duracion=duracion;
	}
	
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNomCiclo() {
		return nomCiclo;
	}


	public void setNomCiclo(String nomCiclo) {
		this.nomCiclo = nomCiclo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public void viewEstudios() {
		System.out.println("****************Estudios****************");
		System.out.println("Nombre: " +nomCiclo);
		System.out.println("Código: " +codigo);
		System.out.println("Duración: " +duracion+"horas");
	}




}
