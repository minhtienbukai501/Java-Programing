package lmtien.edu.vn.code;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import lmtien.edu.data.driver.MySQLDriver;
import lmtien.edu.data.model.SinhVien;

public class MainTest {
	
	
	
	public static Scanner scan = new Scanner(System.in);
	public static String layTen() {
		Random rd = new Random();
		String []ho = new String[]{"Le", "Nguyen", "Tran", "Van", "Giao"};
		String []tenDem = new String[] {"Minh", "Duc", "Bao", "Thi"};
		String []ten = new String[] {"Tien", "Hai", "Tuan", "Son", "Lam"};
		
		
		String h = ho[rd.nextInt(ho.length)];
		String d = tenDem[rd.nextInt(tenDem.length)];
		String t = ten[rd.nextInt(ten.length)];
		
		return h + " " + d + " " + t;
	}
	
	public static String getMa() {
		Random rd = new Random();
		String ma = "22T102";
		// 100000 - 999999
		int masau = 100000 + rd.nextInt(999999 - 100000 + 1);
		String s = String.valueOf(masau);
		
		return ma + masau;
	}
	
	public static void main(String[] args) {
		int n = 10;
		ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		for(int i = 0; i < n; i++) {
			dsSinhVien.add(new SinhVien(getMa(), layTen()));
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("output.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for (SinhVien x: dsSinhVien) {
				String line = x.getMaSV() + ";" + x.getTenSV();
				try {
					bw.write(line);
					bw.newLine();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			try {
				bw.close();
				osw.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
