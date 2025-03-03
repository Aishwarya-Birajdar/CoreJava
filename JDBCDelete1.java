package Basic_Anudip;

import java.sql.*;

public class JDBCDelete1 {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/anudipfoundation";
		String user = "root";
		String password = "security";

		String deleteSQL = "DELETE FROM person WHERE person_id = ?";

		try (Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {

			pstmt.setInt(1, 3); // Delete where person_id = 3

			int rowsDeleted = pstmt.executeUpdate();
			System.out.println(rowsDeleted + " row(s) deleted successfully!");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}




		