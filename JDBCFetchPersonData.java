package Basic_Anudip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class JDBCFetchPersonData {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/anudipfoundation"; // Change database name
		String user = "root"; // Change to your MySQL username
		String password = "security"; // Change to your MySQL password

		try (Connection conn = DriverManager.getConnection(url, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM person")) {

			while (rs.next()) {
				int id = rs.getInt("person_id");
				String name = rs.getString("name");
				int age = rs.getInt("age");

				System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
