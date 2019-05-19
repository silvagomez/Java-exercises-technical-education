package programa;
import comportamiento.Hablador;
import persona.*;
import ave.Loro;

public class InterfacePrograma {
public static void main(String arg[])
{
	Hablador lista[]=new Hablador[5];
	lista[0]=new Profesor("Pilar","Lekue","principal", "pilarlekue@ceinmark.com");
	lista[1]=new Loro('m',20,'n',"rojo");
	//el siguiente elemento del array contiene un alumno
	for(int i=0; i<2;i++){ //algo está mal
		lista[i].hablar();
	}
	//coloca en Persona un atributo static y un método static
	//y utiliza dicho atributo y dicho método como quieras.
	Profesor.viewNumP();
	
	
	}
}
