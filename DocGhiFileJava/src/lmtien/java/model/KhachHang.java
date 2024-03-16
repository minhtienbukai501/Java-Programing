package lmtien.java.model;

import java.io.Serializable;

public class KhachHang implements Serializable{
	private String maKH, tenKH;
	

	public KhachHang(String maKH, String tenKH) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	
	@Override
	public String toString() {
		return this.maKH + " " + this.tenKH;
	}
}
