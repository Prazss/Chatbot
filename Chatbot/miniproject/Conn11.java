package miniproject;

import java.sql.*;
public class Conn11 {
	
	public static void DriverTest() {

            try {
                Class.forName("com.mysql.jdbc.Driver"); //mysql
                System.out.println("Driver tested!");
            } catch (java.lang.ClassNotFoundException e) {
                System.out.println("Class Not Found Exception!");
            }
        }
}
