package lmtien.java.code;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Main {
	
	
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		// 0 1 2 3 4
		for (int i = 1; i <= 5; i++) {
			arr.add(i);
		}
		System.out.println(arr.size());
		
		System.out.println(arr.lastIndexOf(5));
		arr.add(1, 100);
		for (int x : arr) {
			System.out.println(x);
		}
	
		System.out.println(arr.contains(500));
		arr.sort(null);
		for (int x: arr) {
			System.out.println(x);
		}
		for (int i = 0 ;i  < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
