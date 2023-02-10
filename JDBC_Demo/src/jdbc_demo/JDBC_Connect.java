package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connect {
	public JDBC_Connect() {
		java.security.Security.setProperty("networkaddress.cache.ttl" , "0");
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","rajarshi","Oracle_1");
			final String DB_URL="jdbc:oracle:thin:@(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.ap-mumbai-1.oraclecloud.com))(connect_data=(service_name=g8620312940b1f9_db1_high.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes)))";
			Connection con = DriverManager.getConnection(DB_URL,"ADMIN","Oracle_1@123");
			Statement smt=con.createStatement();
			smt.executeUpdate("CREATE TABLE EMP(ENO NUMBER,ENAME VARCHAR(20),ESAL NUMBER)");
//			boolean out = smt.execute("SELECT * FROM EMPLOYEE");
//			smt.getResultSet();
			smt.execute("create user rajarshi identified by Oracle_1");
			smt.execute("grant all privileges to rajarshi");
			System.out.println("Connection");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
