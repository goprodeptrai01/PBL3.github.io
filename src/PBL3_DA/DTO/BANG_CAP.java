package PBL3_DA.DTO;

public class BANG_CAP {
	int id;
	String trinhDo;
	String donViDaoTao;
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
	public String getLoaiTotNghiep() {
		return loaiTotNghiep;
	}
	public void setLoaiTotNghiep(String loaiTotNghiep) {
		this.loaiTotNghiep = loaiTotNghiep;
	}
	public BANG_CAP(int id, String trinhDo, String donViDaoTao, String chuyenNganh, String loaiTotNghiep) {
		super();
		this.id = id;
		this.trinhDo = trinhDo;
		this.donViDaoTao = donViDaoTao;
		this.chuyenNganh = chuyenNganh;
		this.loaiTotNghiep = loaiTotNghiep;
	}
	public BANG_CAP() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
