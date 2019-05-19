package sql;

import java.sql.*;
import java.util.Scanner;

public class Ventas {

	public Ventas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection conn;
		Statement sentencia,datos;
		ResultSet resultado;
		
		System.out.println("Conexion a la base de datos...");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No se pudo cargar el driver JDBC");
			return;
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
			sentencia = conn.createStatement();
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println( "No hay conexión con la base de datos." );
			return;
		}
		/*
		try {
			System.out.println("Creando tabla...");
			sentencia.executeQuery("create table Ventas(cod_ventas varchar2(10) primary key, anho integer, importe float)");
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error en la creación");
		}
		*/
		/*
		try {
			System.out.println("Ingresando datos...");
			//sentencia.executeUpdate("insert into Ventas values('001A',2013,100.000F)");
			//sentencia.executeUpdate("insert into Ventas values('001B',2014,150.300F)");
			//sentencia.executeUpdate("insert into Ventas values('001C',2015,170.850F)");
			sentencia.executeUpdate("insert into Ventas values('002A',2013,135.020F)");
			sentencia.executeUpdate("insert into Ventas values('002B',2014,350.300F)");
			sentencia.executeUpdate("insert into Ventas values('002C',2015,70.150F)");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al subir los datos");
			
		}
		*/
		/*
		try {
			System.out.println( "Seleccionando..." );
			resultado = sentencia.executeQuery("SELECT sum(importe), anho FROM Ventas group by anho");
			while(resultado.next()){
				System.out.println("El importe del "+resultado.getInt(2)+" son: "+resultado.getFloat(1));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error: " +e.getMessage());
		}
		*/
		
		
		int ini, fin;
		System.out.print("Ingrese el año de inicio:");
		ini=sc.nextInt();
		System.out.print("Ingrese el año final:");
		fin=sc.nextInt();
		
		try {
			for (int i = ini; i <= fin; i++) {
			sentencia.executeQuery("create table ventas+ini()");
		}
		
		} catch (SQLException e) {
			// TODO: handle exception
			
		}
		System.out.println("Correcto");

	}

}
