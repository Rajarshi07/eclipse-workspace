package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connect {

	public JDBC_Connect() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","rajarshi","Oracle_1");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","rajarshi","Oracle_1");
			Statement smt=con.createStatement();
			smt.executeUpdate("CREATE TABLE EMP(ENO NUMBER,ENAME VARCHAR(20),ESAL NUMBER)");
//			boolean out = smt.execute("SELECT * FROM EMPLOYEE");
//			smt.getResultSet();
//			smt.execute("create user rajarshi identified by Oracle_1");
//			smt.execute("grant all privileges to rajarshi");
			System.out.println("Connection");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
