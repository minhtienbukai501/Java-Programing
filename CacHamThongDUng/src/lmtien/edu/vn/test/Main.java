package lmtien.edu.vn.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		String s = "06/01/2000";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();		
		Date t = cal.getTime();
		System.out.println(sdf.format(t));
		
	}

}
