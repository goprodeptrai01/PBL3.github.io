package PBL3_DA.DTO;

import java.sql.Date;

public class HO_SO {
	int id;
	String Fullname;
	Date NgaySinh;
	boolean GioiTinh;
	String KinhNghiem;
	String ViTriHienTai;
	String ViTriMongMuon;
	int MucLuongMongMuon;
	String NoiLamViec;
	String MucTieuCV;
	String TenCongTyDangLam;
	Date ThoiGianBatDauLam;
	Date ThoiGianKetThucLam;
	int MucLuong;
	String MoTaCV;
	int id_DC;
	int id_BC;
	int idNN_TH;
	int id_KN;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public boolean getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getKinhNghiem() {
		return KinhNghiem;
	}
	public void setKinhNghiem(String kinhNghiem) {
		KinhNghiem = kinhNghiem;
	}
	public String getViTriHienTai() {
		return ViTriHienTai;
	}
	public void setViTriHienTai(String viTriHienTai) {
		ViTriHienTai = viTriHienTai;
	}
	public String getViTriMongMuon() {
		return ViTriMongMuon;
	}
	public void setViTriMongMuon(String viTriMongMuon) {
		ViTriMongMuon = viTriMongMuon;
	}
	public int getMucLuongMongMuon() {
		return MucLuongMongMuon;
	}
	public void setMucLuongMongMuon(int mucLuongMongMuon) {
		MucLuongMongMuon = mucLuongMongMuon;
	}
	public String getNoiLamViec() {
		return NoiLamViec;
	}
	public void setNoiLamViec(String noiLamViec) {
		NoiLamViec = noiLamViec;
	}
	public String getMucTieuCV() {
		return MucTieuCV;
	}
	public void setMucTieuCV(String mucTieuCV) {
		MucTieuCV = mucTieuCV;
	}
	public String getTenCongTyDangLam() {
		return TenCongTyDangLam;
	}
	public void setTenCongTyDangLam(String tenCongTyDangLam) {
		TenCongTyDangLam = tenCongTyDangLam;
	}
	public Date getThoiGianBatDauLam() {
		return ThoiGianBatDauLam;
	}
	public void setThoiGianBatDauLam(Date thoiGianBatDauLam) {
		ThoiGianBatDauLam = thoiGianBatDauLam;
	}
	public Date getThoiGianKetThucLam() {
		return ThoiGianKetThucLam;
	}
	public void setThoiGianKetThucLam(Date thoiGianKetThucLam) {
		ThoiGianKetThucLam = thoiGianKetThucLam;
	}
	public int getMucLuong() {
		return MucLuong;
	}
	public void setMucLuong(int mucLuong) {
		MucLuong = mucLuong;
	}
	public String getMoTaCV() {
		return MoTaCV;
	}
	public void setMoTaCV(String moTaCV) {
		MoTaCV = moTaCV;
	}
	public int getId_DC() {
		return id_DC;
	}
	public void setId_DC(int id_DC) {
		this.id_DC = id_DC;
	}
	public int getId_BC() {
		return id_BC;
	}
	public void setId_BC(int id_BC) {
		this.id_BC = id_BC;
	}
	public int getIdNN_TH() {
		return idNN_TH;
	}
	public void setIdNN_TH(int idNN_TH) {
		this.idNN_TH = idNN_TH;
	}
	public int getId_KN() {
		return id_KN;
	}
	public void setId_KN(int id_KN) {
		this.id_KN = id_KN;
	}
	public HO_SO(int id, String fullname, Date ngaySinh, boolean b, String kinhNghiem, String viTriHienTai,
			String viTriMongMuon, int mucLuongMongMuon, String noiLamViec, String mucTieuCV, String tenCongTyDangLam,
			Date thoiGianBatDauLam, Date thoiGianKetThucLam, int mucLuong, String moTaCV, int id_DC, int id_BC,
			int idNN_TH, int id_KN) {
		super();
		this.id = id;
		Fullname = fullname;
		NgaySinh = ngaySinh;
		GioiTinh = b;
		KinhNghiem = kinhNghiem;
		ViTriHienTai = viTriHienTai;
		ViTriMongMuon = viTriMongMuon;
		MucLuongMongMuon = mucLuongMongMuon;
		NoiLamViec = noiLamViec;
		MucTieuCV = mucTieuCV;
		TenCongTyDangLam = tenCongTyDangLam;
		ThoiGianBatDauLam = thoiGianBatDauLam;
		ThoiGianKetThucLam = thoiGianKetThucLam;
		MucLuong = mucLuong;
		MoTaCV = moTaCV;
		this.id_DC = id_DC;
		this.id_BC = id_BC;
		this.idNN_TH = idNN_TH;
		this.id_KN = id_KN;
	}
	public HO_SO(String fullname, Date ngaySinh, boolean gioiTinh, String kinhNghiem, String viTriHienTai,
			String viTriMongMuon, int mucLuongMongMuon, String noiLamViec, String mucTieuCV, String tenCongTyDangLam,
			Date thoiGianBatDauLam, Date thoiGianKetThucLam, int mucLuong, String moTaCV, int id_DC, int id_BC,
			int idNN_TH, int id_KN) {
		super();
		Fullname = fullname;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		KinhNghiem = kinhNghiem;
		ViTriHienTai = viTriHienTai;
		ViTriMongMuon = viTriMongMuon;
		MucLuongMongMuon = mucLuongMongMuon;
		NoiLamViec = noiLamViec;
		MucTieuCV = mucTieuCV;
		TenCongTyDangLam = tenCongTyDangLam;
		ThoiGianBatDauLam = thoiGianBatDauLam;
		ThoiGianKetThucLam = thoiGianKetThucLam;
		MucLuong = mucLuong;
		MoTaCV = moTaCV;
		this.id_DC = id_DC;
		this.id_BC = id_BC;
		this.idNN_TH = idNN_TH;
		this.id_KN = id_KN;
	}
	public HO_SO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
