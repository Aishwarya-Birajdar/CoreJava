package Basic_Anudip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection1 {

	public static void main(String[] args) {

		try {
			// 1. Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create connection
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudipfoundation", "root", "security");
			System.out.println(con);
			// 3. Create Statement
			Statement stmt = con.createStatement();
			// 4. Execute queries
			ResultSet rs = stmt.executeQuery("select * from person");
			while(rs.next()) 
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}


		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
