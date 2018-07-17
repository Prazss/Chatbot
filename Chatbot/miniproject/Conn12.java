package miniproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn12 {

	public static void main(String[] args) {
		if (Conn12.getConnection().equals(null))
			System.out.println("Failed to connect !!");
		else
			System.out.println("Successfully connected !!");
	}

	public static Connection getConnection() {
		Connection con = null;
		try {
                    Conn11.DriverTest();
                    con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MINI_PROJ","root","prazss21"); 
                    System.out.println("Connection established");
		} catch (SQLException ex) {
                    System.out.println("Connection failed "+ex);
			con = null;
		}
		return (con);
	}
}
