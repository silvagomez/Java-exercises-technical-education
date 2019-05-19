package packBarco1;

import java.sql.*;

public class Barco1 {
	
	private String driver;
	
	private String database;
	private String usuario;
	private String password;
	
	private Connection conn;
	private Statement sentencia;
	private ResultSet resultado;
	
	// CONSTRUCTORES

	public Barco1() {
		// TODO Auto-generated constructor stub
	}
	
	public Barco1(String driver, String database, String usuario, String password ) {
		this.driver=driver;
		this.database=database;
		this.usuario=usuario;
		this.password=password;
	}
	public Barco1(String usuario, String password) {
		this.usuario=usuario;
		this.password=password;
		driver="oracle.jdbc.OracleDriver";
		database="jdbc:oracle:thin:@localhost:1521:xe";
	}
	
	//METODOS GET AND SET

	public ResultSet getResultado() {
		return resultado;
	}

	public void setResultado(ResultSet resultado) {
		this.resultado = resultado;
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// METODOS
	
	// Carga el driver oracle.jdbc.OracleDriver
	public void cargarDriver() {
		System.out.println("Cargando el driver...");
		try{ // Se carga el driver JDBC-ODBC
			Class.forName(driver);
		} catch( Exception e ) {
			System.out.println( "No se pudo cargar el driver JDBC");
			return; //termina la ejecución del programa
		};
	}
	
	// Conexión con la base de datos, usuario y password
	public void conectar1() {
		System.out.println("Conexión a la base de datos...");
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
			sentencia = conn.createStatement();
			System.out.println("Conectado :)");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("No se pudo conectar a la base de datos...");
		}
	}
	
	// Conexión con la base de datos, usuario y password
	public void conectar2() throws SQLException {
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "web", "web");
		sentencia = conn.createStatement();
	}
	
	// Cierra la conexión con la base de datos
	public void cerrarConexion() throws SQLException {
		conn.close();
		System.out.println("Desconectado");
	}
	
	// Método para que recibe un string que es una sentencia SELECT
	public ResultSet consulta(String a1) {
		try {
			resultado=sentencia.executeQuery(a1);				
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error: " +e.getMessage());
		}
		return resultado;
	}
	
	//
	public int actualizar(String a2) {
		int filas=0;
		
		try {
			sentencia.executeUpdate(a2);
			filas=sentencia.getUpdateCount();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Error al actualizar...");
		}
		
		return filas;
	}
	
	// Método que borra
	public void borrar(String a3) throws SQLException {
		sentencia.executeUpdate(a3);
	}
	
	// Método que inserta
	public void insertar(String a4) throws SQLException{
		sentencia.executeUpdate(a4);
	}
	
	// Método que crea
	public void crear(String a5) throws SQLException{
		sentencia.executeQuery(a5);
	}

}
