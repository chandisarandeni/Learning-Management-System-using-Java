/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;

public class LecturerCount {

    public static int getTotalLecturers() {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";
        String query = "SELECT COUNT(*) FROM Lecturer";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                return rs.getInt(1);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
