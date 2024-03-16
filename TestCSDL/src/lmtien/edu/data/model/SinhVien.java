package lmtien.edu.data.model;

public class SinhVien {
	private String maSV;
	private String tenSV;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public SinhVien(String maSV, String tenSV) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
	}
	
}
