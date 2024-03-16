import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar  cal  =Calendar.getInstance(); // các method tĩnh
		/*
		 * int nam = cal.get(Calendar.YEAR); System.out.println("Nam nay la nam: " +
		 * nam); int thang = cal.get(Calendar.MONTH); System.out.println("Thang: " +
		 * (thang +1));
		 * 
		 * int ngay = cal.get(Calendar.DAY_OF_MONTH); System.out.println("Ngay: " +
		 * ngay);
		 */
		
		
		/*
		 * SimpleDateFormat smp = new SimpleDateFormat("dd/MM/yyyy"); String s=
		 * "06/01/2000"; try { Date t =smp.parse(s); System.out.println(smp.format(t));
		 * 
		 * } catch (ParseException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		DecimalFormat dcf = new DecimalFormat("#.##");
		double dToan = 6;
		double dLy = 6;
		double dHoa = 8;
		double dtb = (dToan + dLy+ dHoa) / 3;
		
		System.out.println("Diem Trung Binh = " + dcf.format(dtb));
	}

}
