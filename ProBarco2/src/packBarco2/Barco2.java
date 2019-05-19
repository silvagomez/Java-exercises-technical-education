package packBarco2;

import java.sql.SQLException;
import packBarco1.Barco1;

public class Barco2 {

	public Barco2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Barco1 obj=new Barco1("web","web");
		/*
		obj.setUsuario("web");
		obj.setPassword("web");
		obj.setDriver("oracle.jdbc.OracleDriver");
		obj.setDatabase("jdbc:oracle:thin:@localhost:1521:xe");
		*/
		obj.cargarDriver();
		obj.conectar1();
		
		// Creación de la tabla;
		try {
			System.out.println("Creando tabla...");
			obj.crear("create table VentasB(id_barco varchar2(4) primary key, nombre_barco varchar2(10), id_tipo varchar2(4), dni_propietario varchar2(9))");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo crear la tabla en barco2...");
		}
		
		// Insertar registros
		try {
			System.out.println("Insertando registros...");
			obj.insertar("insert into VentasB values('123a','Ola','z24a','12345678a')");
			obj.insertar("insert into VentasB values('123b','Mar','o88o','12345678b')");
			obj.insertar("insert into VentasB values('123c','Solar','f1','12345678c')");
			obj.insertar("insert into VentasB values('123d','Paraiso','z100','12345678d')");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo insertar datos en la tabla en barco2...");
		}
		
		// Consulta
		try {
			
			obj.consulta("select * from VentasB");
			while(obj.getResultado().next()) {
				System.out.print(" Id del barco: "+obj.getResultado().getString(1));
				System.out.print(" Nombre: "+obj.getResultado().getString(2));
				System.out.print(" Tipo: "+obj.getResultado().getString(3));
				System.out.println(" DNI del dueño: "+obj.getResultado().getString(4));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se puedo realizar le consulta en barco2");
		}
		
		//Modificar un barco
		System.out.println("Modificando...");
			System.out.println("Registros modificados "+obj.actualizar("update VentasB set id_tipo='10' where nombre_barco='Solar'"));

		
		// Visualizar tipos de barcos
		try {
			obj.consulta("select count(*) as cantidad, id_tipo from VentasB group by id_tipo");
			while(obj.getResultado().next()) {
				System.out.print(" Cantidad "+obj.getResultado().getInt(1));
				System.out.println(" Tipo "+obj.getResultado().getString(2));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se puede realizar la consulta en barco2");
		}
			

		
		// Eliminar
		try {
			System.out.println("Eliminando");
			obj.borrar("delete from VentasB where nombre_barco='Paraiso'");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo borar el regitro en barco2");
		}
		
		try {
			obj.cerrarConexion();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("No se pudo cerrar...");
		}

	}

}
