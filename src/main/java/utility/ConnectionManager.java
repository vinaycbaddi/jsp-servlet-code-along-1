package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
	
//	Method to get properties from the jdbc.properties file
//	public static Properties loadPropertiesFile() throws IOException {
//		Properties prop = new Properties();
//		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		prop.load(in);
//		in.close();
//		return prop;
//	}
//

	public static Connection getConnection() throws IOException {
		Connection con = null;
//		Properties newprop = new Properties();
//		newprop = loadPropertiesFile();
//		String driver = newprop.getProperty("driver");
//		String url = newprop.getProperty("url");
//		String username = newprop.getProperty("username");
//		String password = newprop.getProperty("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog", "root", "Vinaycb@9211");
			if (con != null) {
				System.out.print("Connection Established");
			}
		} catch (Exception e) {
			System.out.println("No Connection");
			System.out.println(e.getMessage());
		}
		return con;
	}
}
