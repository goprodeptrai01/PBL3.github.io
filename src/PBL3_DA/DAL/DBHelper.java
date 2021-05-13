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
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam;",
				"sa","sa");
			if(connection != null) System.out.println("successful");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error "+ e);
		}
//		finally {
//			if(connection != null) {
//				try {
//					connection.close();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					System.out.println("Error "+e);
//				}
//			}
//		}
		return resultSet;
	}
	public static void main(String args[]) {
		DBHelper testcnn = new DBHelper();
		try {
			ResultSet resultSet = testcnn.getResultSet("select HS.Id,HS.Fullname,TK.Sdt,HS.NgaySinh,HS.GioiTinh,DC.Tinh from HO_SO as HS LEFT JOIN TAI_KHOAN TK ON HS.Id = TK.Id LEFT JOIN DIA_CHI DC ON HS.IdDC = DC.Id");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();
			
			for(int j = 1;j<=socot;j++) {
				System.out.print(rsmd.getColumnLabel(j)+"\t");
			}
			System.out.println("\n");
			while(resultSet.next()) {
				for(int i = 1; i<= socot;i++) {
					System.out.print(resultSet.getObject(i)+"\t");
				}
				System.out.println("\n");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error connection "+ e);
		}
	}
	
}
