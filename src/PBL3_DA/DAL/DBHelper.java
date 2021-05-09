package PBL3_DA.DAL;

import java.sql.*;

public class DBHelper {
	private Connection connection;
	private static DBHelper _instance;
	public static DBHelper Instance() {
		if(_instance == null) _instance = new DBHelper();
		return _instance;
	}
//	private static Connection connection = null;
//	
//	public DBHelper() {
//		if(connection == null) {
//			try {
//				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//				connection = DriverManager.getConnection("jdbc:sqlserver://localhost","sa","sa");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Error "+ e);
//			}
//		}
//	}
//	
//	public static ResultSet executeQuery(String spName) throws SQLException{
//		if(connection != null) {
//			
//		}
//	}
	public ResultSet getResultSet(String query) {
		Statement statement = null;
		ResultSet resultSet = null;
		try {
		connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam",
				"sa","sa");
		statement = connection.createStatement();
		resultSet = statement.executeQuery(query);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error "+ e);
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("Error "+e);
				}
			}
		}
		return resultSet;
	}

	
}
