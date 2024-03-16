package lmtien.java.code.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import lmtien.java.model.KhachHang;

public class TextFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter buf = new BufferedWriter(osw);
			
			for (KhachHang kh: dsKH) {
				String Line = kh.getMaKH() + ";" + kh.getTenKH();
				buf.write(Line);
				buf.newLine();
			}
			
			buf.close();
			osw.close();
			fos.close();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static ArrayList<KhachHang> docFile(String path) {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader bur = new BufferedReader(isr);
			
			String line = bur.readLine();
			while(line != null) {
				String []arr = line.split(";");	
				if(arr.length == 2) {
					dsKH.add(new KhachHang(arr[0], arr[1]));
				}
				
				line = bur.readLine();
				
			}
			
			bur.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dsKH;
	}
}
