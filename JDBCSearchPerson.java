package Basic_Anudip;

import java.sql.*;
public class JDBCSearchPerson {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/anudipfoundation";
		String user = "root";
		String password = "security";

		String searchSQL = "SELECT * FROM person WHERE name = ?";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {

			pstmt.setString(1, "raj"); // Searching for raj
			ResultSet rs = pstmt.executeQuery();

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
