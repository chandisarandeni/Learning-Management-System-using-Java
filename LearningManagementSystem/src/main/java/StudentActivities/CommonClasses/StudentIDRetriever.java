package StudentActivities.CommonClasses;

import java.sql.*;

public class StudentIDRetriever {

    public static String getStudentIDByEmail(String studentEmail) {
        String studentID = null;
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT studentID FROM Student WHERE studentEmail = ?";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentEmail); // Set the studentEmail in the query
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                studentID = rs.getString("studentID"); // Retrieve the studentID
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return studentID; // Return the studentID (or null if not found)
    }
}
