package salario.sql;

import java.sql.*;

import salario.design.Grafica;

public class OracleBD {
	
	private Connection conn;
	private Statement sentencia;
	private ResultSet resultado;

	public OracleBD() {
		// TODO Auto-generated constructor stub
		
		try{ // Se carga el driver JDBC-ODBC
			Class.forName("oracle.jdbc.OracleDriver");
		} catch( Exception e ) {
			System.out.println( "No se pudo cargar el driver JDBC");
		}
		
		System.out.println("Conexión a la base de datos...");
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
			sentencia = conn.createStatement();
			System.out.println("Conectado...");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo conectar a la base de datos...");
		}
	}
	
	public int actualizar(String a2) {
		int filas=0;
		try {
			sentencia.executeUpdate(a2);
			filas=sentencia.getUpdateCount();
			Grafica.mensaje();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al actualizar...");
		}
		
		return filas;
	}
	
	public void cerrarConexion() throws SQLException {
		conn.close();
		System.out.println("Desconectado");
	}

}
