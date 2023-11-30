package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

public Connection abrirBaseDatos() {
		
		String urlDB = "jdbc:mysql://localhost:3306/festividades";		
		String user = "root";
		String pw = "12345678";
		
		try {
			Connection accesoDB = DriverManager.getConnection(urlDB, user, pw);

		System.out.println("Conexión establecida ");
		
	
			return accesoDB;
			
		} catch (SQLException e) {
			
			System.out.println("Error ");
			
			// TODO Auto-generated catch block
			return null;			
		} 
		
	}
}
