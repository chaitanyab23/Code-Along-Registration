package mainApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//register driver class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create the connection object
		Connection con =null;
		con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","SYSTEM","Root123");
		System.out.println(con);
		return con;
		
	}
}
