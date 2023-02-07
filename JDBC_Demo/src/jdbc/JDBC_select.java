package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_select {

	public JDBC_select() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","rajarshi","Oracle_1");
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("SELECT * FROM EMP");
			while(rs.next()) {
				System.out.println("eNo: "+rs.getInt(1)+"\nName: "+rs.getString(2)+"\nSalary: "+rs.getDouble(3));
			}
			
			System.out.println("Program end...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
