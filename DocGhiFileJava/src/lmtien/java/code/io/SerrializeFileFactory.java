package lmtien.java.code.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import lmtien.java.model.KhachHang;

public class SerrializeFileFactory {
	public static boolean luuFile(ArrayList<KhachHang> dsKH, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dsKH);
			oos.close();
			fos.close();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public static ArrayList<KhachHang> docFile( String path) {
		ArrayList<KhachHang> dsKh = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object data = ois.readObject();
			dsKh = (ArrayList<KhachHang>)data;
			ois.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dsKh;
	}
}
