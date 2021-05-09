package PBL3_DA.DTO;

public class NN_TH {
	int id;
	String loaiNgonNgu;
	String trinhDo;
	String listening;
	String speaking;
	String reading;
	String writing;
	String word;
	String excel;
	String powerPoint;
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
	public String getListening() {
		return listening;
	}
	public void setListening(String listening) {
		this.listening = listening;
	}
	public String getSpeaking() {
		return speaking;
	}
	public void setSpeaking(String speaking) {
		this.speaking = speaking;
	}
	public String getReading() {
		return reading;
	}
	public void setReading(String reading) {
		this.reading = reading;
	}
	public String getWriting() {
		return writing;
	}
	public void setWriting(String writing) {
		this.writing = writing;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getExcel() {
		return excel;
	}
	public void setExcel(String excel) {
		this.excel = excel;
	}
	public String getPowerPoint() {
		return powerPoint;
	}
	public void setPowerPoint(String powerPoint) {
		this.powerPoint = powerPoint;
	}
	public NN_TH(int id, String loaiNgonNgu, String trinhDo, String listening, String speaking, String reading,
			String writing, String word, String excel, String powerPoint) {
		super();
		this.id = id;
		this.loaiNgonNgu = loaiNgonNgu;
		this.trinhDo = trinhDo;
		this.listening = listening;
		this.speaking = speaking;
		this.reading = reading;
		this.writing = writing;
		this.word = word;
		this.excel = excel;
		this.powerPoint = powerPoint;
	}
	public NN_TH() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
