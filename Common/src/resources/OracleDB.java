package resources;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDB {

	public static final String DB_DATACACHE_URL = "jdbc:oracle:thin:@10.37.141.22:1521:cache1";
	public static final String DB_ODS_URL = "jdbc:oracle:thin:@10.102.157.90:1521:ods";
	public static final String DB_PAYLD_URL = "jdbc:oracle:thin:@//10.37.141.26:1521/recv_cpyld.isit0";
	public static final String DB_PAYLD_URL_NEW = "jdbc:oracle:thin:cpyld_read/cpyld_read@//10.37.141.26:1521/recv_cpyld.isit0";
	public static final String DB_SS_URL = "jdbc:oracle:thin:test_user/test_user@//10.37.141.26:1521/ss_cssrv.isit0";
	public static final String DBUSER = "test_user";
	public static final String DBPASS = "test_user";

	public static void main(String[] argv) throws SQLException {

		System.out.println("-------- Oracle JDBC Connection Testing ------");

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					DB_PAYLD_URL_NEW, DBUSER, DBPASS);

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}

		Statement stat = connection.createStatement();

		System.out.println("statement created");

		ResultSet rs = stat.executeQuery("SELECT * FROM SEC_COMMS_LOOKUP_2703 WHERE EF_DESCRIPTION = 'C&E Letter'");
		
		System.out.println("Result set created");

		while (rs.next()){
			String ef_class = rs.getString("EF_CLASS");
			String ef_doc_type = rs.getString("EF_DOC_TYPE");
			String ef_desc = rs.getString("EF_DESCRIPTION");
			System.out.println(ef_class + " " + ef_doc_type + " " + ef_desc);

		}

	}
}