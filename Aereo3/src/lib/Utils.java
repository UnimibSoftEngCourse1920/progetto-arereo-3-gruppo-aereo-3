package lib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utils {

	//Clark: per connessione al database, al momento o messo i dati del database mio locale
		public static final String DB_USER = "root";
		public static final String DB_PASSWORD = "Beije14";
		public static final String DB_URL = "jdbc:mysql://localhost:3306/compagniaviaggio?serverTimezone=CET";
		
		public static Connection getMySqlConnection(String url, String user, String password) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			return DriverManager.getConnection(url, user, password);
		}
		

}
