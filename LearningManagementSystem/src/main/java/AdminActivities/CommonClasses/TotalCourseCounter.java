/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;

public class TotalCourseCounter {

    public static int getTotalCourses() {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";
        String query = "SELECT COUNT(*) FROM Course";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                return rs.getInt(1); // Retrieve the course count
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Return 0 if there is an error or no courses
    }
}
