package lmtien.code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		try {
			ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
			Scanner scan = new Scanner(System.in);
			Path path = Path.of("data.txt");
			List<String> arr = Files.readAllLines(path);
			for (String s : arr) {
				String []sv = s.split(",");
				dsSinhVien.add(new SinhVien(sv[0], sv[1]));
			}
			
			for (SinhVien sv: dsSinhVien) {
				System.out.println(sv);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
