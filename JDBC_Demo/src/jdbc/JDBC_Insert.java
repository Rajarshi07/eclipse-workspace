package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Insert {

	public JDBC_Insert() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","rajarshi","Oracle_1");
			PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true) {
				try {
					System.out.print("Emp Id: ");
					int eno = Integer.parseInt(br.readLine());
					System.out.print("Name: ");
					String ename = br.readLine();
					System.out.print("Salary: ");
					double esal = Double.parseDouble(br.readLine());
					psmt.setInt(1, eno);
					psmt.setString(2, ename);
					psmt.setDouble(3, esal);
					int count = psmt.executeUpdate();
					if(count>0)System.out.println("record inserted");
					else System.out.println("No record inserted");
					System.out.print("Do you want to insert more records?(Yes/No)  ");
					
					String choice=br.readLine();
					if(choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N"))break;
				} catch (NumberFormatException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Program end...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
