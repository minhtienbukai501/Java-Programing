package lmtien.java.code;

import java.util.Random;

public class MatHang {
	public static int loaiMatHang = 0;
	private String MaHang, TenHang;
	private int SoLuong, DonGia, SoLuongTonKho;
	private String NgaySanXuat, NgayHetHan;
	private int NgayBaoHanh;
	public String getMaHang() {
		return MaHang;
	}
	public void setMaHang(String maHang) {
		MaHang = maHang;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public int getDonGia() {
		return DonGia;
	}
	public void setDonGia(int donGia) {
		DonGia = donGia;
	}
	public int getSoLuongTonKho() {
		return SoLuongTonKho;
	}
	public void setSoLuongTonKho(int soLuongTonKho) {
		SoLuongTonKho = soLuongTonKho;
	}
	public String getNgaySanXuat() {
		return NgaySanXuat;
	}
	public void setNgaySanXuat(String ngaySanXuat) {
		NgaySanXuat = ngaySanXuat;
	}
	public String getNgayHetHan() {
		return NgayHetHan;
	}
	public void setNgayHetHan(String ngayHetHan) {
		NgayHetHan = ngayHetHan;
	}
	public int getNgayBaoHanh() {
		return NgayBaoHanh;
	}
	public void setNgayBaoHanh(int ngayBaoHanh) {
		NgayBaoHanh = ngayBaoHanh;
	}
	public MatHang(String maHang, String tenHang, int soLuong, int donGia, int soLuongTonKho, String ngaySanXuat,
			String ngayHetHan, int ngayBaoHanh) {
		super();
		MaHang = maHang;
		TenHang = tenHang;
		SoLuong = soLuong;
		DonGia = donGia;
		SoLuongTonKho = soLuongTonKho;
		NgaySanXuat = ngaySanXuat;
		NgayHetHan = ngayHetHan;
		NgayBaoHanh = ngayBaoHanh;
	}
	
	
	public void RandomMatHang() {
		Random ran = new Random();
		loaiMatHang =1 + ran.nextInt(2);
		RandomThongTinNgauNhien rd = new RandomThongTinNgauNhien();
		this.MaHang= rd.getMaHang();
		int luachon = 1 + ran.nextInt(2);
		if(luachon == 1) {
			this.TenHang = rd.getDienMay(luachon);
			
		} else {
			this.TenHang = "HangThucPham";
		}
	}
	
	
}
