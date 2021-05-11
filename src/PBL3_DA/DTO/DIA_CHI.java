package PBL3_DA.DTO;

public class DIA_CHI {
	int id;
	String tinh;
	String diaChiChiTiet;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public String getDiaChiChiTiet() {
		return diaChiChiTiet;
	}
	public void setDiaChiChiTiet(String diaChiChiTiet) {
		this.diaChiChiTiet = diaChiChiTiet;
	}
	public DIA_CHI(String tinh, String diaChiChiTiet) {
		super();
		this.tinh = tinh;
		this.diaChiChiTiet = diaChiChiTiet;
	}
	public DIA_CHI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DIA_CHI(int id, String tinh, String diaChiChiTiet) {
		super();
		this.id = id;
		this.tinh = tinh;
		this.diaChiChiTiet = diaChiChiTiet;
	}

	
}
