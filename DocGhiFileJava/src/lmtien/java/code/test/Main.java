package lmtien.java.code.test;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

import lmtien.java.code.io.TextFileFactory;
import lmtien.java.model.KhachHang;

public class Main {


	public static void khoiTao(ArrayList<KhachHang> dsKH) {
		
		dsKH.add(new KhachHang("KH01", "Le Minh Tien"));
		dsKH.add(new KhachHang("KH02", "Nguyen Viet Hai"));
		dsKH.add(new KhachHang("KH03", "Nguyen Son"));
		dsKH.add(new KhachHang("KH02", "Truong Cong Tuan"));
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		khoiTao(dsKH);
		
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (KhachHang x: dsKH) {
				String Line = x.getMaKH() + ";" + x.getTenKH();
				
				
					bw.write(Line);
					bw.newLine();
			
			}
			
			bw.close();
			osw.close();
			fos.close();
			

		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			e.printStackTrace();
			System.out.println("That bai");
		}
		
		
		
		
	}

}
