package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_delete {

	public JDBC_delete() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","rajarshi","Oracle_1");
			Statement smt = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter eno for deletion: ");
			int ENO = Integer.parseInt(br.readLine());
			
			int count  = smt.executeUpdate("DELETE FROM EMP WHERE ENO="+ENO);
			if(count>0)System.out.println("record deleted");
			else System.out.println("No record found");
			
			
			System.out.println("Program end...");
		} catch (ClassNotFoundException | SQLException | NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
