package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
		
		for (int i = 0; i  <n; i++) {
			String masv = scan.nextLine();
			String ten = scan.nextLine();
			String lop = scan.nextLine();
			double gpa = Double.parseDouble(scan.nextLine());
			dsSinhVien.add(new SinhVien(masv,ten, lop, gpa));
		}
		
		// anonymous inner class
		
		// sort 
		Collections.sort(dsSinhVien, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getGpa() < o2.getGpa())
					return -1;
				
				return 0;
			}
			
		});
		
		for(SinhVien x : dsSinhVien) {
			System.out.println(x);
		}
	}

}
