package PBL3_DA.DTO;

public class NN_TH {
	int id;
	String loaiNgonNgu;
	String trinhDo;
	String bangCap;
	boolean word;
	boolean excel;
	boolean powerPoint;
	boolean outLook;
	String phanMemKhac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoaiNgonNgu() {
		return loaiNgonNgu;
	}

	public void setLoaiNgonNgu(String loaiNgonNgu) {
		this.loaiNgonNgu = loaiNgonNgu;
	}

	public String getTrinhDo() {
		return trinhDo;
	}

	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}

	public String getBangCap() {
		return bangCap;
	}

	public void setBangCap(String bangCap) {
		this.bangCap = bangCap;
	}

	public boolean isWord() {
		return word;
	}

	public void setWord(boolean word) {
		this.word = word;
	}

	public boolean isExcel() {
		return excel;
	}

	public void setExcel(boolean excel) {
		this.excel = excel;
	}

	public boolean isPowerPoint() {
		return powerPoint;
	}

	public void setPowerPoint(boolean powerPoint) {
		this.powerPoint = powerPoint;
	}

	public boolean isOutLook() {
		return outLook;
	}

	public void setOutLook(boolean outLook) {
		this.outLook = outLook;
	}

	public String getPhanMemKhac() {
		return phanMemKhac;
	}

	public void setPhanMemKhac(String phanMemKhac) {
		this.phanMemKhac = phanMemKhac;
	}

	public NN_TH(String loaiNgonNgu, String trinhDo, String bangCap, boolean word, boolean excel, boolean powerPoint,
			boolean outLook, String phanMemKhac) {
		super();
		this.loaiNgonNgu = loaiNgonNgu;
		this.trinhDo = trinhDo;
		this.bangCap = bangCap;
		this.word = word;
		this.excel = excel;
		this.powerPoint = powerPoint;
		this.outLook = outLook;
		this.phanMemKhac = phanMemKhac;
	}

	public NN_TH() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NN_TH(int id, String loaiNgonNgu, String trinhDo, String bangCap, boolean word, boolean excel,
			boolean powerPoint, boolean outLook, String phanMemKhac) {
		super();
		this.id = id;
		this.loaiNgonNgu = loaiNgonNgu;
		this.trinhDo = trinhDo;
		this.bangCap = bangCap;
		this.word = word;
		this.excel = excel;
		this.powerPoint = powerPoint;
		this.outLook = outLook;
		this.phanMemKhac = phanMemKhac;
	}

}
