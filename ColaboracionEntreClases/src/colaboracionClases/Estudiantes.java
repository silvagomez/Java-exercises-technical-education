package colaboracionClases;
import colaboracionClases.*;

public class Estudiantes {
	
	private String dni, nom, apel1, apel2, fechaNatal, direcc;
	private float peso, estatura;
	private char sexo;
	private Ciclos estudios;

	public Estudiantes() {
		// TODO Auto-generated constructor stub
	}
	
	public Estudiantes(String dni, String nom, String apel1, String apel2, String fechaNatal, float peso, float estatura, char sexo, String direcc, Ciclos estudios) {
		this.dni=dni;
		this.nom=nom;
		this.apel1=apel1;
		this.apel2=apel2;
		this.fechaNatal=fechaNatal;
		this.peso=peso;
		this.estatura=estatura;
		this.sexo=sexo;
		this.direcc=direcc;
		this.estudios=estudios;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApel1() {
		return apel1;
	}

	public void setApel1(String apel1) {
		this.apel1 = apel1;
	}

	public String getApel2() {
		return apel2;
	}

	public void setApel2(String apel2) {
		this.apel2 = apel2;
	}

	public String getFechaNatal() {
		return fechaNatal;
	}

	public void setFechaNatal(String fechaNatal) {
		this.fechaNatal = fechaNatal;
	}

	public String getDirecc() {
		return direcc;
	}

	public void setDirecc(String direcc) {
		this.direcc = direcc;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getEstatura() {
		return estatura;
	}

	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Ciclos getEstudios() {
		return estudios;
	}

	public void setEstudios(Ciclos estudios) {
		this.estudios = estudios;
	}
	
	public void viewEstudiantes() {
		System.out.println("****************Estudiante****************");
		System.out.println("Nombre completo: "+nom+" "+apel1+" "+apel2);
		System.out.println("Fecha de nacimiento: "+fechaNatal);
		System.out.println("Peso: "+peso);
		System.out.println("Estarura: "+estatura);
		System.out.println("Sexo: "+sexo);
		System.out.println("Dirección: "+direcc);
		System.out.println("Estudios que realiza: " +estudios.getNomCiclo());
		System.out.println("Duración de la Estudios: " +estudios.getDuracion());
		
	}
	

}
