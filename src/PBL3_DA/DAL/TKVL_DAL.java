package PBL3_DA.DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import PBL3_DA.DTO.BANG_CAP;
import PBL3_DA.DTO.DIA_CHI;
import PBL3_DA.DTO.HO_SO;
import PBL3_DA.DTO.KI_NANG;
import PBL3_DA.DTO.NN_TH;
import PBL3_DA.DTO.TAI_KHOAN;

public class TKVL_DAL {
	private Connection connection;
	private static TKVL_DAL _instance;

	public static TKVL_DAL Instance() {
		if (_instance == null)
			_instance = new TKVL_DAL();
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
			System.out.println("Error " + e);
		}
		return hsList;
	}

	public List<DIA_CHI> GetAllListDC_DAL() {
		List<DIA_CHI> dcList = new ArrayList<>();
		try {
			String query = "select * from DIA_CHI";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				DIA_CHI dc = new DIA_CHI(resultSet.getInt("id"), resultSet.getString("Tinh"),
						resultSet.getString("DiaChiChiTiet"));
				dcList.add(dc);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		return dcList;
	}

	public List<TAI_KHOAN> GetAllListTK_DAL() {
		List<TAI_KHOAN> tkList = new ArrayList<>();
		try {
			String query = "select * from TAI_KHOAN";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				TAI_KHOAN tk = new TAI_KHOAN(resultSet.getInt("id"), resultSet.getString("Email"),
						resultSet.getString("Pass"), resultSet.getString("Username"), resultSet.getInt("Sdt"),
						resultSet.getInt("Type"));
				tkList.add(tk);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		return tkList;
	}

	public List<KI_NANG> GetAllListKN_DAL() {
		List<KI_NANG> knList = new ArrayList<>();
		try {
			String query = "select * from KI_NANG";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				KI_NANG kn = new KI_NANG(resultSet.getInt("id"), resultSet.getBoolean("LanhDao"),
						resultSet.getBoolean("LamViecNhom"), resultSet.getBoolean("RaChienLuoc"),
						resultSet.getBoolean("GiaiQuyetVD"), resultSet.getBoolean("QuanLyNhanLuc"),
						resultSet.getBoolean("GiaoTiep"), resultSet.getBoolean("QuanLyThoiGian"),
						resultSet.getBoolean("QuanLyDuAn"), resultSet.getBoolean("SangTao"),
						resultSet.getString("SoThich"), resultSet.getString("KyNangKhac"));
				knList.add(kn);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		return knList;
	}

	public List<BANG_CAP> GetAllListBC_DAL() {
		List<BANG_CAP> bcList = new ArrayList<>();
		try {
			String query = "select * from BANG_CAP";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				BANG_CAP bc = new BANG_CAP(resultSet.getInt("id"), resultSet.getString("TrinhDo"),
						resultSet.getString("DonViDaoTao"), resultSet.getDate("ThoiGianBatDau"),
						resultSet.getDate("ThoiGianKetThuc"), resultSet.getString("ChuyenNganh"),
						resultSet.getString("LoaiTotNghiep"));
				bcList.add(bc);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		return bcList;
	}

	public List<NN_TH> GetAllListNT_DAL() {
		List<NN_TH> ntList = new ArrayList<>();
		try {
			String query = "select * from NN_TH";

			ResultSet resultSet = DBHelper.Instance().getResultSet(query);

			while (resultSet.next()) {
				NN_TH nt = new NN_TH(resultSet.getInt("id"), resultSet.getString("LoaiNgonNgu"),
						resultSet.getString("TrinhDo"), resultSet.getString("BangCap"), resultSet.getBoolean("Word"),
						resultSet.getBoolean("Excel"), resultSet.getBoolean("PowerPoint"),
						resultSet.getBoolean("Outlook"), resultSet.getString("PhanMemKhac"));
				ntList.add(nt);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
		return ntList;
	}

	public void addHO_SO_DAL(HO_SO hs, BANG_CAP bc, DIA_CHI dc, KI_NANG kn, NN_TH nt, TAI_KHOAN tk) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			addBANG_CAP_DAL(bc);
			addDIA_CHI_DAL(dc);
			addKI_NANG_DAL(kn);
			addNN_TH_DAL(nt);

			String query = "insert into HO_SO(Fullname,NgaySinh,GioiTinh,KinhNghiem,ViTriHienTai,ViTriMongMuon,"
					+ "MucLuongMongMuon,NoiLamViec,MucTieuCV,TenCongTyDangLam,ThoiGianBatDauLam,ThoiGianKetThucLam,"
					+ "MucLuong,MoTaCV,id_DC,id_BC,idNN_TH,id_KN) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
			statement.setInt(15, dc.getId());
			statement.setInt(16, bc.getId());
			statement.setInt(17, nt.getId());
			statement.setInt(18, kn.getId());

			statement.execute();

			statement = connection.prepareStatement("update TAI_KHOAN set Sdt=? where id=?");
			statement.setInt(1, tk.getSdt());
			statement.setInt(2, hs.getId());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void addBANG_CAP_DAL(BANG_CAP bc) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "insert into BANG_CAP(TrinhDo,DonViDaoTao,ThoiGianBatDau,ThoiGianKetThuc,ChuyenNganh,LoaiTotNghiep) values (?,?,?,?,?,?)";
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
			System.out.println("Error " + e);
		}
	}

	public void addDIA_CHI_DAL(DIA_CHI dc) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "insert into DIA_CHI(Tinh,DiaChiChiTiet) values (?,?)";
			statement = connection.prepareCall(query);
			statement.setString(1, dc.getTinh());
			statement.setString(2, dc.getDiaChiChiTiet());
			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void addKI_NANG_DAL(KI_NANG kn) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

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
			System.out.println("Error " + e);
		}
	}

	public void addNN_TH_DAL(NN_TH nt) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

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
			System.out.println("Error " + e);
		}
	}

	public void editHO_SO_DAL(HO_SO hs, BANG_CAP bc, DIA_CHI dc, KI_NANG kn, NN_TH nt, TAI_KHOAN tk) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			editBANG_CAP_DAL(bc);
			editDIA_CHI_DAL(dc);
			editKI_NANG_DAL(kn);
			editNN_TH_DAL(nt);

			String query = "update HO_SO set Fullname=?,NgaySinh=?,GioiTinh=?,KinhNghiem=?,ViTriHienTai=?,ViTriMongMuon=?,MucLuongMongMuon=?,NoiLamViec=?,MucTieuCV=?,"
					+ "TenCongTyDangLam=?,ThoiGianBatDauLam=?,ThoiGianKetThucLam=?,MucLuong=?,MoTaCV=? where id=?";
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
			statement.setInt(15, hs.getId());

			statement.execute();

			statement = connection.prepareStatement("update TAI_KHOAN set Sdt=? where id=?");
			statement.setInt(1, tk.getSdt());
			statement.setInt(2, hs.getId());

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void editBANG_CAP_DAL(BANG_CAP bc) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "update BANG_CAP set TrinhDo=?,DonViDaoTao=?,ThoiGianBatDau=?,ThoiGianKetThuc=?,ChuyenNganh=?,LoaiTotNghiep=? where id=?";
			statement = connection.prepareCall(query);
			statement.setString(1, bc.getTrinhDo());
			statement.setString(2, bc.getDonViDaoTao());
			statement.setDate(3, bc.getThoiGianBatDau());
			statement.setDate(4, bc.getThoiGianKetThuc());
			statement.setString(5, bc.getChuyenNganh());
			statement.setString(6, bc.getLoaiTotNghiep());
			statement.setInt(7, bc.getId());

			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void editDIA_CHI_DAL(DIA_CHI dc) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "update DIA_CHI set Tinh=?,DiaChiChiTiet=? where id=?";
			statement = connection.prepareCall(query);
			statement.setString(1, dc.getTinh());
			statement.setString(2, dc.getDiaChiChiTiet());
			statement.setInt(3, dc.getId());

			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void editKI_NANG_DAL(KI_NANG kn) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "update KI_NANG set LanhDao=?,LamViecNhom=?,RaChienLuoc=?,GiaiQuyetVD=?,QuanLyNhanLuc=?,GiaoTiep=?,QuanLyThoiGian=?,QuanLyDuAn=?,SangTao=?,SoThich=?,KyNangKhac=? where id=?";
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
			statement.setInt(12, kn.getId());

			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void editNN_TH_DAL(NN_TH nt) {
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost,DatabaseName=TimKiemViecLam", "sa",
					"sa");

			String query = "update NN_TH set LoaiNgonNgu=?,TrinhDo=?,BangCap=?,Word=?,Excel=?,PowerPoint=?,Outlook=?,PhanMemKhac=? where id=?";
			statement = connection.prepareCall(query);
			statement.setString(1, nt.getLoaiNgonNgu());
			statement.setString(2, nt.getTrinhDo());
			statement.setString(3, nt.getBangCap());
			statement.setBoolean(4, nt.isWord());
			statement.setBoolean(5, nt.isExcel());
			statement.setBoolean(6, nt.isPowerPoint());
			statement.setBoolean(7, nt.isOutLook());
			statement.setString(8, nt.getPhanMemKhac());
			statement.setInt(9, nt.getId());

			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}

	public void delHO_SO_DAL(HO_SO hs) {
		connection = null;
		PreparedStatement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://localhost;DatabaseName=TimKiemViecLam;", "sa",
					"sa");

			String query = "delete from HO_SO where id=@id";
			statement = connection.prepareCall(query);

			statement.setInt(1, hs.getId());

			statement.execute();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error " + e);
		}
	}
}
