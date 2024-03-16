package lmtien.java.code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomThongTinNgauNhien {
	public static Random rd = new Random();
	public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public String getMaHang(){
		int x = 65 + rd.nextInt(90 - 65 + 1);
		int y = 65 + rd.nextInt(90 - 65 + 1);
		int  z =65 + rd.nextInt(90 - 65 + 1);
		
		
		String s = (char)x + "" + (char)y + "" +(char)z;
		
		return s;
	}
	
	
	public String getNgaySanXuatHoacNgayHetHan(String date1, String date2) {
		
		try {
			Date d2 = sdf.parse(date2);
			Date d1 = sdf.parse(date1);
			
				
				while(true) {
					long t = rd.nextLong();
					if(t >= d1.getTime() && t <= d2.getTime()) {
						Date x = new Date(t);
						return sdf.format(x);
					}
				}
				
				

			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getDienMay(int x) {
		if(x == 1) {
			String []dienMay = new String[] {"May Tinh", "May Giat", "Dieu Hoa", "Quat Dien"};
			
			return dienMay[rd.nextInt(dienMay.length)];
		} 
		
			String []thucPham = new String [] {"My Tom", "Trai Cay", "Banh Keo", "Nuoc Ngot"};

			
		return thucPham[rd.nextInt(thucPham.length)];
		
		
	}
}
