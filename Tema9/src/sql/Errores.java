package sql;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class Errores {
	
	Scanner sc=new Scanner(System.in);
	
	Connection conn;
	Statement sentencia;
	ResultSet resultado;
	
	String dni;
	int salario;
	
	FileWriter archivo;

	public Errores() {
		// TODO Auto-generated constructor stub
	}
	
	// Se inicializa la instancia FILEWRITER
	public Errores(String a) {
		// TODO Auto-generated constructor stub
		try {
			archivo=new FileWriter(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// Cargar el driver
	void cargarDriver() {
		System.out.println("Cargando el driver...");
		try{ // Se carga el driver JDBC-ODBC
			Class.forName("oracle.jdbc.OracleDriver");
		} catch( Exception e ) {
			System.out.println( "No se pudo cargar el driver JDBC");
		}
	}
	
	// Conexión con la base de datos
	public void conectar1() {
		System.out.println("Conexión a la base de datos...");
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
			sentencia = conn.createStatement();
			System.out.println("Conectado =)");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo conectar a la base de datos...");
		}
	}
	
	public void datos() {
		System.out.println("Ingrese el dni:");
		dni=sc.nextLine();
		System.out.println("Ingrese el nuevo salario:");
		salario=sc.nextInt();
	}
	
	public void comprobación() {
		try {
			sentencia.executeQuery("select * from empleados where dni="+dni);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No existe el dni en la bd");
			try {
				archivo.write("En la base de datos no se encuentra el dni:"+dni);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public void actualizar() {
		try {
			sentencia.execute("update empleados set salario="+salario+" where dni="+dni);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Cierra la conexión con la base de datos	
	public void cerrarConexion() throws SQLException {
		conn.close();
		System.out.println("Desconectado chauuuu!!!");
	}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Errores er1=new Errores();
		er1.cargarDriver();
		er1.conectar1();
		er1.datos();
		er1.comprobación();
		
		try {
			er1.cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
