/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminActivities.CommonClasses;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SubjectDataRetriever {

    public static void loadSubjectData(JTable table) {
        String url = "jdbc:mysql://localhost:3306/LMS"; // Update with your database connection details
        String user = "root";
        String password = "";
        String query = "SELECT subjectName, creditCount, subjectStatus FROM Subject";

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Clear existing rows

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String subjectName = rs.getString("subjectName");
                int creditCount = rs.getInt("creditCount");
                String subjectStatus = rs.getString("subjectStatus");

                model.addRow(new Object[]{subjectName, creditCount, subjectStatus});
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
