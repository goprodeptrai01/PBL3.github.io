package PBL3_DA.DTO;

import java.sql.Date;

public class HO_SO_VIEW {
	int id,sdt;
	String hoTen,tinh;
	Date ngaySinh;
	Boolean gioiTinh;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public Boolean getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public HO_SO_VIEW(int id, int sdt, String hoTen, String tinh, Date ngaySinh, Boolean gioiTinh) {
		super();
		this.id = id;
		this.sdt = sdt;
		this.hoTen = hoTen;
		this.tinh = tinh;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}
	public HO_SO_VIEW() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
