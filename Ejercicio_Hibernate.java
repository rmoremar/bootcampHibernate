package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * raul moreno martinez
 */
public class Ejercicio_Hibernate {
	
	private Connection conexion;
	
	public Ejercicio_Hibernate() {
		
		if (establecerConexion() == 0) {
			try {
				PreparedStatement ps = conexion.prepareStatement("SELECT * FROM nttdata_mysql_soccer_team");
				ResultSet resultado = 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.err.println("No se puede conectar");
		}
		
	}
	
	private int establecerConexion() {
		String url = "jdbc:mysql:nttdata_jdbc_ex";
		String user = "usuario";
		String pass = "12345678";
		try {
			conexion = DriverManager.getConnection(url,user,pass);
			return 0;
		} catch (SQLException e) {
			return 1;
		}
	}
	
}