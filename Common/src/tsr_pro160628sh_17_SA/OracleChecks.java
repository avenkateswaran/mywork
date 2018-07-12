package tsr_pro160628sh_17_SA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import resources.OracleDB;

public class OracleChecks{

	public String utr;
	public static String CONVERSATION_ID;
	public static String EVENT_CODE;
	public static String SERVICE_ID;

//	public static void main(String[] argv) throws SQLException {
//		System.out.println("-------- Start DB Checking ------");
//		executeUtrStatement();
//		executeConversationIDStatement();
//		executeTrackingEventStatement();
//		System.out.println("-------- End DB Checking ------");
//	}

	public OracleChecks(String utr) {
		this.utr = utr;
	}

	public String executeUtrStatement() throws SQLException {
		// System.out.println("-------- Oracle JDBC Connection Testing
		// -w-----");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return "";
		}
		// System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(OracleDB.DB_PAYLD_URL, OracleDB.DBUSER, OracleDB.DBPASS);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return "";
		}
		if (connection != null) {
			// System.out.println("You made it, take control your database
			// now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		Statement stat = connection.createStatement();
		ResultSet rs = stat.executeQuery(
				"SELECT * FROM (SELECT CONVERSATION_ID FROM PAYLD_DATA.RECEIVED_MESSAGES WHERE CREDENTIALS LIKE " + utr
				+ " ORDER BY CREATION_TIMESTAMP DESC) WHERE ROWNUM = '1'");
		while (rs.next()) {
			CONVERSATION_ID = rs.getString("CONVERSATION_ID");
		}
		return ("FACTA ISIT PAYLD.PAYLD_DATA.RECEIVED_MESSAGES | CONVERSATION_ID: " + CONVERSATION_ID
				+ " | UTR: " + utr);
	}

	public String executeConversationIDStatement() throws SQLException {
		// System.out.println("-------- Oracle JDBC Connection Testing ------");
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return "";
		}
		// System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(OracleDB.DB_SS_URL, OracleDB.DBUSER, OracleDB.DBPASS);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return "";
		}
		if (connection != null) {
			// System.out.println("You made it, take control your database
			// now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		Statement stat = connection.createStatement();
		ResultSet rs = stat.executeQuery(
				"SELECT * FROM CESAPROXY_DATA.CESA_MESSAGES WHERE CONVERSATION_ID = " + "'" + CONVERSATION_ID + "'");
		while (rs.next()) {
			CONVERSATION_ID = rs.getString("CONVERSATION_ID");
			SERVICE_ID = rs.getString("SERVICE_ID");
		}
		return ("FACTA ISIT SS.CESAPROXY_DATA.CESA_MESSAGES | CONVERSATION_ID: " + CONVERSATION_ID
				+ " | SERVICE_ID: " + SERVICE_ID);
	}

	public String executeTrackingEventStatement() throws SQLException {
		// System.out.println("-------- Oracle JDBC Connection Testing ------");
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return "";
		}
		// System.out.println("Oracle JDBC Driver Registered!");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(OracleDB.DB_SS_URL, OracleDB.DBUSER, OracleDB.DBPASS);
		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return "";
		}
		if (connection != null) {
			// System.out.println("You made it, take control your database
			// now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		Statement stat = connection.createStatement();
		ResultSet rs = stat.executeQuery(
				"SELECT * FROM CESAPROXY_DATA.TRACKING_EVENT WHERE CONVERSATION_ID = " + "'" + CONVERSATION_ID + "'");
		while (rs.next()) {
			EVENT_CODE = rs.getString("EVENT_CODE");
		}
		return ("FACTA ISIT SS.CESAPROXY_DATA.TRACKING_EVENT | EVENT_CODE: " + EVENT_CODE
				+ " | CONVERSATION_ID: " + CONVERSATION_ID);
	}

	public Boolean checkSubmissionSuccessful() {
		return "2121" == EVENT_CODE;
	}
}
