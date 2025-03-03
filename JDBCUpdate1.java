package Basic_Anudip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate1 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/anudipfoundation";
		String user = "root";
		String password = "security";

		String updateSQL = "UPDATE person SET age = ? WHERE person_id = ?";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {

			pstmt.setInt(1, 30); // New age
			pstmt.setInt(2, 1);  // Update where person_id = 1

			int rowsUpdated = pstmt.executeUpdate();
			System.out.println(rowsUpdated + " row(s) updated successfully!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}




