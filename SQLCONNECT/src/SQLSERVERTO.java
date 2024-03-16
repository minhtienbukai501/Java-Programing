import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;

public class SQLSERVERTO {
	public static void main(String[] args) {
		Connection con;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://MINHTIEN:1433;DatabaseName=QuanLySinhVien;encrypt=true;trustServerCertificate=true;";
			String user = "sa";
			String password = "123456";
			
			try {
				con = DriverManager.getConnection(url, user, password);
				String sql = "select  * from SinhVien";
				PreparedStatement pre = con.prepareStatement(sql);
				ResultSet rs = pre.executeQuery();
				int x = 1;
				while(rs.next()) {
					System.out.println("\n\t-------SINH VIEN THU " + x + "-------");
					System.out.println("Ma Sinh Vien: " + rs.getNString(1));
					System.out.println("Ten Sinh Vien: " + rs.getNString(2));
					System.out.println("Ngay Sinh: " + rs.getString(3));
					System.out.println("Dia Chi: " + rs.getNString(4));
					x++;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		
		}
		
	}
}
