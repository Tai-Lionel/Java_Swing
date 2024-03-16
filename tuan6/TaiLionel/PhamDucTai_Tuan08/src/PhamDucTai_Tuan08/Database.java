package PhamDucTai_Tuan08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<SinhVien> danhSachSinhVien;
	private List<LopHoc> danhSachLopHoc;
	
	public Database() {
		danhSachSinhVien = new ArrayList<SinhVien>();
		danhSachLopHoc = new ArrayList<LopHoc>();

		Connection con = null;
		try {
			String url = "jdbc:sqlserver://localhost:1433;databasename=University";
			String username = "sa";
			String password = "sapassword";
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully Connected!!!");
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("Select * from Lophoc");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public static void main(String[] args) {
		new Database();
	}
}
