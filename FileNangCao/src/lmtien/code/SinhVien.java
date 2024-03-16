package lmtien.code;

public class SinhVien {
	private String ma, hoten;

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public SinhVien(String ma, String hoten) {
		super();
		this.ma = ma;
		this.hoten = hoten;
	}
	@Override
	public String toString() {
		return this.ma + " " + this.hoten;
	}
}