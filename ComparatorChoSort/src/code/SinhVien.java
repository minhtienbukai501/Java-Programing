package code;

public class SinhVien {
	private String maSinhVien, hoTen, lop;
	private double gpa;
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public SinhVien(String maSinhVien, String hoTen, String lop, double gpa) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.lop = lop;
		this.gpa = gpa;
	}
	
	
	@Override
	public String toString() {
		return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + String.format("%.2f", this.gpa);
	}
}
