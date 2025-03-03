package Basic_Anudip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/anudipfoundation";
		String user = "root";
		String password = "security";

		String insertSQL = "INSERT INTO person (person_id, name, age) VALUES (?, ?, ?)";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

			pstmt.setInt(1, 4);
			pstmt.setString(2, "Amit");
			pstmt.setInt(3, 25);

			int rowsInserted = pstmt.executeUpdate();
			System.out.println(rowsInserted + " row(s) inserted successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}




