package PBL3_DA.DTO;

public class TAI_KHOAN {
	int id;
	String email;
	String pass;
	String username;
	int sdt;
	int type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getSdt() {
		return sdt;
	}

	public void setSdt(int sdt) {
		this.sdt = sdt;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public TAI_KHOAN(int id, String email, String pass, String username, int sdt, int type) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
		this.username = username;
		this.sdt = sdt;
		this.type = type;
	}

	public TAI_KHOAN() {}
	
}
