package PBL3_DA.DTO;

import java.sql.Date;

public class BANG_CAP {
	int id;
	String trinhDo;
	String donViDaoTao;
	Date thoiGianBatDau;
	Date thoiGianKetThuc;
	String chuyenNganh;
	String loaiTotNghiep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getDonViDaoTao() {
		return donViDaoTao;
	}

	public void setDonViDaoTao(String donViDaoTao) {
		this.donViDaoTao = donViDaoTao;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getLoaiTotNghiep() {
		return loaiTotNghiep;
	}

	public void setLoaiTotNghiep(String loaiTotNghiep) {
		this.loaiTotNghiep = loaiTotNghiep;
	}

	public BANG_CAP() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BANG_CAP(int id, String trinhDo, String donViDaoTao, Date thoiGianBatDau, Date thoiGianKetThuc,
			String chuyenNganh, String loaiTotNghiep) {
		super();
		this.id = id;
		this.trinhDo = trinhDo;
		this.donViDaoTao = donViDaoTao;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.chuyenNganh = chuyenNganh;
		this.loaiTotNghiep = loaiTotNghiep;
	}

	public BANG_CAP(String trinhDo, String donViDaoTao, Date thoiGianBatDau, Date thoiGianKetThuc, String chuyenNganh,
			String loaiTotNghiep) {
		super();
		this.trinhDo = trinhDo;
		this.donViDaoTao = donViDaoTao;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.chuyenNganh = chuyenNganh;
		this.loaiTotNghiep = loaiTotNghiep;
	}

}
