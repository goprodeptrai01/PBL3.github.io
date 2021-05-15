package PBL3_DA.DAL;

import java.sql.*;

import PBL3_DA.DTO.BANG_CAP;
import PBL3_DA.DTO.DIA_CHI;
import PBL3_DA.DTO.KI_NANG;
import PBL3_DA.DTO.NN_TH;

public class DBHelper {
	private Connection connection;
	private static DBHelper _instance;

	public static DBHelper Instance() {
		if (_instance == null)
			_instance = new DBHelper();
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
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam;", "sa",
					"sa");
			if (connection != null)
				System.out.println("successful");
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("Error " + e);
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

	public int AddandGetIDBC(BANG_CAP bc) {
		DBHelper testcnn = new DBHelper();
		try {
			PreparedStatement statement = null;
			Connection connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam", "sa", "sa");

			String query = "insert into BANG_CAP(TrinhDo,DonViDaoTao,ThoiGianBatDau,ThoiGianKetThuc,ChuyenNganh,LoaiTotNghiep) values (?,?,?,?,?,?) ";
			statement = connection.prepareCall(query);
			statement.setString(1, bc.getTrinhDo());
			statement.setString(2, bc.getDonViDaoTao());
			statement.setDate(3, bc.getThoiGianBatDau());
			statement.setDate(4, bc.getThoiGianKetThuc());
			statement.setString(5, bc.getChuyenNganh());
			statement.setString(6, bc.getLoaiTotNghiep());
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error insert " + e);
		}
		try {
			ResultSet resultSet = testcnn.getResultSet("SELECT TOP 1 Id from BANG_CAP ORDER BY Id Desc");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= socot; i++) {
					bc.setId(resultSet.getInt(i));
				}
				System.out.println("\n");
			}
			return bc.getId();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error get " + e);
			return 0;
		}

	}

	public int AddandGetIDDC(DIA_CHI dc) {
		DBHelper testcnn = new DBHelper();
		try {
			PreparedStatement statement = null;
			Connection connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam", "sa", "sa");

			String query = "insert into DIA_CHI(Tinh,DiaChiChiTiet) values (?,?)";
			statement = connection.prepareCall(query);
			statement.setString(1, dc.getTinh());
			statement.setString(2, dc.getDiaChiChiTiet());
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error insert " + e);
		}
		try {
			ResultSet resultSet = testcnn.getResultSet("SELECT TOP 1 Id from DIA_CHI ORDER BY Id Desc");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= socot; i++) {
					dc.setId(resultSet.getInt(i));
				}
				System.out.println("\n");
			}
			return dc.getId();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error get " + e);
			return 0;
		}

	}

	public int AddandGetIDKN(KI_NANG kn) {
		DBHelper testcnn = new DBHelper();
		try {
			PreparedStatement statement = null;
			Connection connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam", "sa", "sa");

			String query = "insert into KI_NANG(LanhDao,LamViecNhom,RaChienLuoc,GiaiQuyetVD,QuanLyNhanLuc,GiaoTiep,QuanLyThoiGian,QuanLyDuAn,SangTao,SoThich,KyNangKhac) values (?,?,?,?,?,?,?,?,?,?,?)";
			statement = connection.prepareCall(query);
			statement.setBoolean(1, kn.isLanhDao());
			statement.setBoolean(2, kn.isLamViecNhom());
			statement.setBoolean(3, kn.isRaChienLuoc());
			statement.setBoolean(4, kn.isGiaiQuyetVD());
			statement.setBoolean(5, kn.isQuanLyNhanLuc());
			statement.setBoolean(6, kn.isGiaoTiep());
			statement.setBoolean(7, kn.isQuanLyThoiGian());
			statement.setBoolean(8, kn.isQuanLyDuAn());
			statement.setBoolean(9, kn.isSangTao());
			statement.setString(10, kn.getSoThich());
			statement.setString(11, kn.getKyNangKhac());
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error insert " + e);
		}
		try {
			ResultSet resultSet = testcnn.getResultSet("SELECT TOP 1 Id from KI_NANG ORDER BY Id Desc");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= socot; i++) {
					kn.setId(resultSet.getInt(i));
				}
				System.out.println("\n");
			}
			return kn.getId();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error get " + e);
			return 0;
		}

	}

	public int AddandGetIDNN_TH(NN_TH nt) {
		DBHelper testcnn = new DBHelper();
		try {
			PreparedStatement statement = null;
			Connection connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam", "sa", "sa");

			String query = "insert into NN_TH(LoaiNgonNgu,TrinhDo,BangCap,Word,Excel,PowerPoint,Outlook,PhanMemKhac) values (?,?,?,?,?,?,?,?)";
			statement = connection.prepareCall(query);
			statement.setString(1, nt.getLoaiNgonNgu());
			statement.setString(2, nt.getTrinhDo());
			statement.setString(3, nt.getBangCap());
			statement.setBoolean(4, nt.isWord());
			statement.setBoolean(5, nt.isExcel());
			statement.setBoolean(6, nt.isPowerPoint());
			statement.setBoolean(7, nt.isOutLook());
			statement.setString(8, nt.getPhanMemKhac());
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error insert " + e);
		}
		try {
			ResultSet resultSet = testcnn.getResultSet("SELECT TOP 1 Id from NN_TH ORDER BY Id Desc");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();
			while (resultSet.next()) {
				for (int i = 1; i <= socot; i++) {
					nt.setId(resultSet.getInt(i));
				}
				System.out.println("\n");
			}
			return nt.getId();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error get " + e);
			return 0;
		}

	}

	public static void main(String args[]) {
		DBHelper testcnn = new DBHelper();
		try {
			PreparedStatement statement = null;
			Connection connection = DriverManager
					.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam", "sa", "sa");

			String query = "insert into BANG_CAP(TrinhDo,DonViDaoTao,ThoiGianBatDau,ThoiGianKetThuc,ChuyenNganh,LoaiTotNghiep) values (?,?,?,?,?,?)";
			statement = connection.prepareCall(query);
			statement.setString(1, "Ky su");
			statement.setString(2, "asdasd");
			statement.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			statement.setDate(4, new java.sql.Date(System.currentTimeMillis()));
			statement.setString(5, "czcasc");
			statement.setString(6, "Gioi");
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			ResultSet resultSet = testcnn.getResultSet("SELECT TOP 1 Id from BANG_CAP ORDER BY Id Desc");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int socot = rsmd.getColumnCount();

			for (int j = 1; j <= socot; j++) {
				System.out.print(rsmd.getColumnLabel(j) + "\t");
			}
			System.out.println("\n");
			int temp;
			while (resultSet.next()) {
				for (int i = 1; i <= socot; i++) {
					temp = (int) resultSet.getObject(i);
					System.out.print("Id la: " + temp + "\t");
				}
				System.out.println("\n");
			}
		}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		try {
//			ResultSet resultSet = testcnn.getResultSet("select HS.Id,HS.Fullname,TK.Sdt,HS.NgaySinh,HS.GioiTinh,DC.Tinh from HO_SO as HS LEFT JOIN TAI_KHOAN TK ON HS.Id = TK.Id LEFT JOIN DIA_CHI DC ON HS.IdDC = DC.Id");
//			ResultSetMetaData rsmd = resultSet.getMetaData();
//			int socot = rsmd.getColumnCount();
//			
//			for(int j = 1;j<=socot;j++) {
//				System.out.print(rsmd.getColumnLabel(j)+"\t");
//			}
//			System.out.println("\n");
//			while(resultSet.next()) {
//				for(int i = 1; i<= socot;i++) {
//					System.out.print(resultSet.getObject(i)+"\t");
//				}
//				System.out.println("\n");
//			}
//		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error connection " + e);
		}
	}

}
