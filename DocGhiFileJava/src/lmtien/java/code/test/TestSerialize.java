package lmtien.java.code.test;

import java.util.ArrayList;

import lmtien.java.code.io.SerrializeFileFactory;
import lmtien.java.code.io.TextFileFactory;
import lmtien.java.model.KhachHang;

public class TestSerialize {
	public static void testLuuFile() {
		ArrayList<KhachHang> dsKH = new ArrayList<>();
		dsKH.add(new KhachHang("KH01", "Le Minh Tien"));
		dsKH.add(new KhachHang("KH02", "Nguyen Viet Hai"));
		dsKH.add(new KhachHang("KH03", "Nguyen Son"));
		dsKH.add(new KhachHang("KH02", "Truong Cong Tuan"));
		
		boolean checkLuuFile = SerrializeFileFactory.luuFile(dsKH, "fileKhachHang.txt");
		
		if(checkLuuFile == true) {
			System.out.println("Luu FIle Thanh Cong");
		} else {
			System.out.println("FAIL");
		}
	}
	public static void main(String[] args) {
		
	}

}
