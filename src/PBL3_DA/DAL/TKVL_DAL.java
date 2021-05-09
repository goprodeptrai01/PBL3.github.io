package PBL3_DA.DAL;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import PBL3_DA.DTO.HO_SO;

public class TKVL_DAL {
	private Connection connection;
	private static TKVL_DAL _instance;
	public static TKVL_DAL Instance() {
		if(_instance == null) _instance = new TKVL_DAL();
		return _instance;
	}
	
	private TKVL_DAL() {
		
	}
	
	public List<HO_SO> GetAllListHS_DAL() {
		List<HO_SO> hsList = new ArrayList<>();
		try {
			String query = "select * from HO_SO";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				HO_SO hs = new HO_SO(resultSet.getInt("id"), resultSet.getString("Fullname"),
						resultSet.getDate("NgaySinh"), resultSet.getBoolean("GioiTinh"),
						resultSet.getString("KinhNghiem"), resultSet.getString("ViTriHienTai"),
						resultSet.getString("ViTriMongMuon"), resultSet.getInt("MucLuongMongMuon"),
						resultSet.getString("NoiLamViec"), resultSet.getString("MucTieuCV"),
						resultSet.getString("TenCongTyDangLam"), resultSet.getDate("ThoiGianBatDauLam"),
						resultSet.getDate("ThoiGianKetThucLam"), resultSet.getInt("MucLuong"),
						resultSet.getString("MoTaCV"), resultSet.getInt("id_DC"), resultSet.getInt("id_BC"),
						resultSet.getInt("idNN_TH"), resultSet.getInt("id_KN"));
				hsList.add(hs);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
		return hsList;
	}

	public void addHO_SO_DAL(HO_SO hs) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam",
					"sa","sa");
			
			String query = "insert into HO_SO(id,Fullname,NgaySinh,GioiTinh,KinhNghiem,ViTriHienTai,ViTriMongMuon,"
					+ "MucLuongMongMuon,NoiLamViec,MucTieuCV,TenCongTyDangLam,ThoiGianBatDauLam,ThoiGianKetThucLam,"
					+ "MucLuong,MoTaCV,id_DC,id_BC,idNN_TH,id_KN) values (@id,@Fullname,@NgaySinh,@GioiTinh,@KinhNghiem,@ViTriHienTai,@ViTriMongMuon,"
					+ "@MucLuongMongMuon,@NoiLamViec,@MucTieuCV,@TenCongTyDangLam,@ThoiGianBatDauLam,@ThoiGianKetThucLam,"
					+ "@MucLuong,@MoTaCV,@id_DC,@id_BC,@idNN_TH,@id_KN)";
			statement = connection.prepareCall(query);
			statement.setInt(1, hs.getId());
			statement.setString(2, hs.getFullname());
			statement.setDate(3, hs.getNgaySinh());
			statement.setBoolean(4, hs.getGioiTinh());
			statement.setString(5, hs.getKinhNghiem());
			statement.setString(6, hs.getViTriHienTai());
			statement.setString(7, hs.getViTriMongMuon());			
			statement.setInt(8, hs.getMucLuongMongMuon());
			statement.setString(9, hs.getNoiLamViec());
			statement.setString(10, hs.getMucTieuCV());
			statement.setString(11, hs.getTenCongTyDangLam());
			statement.setDate(12, hs.getThoiGianBatDauLam());
			statement.setDate(13, hs.getThoiGianKetThucLam());
			statement.setInt(14, hs.getMucLuong());
			statement.setString(15, hs.getMoTaCV());
			statement.setInt(16, hs.getId_DC());
			statement.setInt(16, hs.getId_BC());
			statement.setInt(16, hs.getIdNN_TH());
			statement.setInt(16, hs.getId_KN());
			
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}
	
	public void editHO_SO_DAL(HO_SO hs) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam",
					"sa","sa");
			
			String query = "update HO_SO set Fullname=@Fullname,NgaySinh=@NgaySinh,GioiTinh=@GioiTinh,KinhNghiem=@KinhNghiem,"
					+ "ViTriHienTai=@ViTriHienTai,ViTriMongMuon=@ViTriMongMuon,"
					+ "MucLuongMongMuon=@MucLuongMongMuon,NoiLamViec=@NoiLamViec,MucTieuCV=@MucTieuCV,TenCongTyDangLam=@TenCongTyDangLam,"
					+ "ThoiGianBatDauLam=@ThoiGianBatDauLam,ThoiGianKetThucLam=@ThoiGianKetThucLam,"
					+ "MucLuong=@MucLuong,MoTaCV=@MoTaCV,id_DC=@id_DC,id_BC=@id_BC,idNN_TH=@idNN_TH,id_KN=@id_KN where id=@id";
			statement = connection.prepareCall(query);
			
			statement.setString(1, hs.getFullname());
			statement.setDate(2, hs.getNgaySinh());
			statement.setBoolean(3, hs.getGioiTinh());
			statement.setString(4, hs.getKinhNghiem());
			statement.setString(5, hs.getViTriHienTai());
			statement.setString(6, hs.getViTriMongMuon());			
			statement.setInt(7, hs.getMucLuongMongMuon());
			statement.setString(8, hs.getNoiLamViec());
			statement.setString(9, hs.getMucTieuCV());
			statement.setString(10, hs.getTenCongTyDangLam());
			statement.setDate(11, hs.getThoiGianBatDauLam());
			statement.setDate(12, hs.getThoiGianKetThucLam());
			statement.setInt(13, hs.getMucLuong());
			statement.setString(14, hs.getMoTaCV());
			statement.setInt(15, hs.getId_DC());
			statement.setInt(16, hs.getId_BC());
			statement.setInt(17, hs.getIdNN_TH());
			statement.setInt(18, hs.getId_KN());
			statement.setInt(19, hs.getId());
			
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}
	public void delHO_SO_DAL(HO_SO hs) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam;",
					"sa","sa");
			
			String query = "delete from HO_SO where id=@id";
			statement = connection.prepareCall(query);

			statement.setInt(1, hs.getId());
			
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}
}
