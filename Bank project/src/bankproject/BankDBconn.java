package bankproject;
import java.sql.*;
public class BankDBconn {
	Connection c;
	Statement s;
	public BankDBconn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "db8831");
			s = c.createStatement();
			}catch (Exception e) {
				System.out.println(e);
			}
	}

}
