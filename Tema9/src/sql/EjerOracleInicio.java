package sql;

import java.sql.*;

public class EjerOracleInicio {
	
static public void main( String[] args ) {

	Connection conn;
	Statement sentencia;
	ResultSet resultado;

	System.out.println( "Conexión a la base de datos..." );

	try{ // Se carga el driver JDBC-ODBC
		Class.forName ("oracle.jdbc.OracleDriver");
	} catch( Exception e ) {
		System.out.println( "No se pudo cargar el driver JDBC");
		return; //termina la ejecución del programa
	}
	
	try{ // Se establece la conexión con la base de datos
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
		sentencia = conn.createStatement();
	} catch( SQLException e ) {
		System.out.println( "No hay conexión con la base de datos." );
		return;
	}

	try {
		System.out.println( "Seleccionando..." );
		resultado = sentencia.executeQuery("SELECT nombre_empresa,direccion_empresa FROM empresas ");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.print( "nombre: "+resultado.getString(1));//getString(“nombre”)
			System.out.println( " direccion: "+resultado.getString(2));
			//para numéricos existen: getInt(“salario”), getFloat(“salario”),getFloat(3),…
		}
		//conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	
	} //Fin del main
} //Fin de la clase