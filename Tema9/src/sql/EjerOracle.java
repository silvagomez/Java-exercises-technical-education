package sql;

import java.sql.*;

public class EjerOracle {
	
static public void main( String[] args ) {

	Connection conn;
	Statement sentencia;
	ResultSet resultado, resultado2;

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
	
	System.out.println("");
	
	try {
		System.out.println( "Seleccionando..." );
		resultado = sentencia.executeQuery("SELECT nombre_empresa FROM empresas where provincia='Bizkaia' ");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.println( "nombre: "+resultado.getString(1));//getString(“nombre”)
		}
		//conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	System.out.println("");
	
	try {
		System.out.println( "Seleccionando..." );
		resultado = sentencia.executeQuery("SELECT cif,nombre_empresa, (numero_empleados_fijos+numero_empleados_eventuales) FROM empresas ");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.print("cif:"+resultado.getString(1));
			System.out.println( " nombre: "+resultado.getString(2));//getString(“nombre”)
			System.out.println( "total de empleados: "+resultado.getString(3));
			//para numéricos existen: getInt(“salario”), getFloat(“salario”),getFloat(3),…
		}
		//conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	System.out.println("");
	
	try {
		System.out.println( "Seleccionando..." );
		resultado = sentencia.executeQuery("SELECT provincia FROM empresas GROUP BY provincia HAVING COUNT(*)>=3 ");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.println( "nombre: "+resultado.getString(1));//getString(“nombre”)
			//para numéricos existen: getInt(“salario”), getFloat(“salario”),getFloat(3),…
		}
		//conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	System.out.println("");
	
	try {
		System.out.println( "Seleccionando..." );
		resultado = sentencia.executeQuery("SELECT nombre_empresa, nombre_dpto FROM empresas, departamentos WHERE empresas.cif=departamentos.cif");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.println("nombre:"+resultado.getString(1));
			System.out.println( "nombre departamento: "+resultado.getString(2));//getString(“nombre”)
			//para numéricos existen: getInt(“salario”), getFloat(“salario”),getFloat(3),…
		}
		//conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	System.out.println("");
	
	try {
		System.out.println("Seleccionando...");
		resultado=sentencia.executeQuery("SELECT nombre_empresa, nombre_dpto FROM empresas, departamentos WHERE empresas.cif=departamentos.cif order by nombre_empresa");
		while (resultado.next()) {
			String empresa=resultado.getString(1);
			String departamento=resultado.getString(2);
			System.out.println("Empresa "+empresa+"\n Departamentos\t"+departamento);
			while(resultado.next()&&empresa.equals(resultado.getString(1))) {
				System.out.println("\t\t"+resultado.getString(2));
			}
			
			
		}
	
	} catch (SQLException e) {
		// TODO: handle exception
	}
	
	try {
		System.out.println( "Seleccionando..." );
		
		resultado= sentencia.executeQuery("SELECT nombre_dpto, departamentos.telefono, cod_dpto FROM empresas, departamentos WHERE empresas.cif=departamentos.cif AND nombre_empresa is null ");
		//Se recorren las filas retornadas
		while(resultado.next()){
			System.out.println("nombre:"+resultado.getString(1));
			System.out.println( "telefono: "+resultado.getString(2));//getString(“nombre”)
			System.out.println( "codigo departamento: "+resultado.getString(3));//getString(“nombre”
			//para numéricos existen: getInt(“salario”), getFloat(“salario”),getFloat(3),…
		}
		conn.close(); //Cierre de la conexión
	} catch( SQLException e ){
		System.out.println("Error: " +e.getMessage());
	}
	System.out.println("Consulta finalizada.");
	
	
	} //Fin del main
} //Fin de la clase