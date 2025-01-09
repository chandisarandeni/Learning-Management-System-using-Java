package StudentActivities.CommonClasses;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentCourseContentLoader {

    public static void loadCourseContent(JTable table, String studentID) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database details
        String user = "root";
        String password = "";
        String query = "SELECT s.subjectName, s.subjectStatus "
                     + "FROM Subject s "
                     + "JOIN Course c ON s.courseID = c.courseID "
                     + "JOIN Student st ON c.courseID = st.courseID "
                     + "WHERE st.studentID = ?";

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentID); // Set studentID in the query
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                String subjectStatus = rs.getString("subjectStatus");

                model.addRow(new Object[]{subjectName, subjectStatus});
            }

            rs.close();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
