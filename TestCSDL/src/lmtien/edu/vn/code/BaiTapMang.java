package lmtien.edu.vn.code;

import java.util.Random;

public class BaiTapMang {
	public String layTenNgauNhien() {
		String []ho = new String[]{"Le", "Nguyen", "Tran", "Van", "Giao"};
		String []tenDem = new String[] {"Minh", "Duc", "Bao", "Thi"};
		String []ten = new String[] {"Tien", "Hai", "Tuan", "Son", "Lam"};
		
		Random rd = new Random();
		String h = ho[rd.nextInt(ho.length)];
		String d = tenDem[rd.nextInt(tenDem.length)];
		String t = ten[rd.nextInt(ten.length)];
		
		return h + " " + d + " " + t;
	}
}
