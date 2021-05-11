package PBL3_DA.DTO;

public class KI_NANG {
	int id;
	boolean lanhDao, lamViecNhom, raChienLuoc, giaiQuyetVD, quanLyNhanLuc, giaoTiep, quanLyThoiGian, quanLyDuAn,
			sangTao;
	String soThich, kyNangKhac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLanhDao() {
		return lanhDao;
	}

	public void setLanhDao(boolean lanhDao) {
		this.lanhDao = lanhDao;
	}

	public boolean isLamViecNhom() {
		return lamViecNhom;
	}

	public void setLamViecNhom(boolean lamViecNhom) {
		this.lamViecNhom = lamViecNhom;
	}

	public boolean isRaChienLuoc() {
		return raChienLuoc;
	}

	public void setRaChienLuoc(boolean raChienLuoc) {
		this.raChienLuoc = raChienLuoc;
	}

	public boolean isGiaiQuyetVD() {
		return giaiQuyetVD;
	}

	public void setGiaiQuyetVD(boolean giaiQuyetVD) {
		this.giaiQuyetVD = giaiQuyetVD;
	}

	public boolean isQuanLyNhanLuc() {
		return quanLyNhanLuc;
	}

	public void setQuanLyNhanLuc(boolean quanLyNhanLuc) {
		this.quanLyNhanLuc = quanLyNhanLuc;
	}

	public boolean isGiaoTiep() {
		return giaoTiep;
	}

	public void setGiaoTiep(boolean giaoTiep) {
		this.giaoTiep = giaoTiep;
	}

	public boolean isQuanLyThoiGian() {
		return quanLyThoiGian;
	}

	public void setQuanLyThoiGian(boolean quanLyThoiGian) {
		this.quanLyThoiGian = quanLyThoiGian;
	}

	public boolean isQuanLyDuAn() {
		return quanLyDuAn;
	}

	public void setQuanLyDuAn(boolean quanLyDuAn) {
		this.quanLyDuAn = quanLyDuAn;
	}

	public boolean isSangTao() {
		return sangTao;
	}

	public void setSangTao(boolean sangTao) {
		this.sangTao = sangTao;
	}

	public String getSoThich() {
		return soThich;
	}

	public void setSoThich(String soThich) {
		this.soThich = soThich;
	}

	public String getKyNangKhac() {
		return kyNangKhac;
	}

	public void setKyNangKhac(String kyNangKhac) {
		this.kyNangKhac = kyNangKhac;
	}

	public KI_NANG(boolean lanhDao, boolean lamViecNhom, boolean raChienLuoc, boolean giaiQuyetVD,
			boolean quanLyNhanLuc, boolean giaoTiep, boolean quanLyThoiGian, boolean quanLyDuAn, boolean sangTao,
			String soThich, String kyNangKhac) {
		super();
		this.lanhDao = lanhDao;
		this.lamViecNhom = lamViecNhom;
		this.raChienLuoc = raChienLuoc;
		this.giaiQuyetVD = giaiQuyetVD;
		this.quanLyNhanLuc = quanLyNhanLuc;
		this.giaoTiep = giaoTiep;
		this.quanLyThoiGian = quanLyThoiGian;
		this.quanLyDuAn = quanLyDuAn;
		this.sangTao = sangTao;
		this.soThich = soThich;
		this.kyNangKhac = kyNangKhac;
	}

	public KI_NANG() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KI_NANG(int id, boolean lanhDao, boolean lamViecNhom, boolean raChienLuoc, boolean giaiQuyetVD,
			boolean quanLyNhanLuc, boolean giaoTiep, boolean quanLyThoiGian, boolean quanLyDuAn, boolean sangTao,
			String soThich, String kyNangKhac) {
		super();
		this.id = id;
		this.lanhDao = lanhDao;
		this.lamViecNhom = lamViecNhom;
		this.raChienLuoc = raChienLuoc;
		this.giaiQuyetVD = giaiQuyetVD;
		this.quanLyNhanLuc = quanLyNhanLuc;
		this.giaoTiep = giaoTiep;
		this.quanLyThoiGian = quanLyThoiGian;
		this.quanLyDuAn = quanLyDuAn;
		this.sangTao = sangTao;
		this.soThich = soThich;
		this.kyNangKhac = kyNangKhac;
	}

}
